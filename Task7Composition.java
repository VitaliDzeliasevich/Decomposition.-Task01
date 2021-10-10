package by.epam.training.composition;

import java.util.Random;

public class Task7Composition { /*Составить программу для вычисления значений функции F(x) на отрезке
                                 [a,b] с шагом h. Результат представить в виде таблицы, первый
                                 столбец которой - значения аргумента, второй соответсвующее значение функции.
                                */

        public static void main(String[] args) {

            TableView view = new TableView();
            int pointA = getPoint(); //инициализация точки А
            int pointB = getPoint(); //инициализация В
            int stepH = calculateStep(pointA,pointB); //вычисление шага H
            int arg = Math.min(pointA, pointB); //установка начала отрезка
            int max = Math.max(pointA, pointB); //установка конца отрезка
            view.viewTopOfTheTable(arg,max,stepH); //вывод шапки таблицы
            while (hasNextStep(arg,max)) {
                double function = calculateFunction(arg); //вычисление F(x)
                view.printNewLine(arg,function); //вывод очередной строки таблицы
                arg += stepH;
            }
        }

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

