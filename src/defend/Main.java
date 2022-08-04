package defend;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Team Assignment: Defend Your Code!.
 */
public class Main {
  
  private static Scanner IN = new Scanner(System.in);
  private static Pattern PATTERN; 
  private static Matcher MATCHER;
  
  /**
   * Method get user name, also check name legitimate
   * Not allow non alphabet word character, whitespace and empty space.
   */
  public static String promtName(final String firstorlast) {
    final String regex = "[\\s\\W\\d]";
    System.out.print("Enter Your " + firstorlast + " Name:");
    final String name = IN.nextLine();
    PATTERN = Pattern.compile(regex);
    MATCHER = PATTERN.matcher(name);
    
    if (MATCHER.find() || name.length() > 50 || name.isEmpty()) {
      System.out.println("invalid name please re-enter");
      promtName(firstorlast);
    }
    return name;
  }

  //prompts for and reads in two int values from the user (range of values are those of a 4 byte int)
  public static int promtInt() {
    System.out.print("Enter your integer: ");
    try {
        final int intInput = Integer.parseInt(IN.nextLine());
        return intInput;
    } catch (Exception e) {
        System.out.println("Invalid input. Please try again.");
        return promtInt();
    }
  }
  
  //prompts for reads the name of an input file from the user
  //prompts for reads the name of an output file from the user
  public static void promtFileName() {
    System.out.println("Enter Name For File:");
    final String regex = "[a-z[\\d]]";
    final String name = IN.nextLine();
    PATTERN = Pattern.compile(regex);
    MATCHER = PATTERN.matcher(name);
    if (!MATCHER.find() || name.length() > 50 || name.isEmpty()) {
      System.out.println("invalid name please re-enter");
      promtFileName();
    }
  }
  
  /**
   * Main method.
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    promtName("First");
//    
//    promtName("Last");
//    
//    promtInt();
//    
//    promtInt();
    
    promtFileName();
    
//    promtFileName("Output");
    
  }
}
