package com.exc.song.test;

/**
 * @Author SongJunBao
 * @Description:
 * @Date 2022/4/10 17:32
 * @Version 1.0
 * com.exc.song.test
 */

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("name=="+Thread.currentThread().getName());
        MyThread thread = new MyThread();
        thread.start();
        new Thread(new Task()).start();
    }
}
