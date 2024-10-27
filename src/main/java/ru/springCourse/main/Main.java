package ru.springCourse.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-app-config.xml");
        Music testBean = context.getBean(Music.class);
        MusicPlayer player = new MusicPlayer(testBean);
        player.play();
        context.close();
    }
}