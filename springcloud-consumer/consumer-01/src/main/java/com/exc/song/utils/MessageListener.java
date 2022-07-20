/*
package com.exc.song.utils;

import com.exc.song.config.rocketmq.RocketMqProperties;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

*/
/**
 * @Author SongJunBao
 * @Description:
 * @Date 2022/5/16 16:42
 * @Version 1.0
 * com.exc.song.utils
 *//*

@Slf4j
//@Service
public class MessageListener implements MessageListenerConcurrently {

    @Autowired
    private RocketMqProperties rocketMqProperties;
    DefaultMQPushConsumer consumer = new DefaultMQPushConsumer();
    @SneakyThrows
    @Override
    public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer();
        consumer.setConsumerGroup(rocketMqProperties.getGdProduceGroup());
        consumer.setNamesrvAddr(rocketMqProperties.getIpPort());
        consumer.subscribe(rocketMqProperties.getTopic(),rocketMqProperties.getGdProduceGroup());
        for (MessageExt msg : msgs) {
            onMessage(Arrays.toString(msg.getBody()));
        }
        consumer.start();
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;

}

    private void onMessage(String message){
        log.info("消息：{}",message);
    }
}
*/
