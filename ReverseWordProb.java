
/**
 * A program that moves the first letter to the end and spells out the result backwards
 * to see if the word gets spelled the same.
 * @author Luis Castillo
 * @version V1.0
 * @date 9/27/2026
 */
import java.util.Scanner;
public class ReverseWordProb
{
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        String again;
        
        do {
            System.out.print("Enter words separated by a space ending with the word quit: ");
            String line = Keyboard.nextLine();
            Scanner words = new Scanner(line);
            
            boolean quit = false;
            while (!quit && words.hasNext()) {
                String word = words.next();
                
                if (word.equals("quit")) {
                    quit = true;
                } else {
                    String moved = word.substring(1) + word.charAt(0);
                    
                    String backwards = "";
                    for (int i = moved.length() - 1; i >= 0; i--) {
                        backwards += moved.charAt(i);
                    }
                    if (backwards.equals(word)) {
                        System.out.println(word + " works");
                    } else {
                        System.out.println(word + " does not work");
                    }
                }
            }
            System.out.print("Enter yes to process another line? ");
            again = Keyboard.nextLine();
        } while (again.equalsIgnoreCase("yes"));
        Keyboard.close();
}
}