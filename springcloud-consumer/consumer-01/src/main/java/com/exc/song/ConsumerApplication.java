package com.exc.song;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 * @Author SongJunBao
 * @Description:
 * @Date 2022/2/21 16:12
 * @Version 1.0
 * com.exc.song
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@Slf4j
public class ConsumerApplication {
    public static void main(String[] args) {

        SpringApplication.run(ConsumerApplication.class, args);
       log.info("Method:ConsumerApplication,run ============= ConsumerServer starting success ============");
    }
    @Bean
    RestTemplate restTemplate (){
        return new RestTemplate();
    }
}
