package com.exc.song;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author YSTen_SongJunBao
 * @Description:
 * @Date 2022/2/21 16:33
 * @Version 1.0
 * com.exc
 */
@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaApplication01 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication01.class, args);
        log.info("Method:EurekaApplication-1 : run ============= starting success ============");
    }
}
