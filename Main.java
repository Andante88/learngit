package com.qcm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
        Student student=(Student) context.getBean("student");
        System.out.println("Name:"+student.getName());
        System.out.println("Age:"+student.getAge());
        System.out.println("我修改了这个文件");
        System.out.println("git版本库里有一个临时区");
        //不会还有人用SVN吧
    }
}
