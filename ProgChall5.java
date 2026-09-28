
/**
 * Counts how much of a given letter there is in a phrase provided and then displays it to the user.
 *
 * @author Luis Castillo
 * @version V1.0
 * @date 9/27/2026
 */
import java.util.Scanner;
public class ProgChall5
{
    public static void main(String[] args){
        Scanner Keyboard = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String phrase = Keyboard.nextLine();
        
        System.out.print("Enter the char to be assessed: ");
        String input = Keyboard.nextLine().trim();
        while (input.isEmpty()) {
            System.out.print("Enter the char to be assessed: ");
            input = Keyboard.nextLine().trim();
        }
        char target = input.charAt(0);
        
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("in the phrase: " + phrase);
        System.out.println("There are " + count + " " + target + "'s");
        
        Keyboard.close();
    }
}