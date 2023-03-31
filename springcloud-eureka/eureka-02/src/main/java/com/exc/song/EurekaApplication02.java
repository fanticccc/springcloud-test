package com.exc.song;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author YSTen_SongJunBao
 * @Description:
 * @Date 2022/2/21 17:25
 * @Version 1.0
 * com.exc.song
 */
@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaApplication02 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication02.class, args);
        log.info("Method:EurekaApplication-2,run ============= starting success ============");

    }
}
