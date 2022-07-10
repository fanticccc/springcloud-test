package com.exc.song.utils;

import com.exc.song.config.rocketmq.RocketMqConfig;
import com.exc.song.config.rocketmq.RocketMqProperties;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListener;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author YSTen_SongJunBao
 * @Description:
 * @Date 2022/5/16 16:36
 * @Version 1.0
 * com.exc.song.utils
 */
@Slf4j
@Service
public class MqConsumer {

    public void onMessage(String message) throws MQClientException {
        System.out.println(message);
    }
}
