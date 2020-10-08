import java.util.*;

public class morse 
{   
    static String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
    "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" }; //36 size

    static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
    "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
    "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----" };

    static Map<String, String> morseCode;

    static int count;

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("\nPlease enter morse to be decyphered");
        String input = in.next();
        decoder(input, "");
    }
    public static void decoder(String morseString, String output) 
    {
        if (morseString.length() > 0) //starts recursion process
        {  
            for (int i = 0; i < morse.length; i++) 
            { // try all morse codes
                if (morseString.startsWith(morse[i])) 
                { // on the beginning of the given string
                    decoder(morseString.substring(morse[i].length()), output+alphabet[i]);
                }
            }
        } 
        else
        {
            System.out.println("possible translation: " + output);
        }
    }
    
}
