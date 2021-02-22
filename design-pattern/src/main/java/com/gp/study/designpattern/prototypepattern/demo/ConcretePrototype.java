package com.gp.study.designpattern.prototypepattern.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.lang.reflect.Field;
import java.util.List;

/**
 * 实现jdk提供的Cloneable接口
 * 克隆方式为浅克隆，引用对象仍然指向原来的对象
 * <p>
 * 通过序列化于反序列化实现深克隆
 * <p>
 * 使用jackson工具包
 * <p>
 * 浅克隆与深复制的区别：
 * 浅克隆的引用类型的成员变量是引用地址，原对象和新对象都指向内存中的同一个对象
 * 深克隆的引用类型的成员变量生成的是一个新的对象
 */
@Getter
@Setter
public class ConcretePrototype implements Cloneable, Serializable {
    private String name;
    private int age;
    private List<String> hobbies;

    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ConcretePrototype reflectClone() {
        try {
            ConcretePrototype prototype = new ConcretePrototype();
            Field[] declaredFields = this.getClass().getDeclaredFields();
            for (Field field : declaredFields) {
                field.setAccessible(true);
                field.set(prototype, field.get(this));
            }
            return prototype;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ConcretePrototype deepClone() {
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos);) {
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return (ConcretePrototype) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public ConcretePrototype jacksonClone() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(this);
            return mapper.readValue(json, new TypeReference<ConcretePrototype>() {
            });
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }

    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(18);
        concretePrototype.setName("AA");
        ConcretePrototype prototype1 = concretePrototype.reflectClone();
        concretePrototype.setName("BB");
        System.out.println(prototype1);
        System.out.println(concretePrototype);
    }
}
