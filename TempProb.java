
/**
 * A program to translate degrees celsius to fahrenheit and fahrenheit to celsius.
 *
 * @author Luis Castillo
 * @version V1.0
 * @date 9/27/2026
*/
import java.util.Scanner;
public class TempProb
{
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        String again;
        
        do {
            System.out.print("Enter a whole number, a space, and C or F (ie 100 F converts to Cels): ");
            double temp = Keyboard.nextDouble();
            char unit = Keyboard.next().charAt(0);
            
            while (unit != 'f' && unit != 'F' && unit != 'c' && unit != 'C'){
                System.out.print("Enter C to convert to F or vice versa: ");
                unit = Keyboard.next().charAt(0);
            }
            switch (unit) {
                case 'f':
                case 'F':
                    double cels = (temp - 32) * 5.0 / 9.0;
                    System.out.printf("%.1f F = %.1f C%n", temp, cels);
                    break;
                case 'c':
                case 'C':
                    double fahr = temp * 9.0 / 5.0 +32;
                    System.out.printf("%.1f C = %.1f F%n", temp, fahr);
                    break;
            }
            System.out.print("Do you want to calculate another temp? If so, enter yes otherwise no: ");
            again = Keyboard.next().toLowerCase();
            
            switch (again) {
                case "yes":
                case "y":
                    break;
                default:
                    again = "no";
            }
        } while (again.equals("yes") || again.equals("y"));
        
        System.out.println("goodbye!");
        Keyboard.close();
    }
}