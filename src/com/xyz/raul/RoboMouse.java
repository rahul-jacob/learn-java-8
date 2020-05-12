package com.xyz.raul;
import java.awt.Robot;
import java.util.Random;

public class RoboMouse {

    public static final int FIVE_SECONDS = 13000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 800;

    public static void main(String... args) throws Exception {
    	System.out.println("Ready....");
        Robot robot = new Robot();
        Random random = new Random();
        while (true) {
        	int point = (int)(Math.random() * 10) + 1;
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            System.out.println(FIVE_SECONDS - (point*1000));
            Thread.sleep(FIVE_SECONDS - (point*1000));
        }
    }

}



