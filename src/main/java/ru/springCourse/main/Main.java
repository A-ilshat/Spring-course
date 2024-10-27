package ru.springCourse.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-app-config.xml");
        MusicPlayer player = context.getBean(MusicPlayer.class);
        player.play();

        System.out.println(player.getName() + " : " + player.getVolume());
        context.close();
    }
}