import java.util.Random;
//
public class Task7Composition {
    public static void main(String[] args) {

        int pointA = getPoint(); //инициализация точки А
        int pointB = getPoint(); //инициализация В
        int stepH = calculateStep(pointA,pointB); //вычисление шага H
        int min = Math.min(pointA, pointB);//установка начала отрезка
        int max = Math.max(pointA, pointB); //установка конца отрезка
        showTopOfTheTable(min,max,stepH); //вывод шапки таблицы
        while ((min+stepH)<=max) {
            double x = calculateX(min); //вычисление F(x)
            min += stepH;
            printNewLine(min,x); //вывод очередной строки таблицы
        }
    }

    static int getPoint() {
        Random random = new Random();
        return random.nextInt(91)+10;
    }

    static int calculateStep(int pointA, int pointB) {
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

    static double calculateX(int min){
        return (Math.pow(Math.sin(min),2) - Math.pow(Math.cos(min),2));
    }

    static void showTopOfTheTable(int min, int max, int stepH) {
        System.out.printf("\ta = [%d]; b = [%d]; h = [%d] \n", min,max,stepH);
        System.out.println("-----------------|------------------|");
    }
    static void printNewLine(int min, double x) {
        System.out.printf("  arg =[%d] \t |\t x =[%.3f] \t| \n", min,x);
        System.out.println("-----------------|------------------|");
    }
}

