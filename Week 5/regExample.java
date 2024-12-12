import java.util.Scanner;
import java.util.regex.*;

public class regExample{

    public static void main(String args[]) {
        System.out.println("Character Replacer");
        System.out.println("Program to replace a set of characters in a given string."
                + " Case Sensitive. ");
        Scanner myObj = new Scanner(System.in);
        String rep, regex, output;
        System.out.print("Enter Initial String: ");
        rep = myObj.nextLine();
        System.out.print("Enter Pattern to Check: ");
        regex = myObj.nextLine();
        System.out.print("Enter Replacement Character/s: ");
        output = myObj.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(rep);
        System.out.println("Before Replacement: " + rep);
        if(matcher.find()) 
            System.out.println("After Replacement: " + matcher.replaceAll(output));
        else 
            System.out.println("Match not found");
        
    }
}