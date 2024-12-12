import java.util.regex.*;

public class simpleReplaceRegex {
    public static void main(String args[]) {
        String rep = "DotA", regex = "NBA", input = "WNBA";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        System.out.println("Before Replacement: " + input);
        if(matcher.find()) 
            System.out.println("After Replacement: " + matcher.replaceAll(rep));
        else 
            System.out.println("Match not found");
            
    }
}
