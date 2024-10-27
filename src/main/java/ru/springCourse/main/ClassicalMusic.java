package ru.springCourse.main;

import sun.plugin2.os.windows.Windows;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Play classical music";
    }

    public void doInit() {
        System.out.print("init... ");
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.print(i + " ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void doDestroy() {
        System.out.print("Destroy... ");
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.print(i + " ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}