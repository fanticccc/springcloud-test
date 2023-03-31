package com.exc.song.controller;

import com.exc.song.client.TestClient;
import com.exc.song.test.MyThread;
import com.exc.song.utils.MqPublisher;
import com.google.inject.internal.cglib.reflect.$FastMember;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author YSTen_SongJunBao
 * @Description:
 * @Date 2022/2/21 16:11
 * @Version 1.0
 * com.exc.song.controller
 */
@Slf4j
@RequestMapping("/consumer")
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private MqPublisher publisher;

    @Resource
    private TestClient testClient;

    @GetMapping("/getMsg")
    public String getData(String name) {
        List<ServiceInstance> severList = discoveryClient.getInstances("provider-01");
        System.out.println(severList.toString());
        /**
         * 自定义负载均衡
         */
        int serverIndex = ThreadLocalRandom.current().nextInt(severList.size());
        ServiceInstance instance = severList.get(serverIndex);
        String host = instance.getHost();
        int port = instance.getPort();
        String s = restTemplate.getForObject("http://" + host + ":" + port + "/provider/offer?name={1}", String.class, name);
        log.info("Method: ConsumerController message :{}", s);
        return s;
    }

    @GetMapping("/getMsg2")
    public String getData2(String str) {
        String s = testClient.offerData() + "()" + str;
        return s;
    }

    /**
     * 测试发送MQ
     *
     * @param str
     */
    @GetMapping("/send")
    public void sendMsg(String str) {
        publisher.send(str);
    }

    @PostMapping("consumerMsg")
    public void getConsumer() {

    }

    public static void main(String[] args) {
        System.out.println("value =" + MyThread.threadLocal.get());
        List<List<Integer>> list0 = new ArrayList<>();
        Integer[] arr1 = {1, 3, 5};
        Integer[] arr2 = {2, 3, 5};
        Integer[] arr3 = {4, 3, 5};
        List<Integer> list1 = Arrays.asList(arr1);
        List list11 = new ArrayList(list1);
        List<Integer> list2 = Arrays.asList(arr2);
        List list22 = new ArrayList(list2);
        List<Integer> list3 = Arrays.asList(arr3);
        List list33 = new ArrayList(list3);
        list0.add(list11);
        list0.add(list22);
        list0.add(list33);
        List<Integer> list = retainElementList(list0);
        System.out.println("list : " + list.toString());
    }

    public static List<Integer> retainElementList(List<List<Integer>> elementLists) {
        Optional<List<Integer>> result = elementLists.parallelStream()
                .filter(elementList -> elementList != null && ((List) elementList).size() != 0)
                .reduce((a, b) -> {
                    a.retainAll(b);
                    return a;
                });
        return result.orElse(new ArrayList<>());
    }
}
