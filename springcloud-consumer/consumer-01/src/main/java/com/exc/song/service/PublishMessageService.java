package com.exc.song.service;

/**
 * @Author song
 * @Description:
 * @Date 2022/4/1 10:46
 * @Version 1.0
 *com.exc.song.service
 */

public interface PublishMessageService {
    /**
     * 发送钉钉消息
     * @param content
     * @param atMobile
     */
    void sendToDingDingInfo(String content, String atMobile);
}
