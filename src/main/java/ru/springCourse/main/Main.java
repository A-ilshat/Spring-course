package ru.springCourse.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-app-config.xml");
        MusicPlayer firstPlayer = context.getBean(MusicPlayer.class);
        System.out.println(firstPlayer.getName() + " : " + firstPlayer.getVolume());
        firstPlayer.play();
        context.close();
    }
}