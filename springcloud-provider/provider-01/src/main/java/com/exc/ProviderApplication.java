package com.exc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author YSTen_SongJunBao
 * @Description: 生产者启动类
 * @Date 2022/2/21 15:57
 * @Version 1.0
 * com.exc
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@Slf4j
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
        log.info("Method:ProviderApplication : run ============= Provider Server starting success ============");



    }
}
