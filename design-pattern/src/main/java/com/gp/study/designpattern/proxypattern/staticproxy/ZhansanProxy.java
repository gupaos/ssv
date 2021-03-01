package com.gp.study.designpattern.proxypattern.staticproxy;

public class ZhansanProxy extends ZhangSan {
    @Override
    public void findLove() {
        System.out.println("张老三开始物色");
        super.findLove();
        System.out.println("开始交往");
    }
}
