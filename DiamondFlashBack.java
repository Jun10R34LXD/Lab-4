
/**
 * Write a description of class DiamondFlashBack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DiamondFlashBack
{
    public static void main(String[] args){
        Scanner Keyboard = new Scanner(System.in);
        
        System.out.print("Enter max width: ");
        int width = Keyboard.nextInt();
        
        if (width % 2 == 0) {
            width++;
        }
        int mid = width / 2;
        for (int line = 0; line <= mid; line++) {
            int spaces = mid - line;
            int stars = 2 * line + 1;
            
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int s = 0; s < stars; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int line = mid -1; line >=0; line --) {
            int spaces = mid - line;
            int stars = 2 * line + 1;
            
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int s = 0; s < stars; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
        Keyboard.close();
    }
}