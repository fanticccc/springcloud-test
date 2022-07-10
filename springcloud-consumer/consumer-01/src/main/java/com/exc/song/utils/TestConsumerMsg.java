package com.exc.song.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

/**
 * @Author YSTen_SongJunBao
 * @Description:
 * @Date 2022/6/14 10:11
 * @Version 1.0
 * com.exc.song.utils
 */
@Slf4j
public class TestConsumerMsg implements MessageListenerConcurrently {
    @Override
    public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
        System.out.println("do something ...");
        for (MessageExt msg : msgs) {
            log.info(msg.toString());
        }
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    }
}
