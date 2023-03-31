package com.exc.song.utils;

import com.exc.song.config.rocketmq.RocketMqProperties;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

/**
 * @Author YSTen_SongJunBao
 * @Description:
 * @Date 2022/5/16 17:09
 * @Version 1.0
 * com.exc.song.utils
 */
@Slf4j
public class TestConsumer {
    public static void main(String[] args) throws MQClientException {
        // 1.创建消费者consumer，指定消费者组名
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("ROCKETMQ_SONG_TOPIC");
        // 2.指定Nameserver地址
        consumer.setNamesrvAddr("127.0.0.1:9876");
        // 设置超时
        consumer.setConsumeTimeout(15000);
        // 3.订阅主题topic和tag
        consumer.subscribe("ROCKETMQ_SONG_TOPIC", "tag1");
        // 4.设置回调函数,处理消息
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            // 接收消息内容
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgList, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                for (MessageExt msg : msgList) {
                    log.info("接收到的消息：{}", new String(msg.getBody()));
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        // 5.启动消费者consumer
        consumer.start();
        log.info("consumer test start !");
    }
}
