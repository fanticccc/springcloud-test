package com.exc.song.controller;

import com.exc.song.service.PublishMessageService;
import com.exc.song.utils.DingTalkUtil;
import com.exc.song.utils.MqPublisher;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @Author YSTen_SongJunBao
 * @Description:
 * @Date 2022/4/8 17:36
 * @Version 1.0
 * com.exc.song.controller
 */
@RequestMapping("ding")
@RestController
public class DingTalkTestController {

@Autowired
private PublishMessageService publishMessageService ;

    @GetMapping("talk")
    public String talk(String str){
        return DingTalkUtil.taskLa("发送消息："+str);
    }

    @GetMapping("send1")
    public void sendMsg1(String str){
         DingTalkUtil.send("ding测试消息1:"+str,null);
    }

    @GetMapping("send2")
    public void sendMsg2(String str){
        publishMessageService.sendToDingDingInfo("ding测试消息2:"+str,null);
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);

        }
        HashMap<String,String> map = new HashMap<>();
        Map<String, String> map1 = Collections.synchronizedMap(map);


    }

}
