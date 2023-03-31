package com.exc.song.test;

/**
 * @Author YSTen_SongJunBao
 * @Description:
 * @Date 2022/4/10 17:44
 * @Version 1.0
 * com.exc.song.test
 */

public class Task implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("Task Thread ");
        System.out.println(Thread.currentThread().getName() + "->do task ...");
    }
}
