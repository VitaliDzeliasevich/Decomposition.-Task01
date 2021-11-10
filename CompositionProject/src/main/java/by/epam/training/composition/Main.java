package by.epam.training.composition;

import by.epam.training.composition.logic.Methods;
import by.epam.training.composition.view.View;

public class Main {             /*Составить программу для вычисления значений функции F(x) на отрезке
                                 [a,b] с шагом h. Результат представить в виде таблицы, первый
                                 столбец которой - значения аргумента, второй соответсвующее значение функции.
                                */

    public static void main(String[] args) {

        int pointA = Methods.getPoint(); //инициализация точки А
        int pointB = Methods.getPoint(); //инициализация В
        int stepH = Methods.calculateStep(pointA,pointB); //вычисление шага H
        int arg = Math.min(pointA, pointB); //установка начала отрезка
        int max = Math.max(pointA, pointB); //установка конца отрезка
        View.viewTopOfTheTable(arg,max,stepH); //вывод шапки таблицы
        while (Methods.hasNextStep(arg,max)) {
            double function = Methods.calculateFunction(arg); //вычисление F(x)
            View.printNewLine(arg,function); //вывод очередной строки таблицы
            arg += stepH;
        }
    }

}
