package com.exc.song.test;

import lombok.Data;

/**
 * @Author YSTen_SongJunBao
 * @Description:
 * @Date 2022/4/10 17:30
 * @Version 1.0
 * com.exc.song.test
 */

public class MyThread extends Thread{

    public final static ThreadLocal<String> threadLocal = new ThreadLocal() ;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("name=="+Thread.currentThread().getName());
        }
    }
}
