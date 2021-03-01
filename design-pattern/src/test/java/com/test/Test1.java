package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static volatile int a = 0;
    public static volatile List list = new ArrayList();
    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            while (true) {
                //感受不到变化
                if(list.size() == 1){
                    System.out.println("====");
                    return;
                }
            }

        }).start();
        TimeUnit.SECONDS.sleep(1);
        new Thread(() -> {
            list.add(1);
            System.out.println("添加一个元素" + list.size());
            a = 1;
        }).start();
        TimeUnit.SECONDS.sleep(100);
    }
}
