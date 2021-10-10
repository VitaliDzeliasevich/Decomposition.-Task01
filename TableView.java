package by.epam.training.composition;

public class TableView {

     public void viewTopOfTheTable(int arg, int max, int stepH) {
        System.out.printf("\tA = [%d]; B = [%d]; h = [%d] \n", arg,max,stepH);
        System.out.println("-----------------|------------------|");
    }

     public void printNewLine(int arg, double function) {
        System.out.printf("  arg =[%d] \t |\t x =[%.3f] \t| \n", arg,function);
        System.out.println("-----------------|------------------|");
    }
}
