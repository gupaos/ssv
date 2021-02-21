package com.gp.study.designpattern.singletonPattern;

public class InnerClassSingleton {
    private InnerClassSingleton() {
        // 防止反射调用构造方法
        if (InnerClass.INSTANCE != null) {
            throw new RuntimeException("非法操作");
        }
    }

    public static InnerClassSingleton getInstance() {
        return InnerClass.INSTANCE;
    }

    //利用java本身的语法特点，内部类默认不加载
    private static class InnerClass {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();

    }

    //防止反序列化生成单例对象
    private Object readResolve() {
        return InnerClass.INSTANCE;
    }
}
