package com.exc.song.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author SongJunBao
 * @Description:
 * @Date 2022/6/14 10:16
 * @Version 1.0
 * com.exc.song.config
 */
@Data
@Component
@ConfigurationProperties(prefix = "system-parameters.thread-pool")
public class ThreadPoolProperties {
    private int corePoolSize;
    private int maxPoolSize;
    private int keepAliveSeconds;
    private int queueCapactiy;
}
