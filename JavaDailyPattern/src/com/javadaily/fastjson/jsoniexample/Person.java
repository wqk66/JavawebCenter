package com.javadaily.fastjson.jsoniexample;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String id;
    private String name;
    private int age;

    public Person() {

    }

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    static void method1() {
        System.out.println("javabean转化示例程序开始-----");
        Person person = new Person("1", "fastjson", 1);

        //蒋javabean转化为字符串
        String jsonString = JSON.toJSONString(person);
        System.out.println("javabean转换成json："+jsonString);
        Person person1 = JSON.parseObject(jsonString, Person.class);
        System.out.println("jsonStrign转换为javabean:" + person1.getId());
        System.out.println("javabean转化示例程序结束-----");
    }
    static void method2() {
        System.out.println("List<javabean>转化示例开始----------");
        Person person1 = new Person("1","fastjson1",1);
        Person person2 = new Person("2","fastjson2",2);
        List<Person> persons = new ArrayList<Person>();
        persons.add(person1);
        persons.add(person2);
        String jsonString = JSON.toJSONString(persons);
        System.out.println("json字符串:"+jsonString);
        //解析json字符串
        List<Person> persons2 = JSON.parseArray(jsonString,Person.class);
        //输出解析后的person对象，也可以通过调试模式查看persons2的结构
        System.out.println("person1对象："+persons2.get(0).getId());
        System.out.println("person2对象："+persons2.get(1).getId());

        System.out.println("List<javabean>转化示例结束----------");
    }static void method3() {
        System.out.println("javabean转化示例程序-----");
    }


    public static void main(String[] args) {
        method2();
    }

}
