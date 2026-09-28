
/**
 * Generate three random numbers ranging up to 1000, and gives one star per hundered.
 *
 * @author Luis Castillo
 * @version V1.0
 * @date 9/27/2026
 */
import java.util.Random;
public class BarChart
{
    public static void main(String[] args){
        Random rand = new Random();
        
        int num1 = rand.nextInt(1000);
        int num2 = rand.nextInt(1000);
        int num3 = rand.nextInt(1000);
        
        System.out.println("Number 1 is: " + num1);
        System.out.println("Number 2 is: " + num2);
        System.out.println("Number 3 is: " + num3);
        System.out.println();
        
        System.out.println("NUMBER BAR CHART");
        printBar(1, num1);
        printBar(2, num2);
        printBar(3, num3);
    }
    public static void printBar(int label, int number) {
        System.out.print("Number " + label + ": ");
        
        int stars = number / 100;
        
        if (stars == 0) {
            System.out.println("<100 no stars");
        } else {
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}