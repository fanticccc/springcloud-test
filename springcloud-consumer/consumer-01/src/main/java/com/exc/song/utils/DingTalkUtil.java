package com.exc.song.utils;

import com.exc.song.service.PublishMessageService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author SongJunBao
 * @Description:
 * @Date 2022/4/8 17:16
 * @Version 1.0
 * com.exc.song.utils
 */

public class DingTalkUtil {

    @Autowired
    private static PublishMessageService publishMessageService ;

    public static void send (String content, String atMobile){
        publishMessageService.sendToDingDingInfo(content,atMobile);
    }

    public static String  taskLa(String str){
        return str ;
        //publishMessageService.sendToDingDingInfo(content,atMobile);
    }

}
