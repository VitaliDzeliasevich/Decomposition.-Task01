package by.epam.training.composition.logic;

import java.util.Random;

public class Methods {

    public static int getPoint() {
        Random random = new Random();
        return random.nextInt(91)+10;
    }

    public static boolean hasNextStep(int arg, int max){
        return arg <= max;
    }

    public static int calculateStep(int pointA, int pointB){
        while (pointA==pointB) {
            pointA = getPoint();
            pointB = getPoint();
        }
        int step = Math.abs((pointA-pointB)/10);
        if (step==0) {
            step++;
        }
        return step;
    }

    public static double calculateFunction(int arg){
        return (Math.pow(Math.sin(arg),2) - Math.pow(Math.cos(arg),2));
    }
}
