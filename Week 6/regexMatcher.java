import java.util.regex.*;
public class regexMatcher {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("NBA", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("WNBA");
        if(matcher.find()) 
          System.out.println("Match found");
        else 
          System.out.println("Match not found");
        
      }
}
