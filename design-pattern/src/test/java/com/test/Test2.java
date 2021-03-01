package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test2 {
      volatile int a = 0;
      List list = new ArrayList();

    public static void main(String[] args) throws InterruptedException {
        Test2 test2 = new Test2();
        new Thread(() -> {
            while (true) {
                //可以感受到变化
                if(test2.getList().size() == 1){
                    System.out.println("====");
                    return;
                }
            }

        }).start();
        TimeUnit.SECONDS.sleep(1);
        new Thread(() -> {
            test2.getList().add(1);
            System.out.println("添加一个元素");
            test2.setA(1);
        }).start();
        TimeUnit.SECONDS.sleep(100);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
