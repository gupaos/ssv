package com.gp.study.designpattern.proxypattern.staticproxy;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        ZhangLaosan zhangLaosan = new ZhangLaosan(new ZhangSan());
        zhangLaosan.findLove();
    }
}
