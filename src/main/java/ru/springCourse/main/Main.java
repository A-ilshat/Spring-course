package ru.springCourse.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-app-config.xml");
        TestBean testBean = context.getBean(TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }
}