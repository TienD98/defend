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
  private static final String REGEXNAME = "[ \\s\\W\\d]";
  
  /**
   * Method get user last name, also check first name legitimate.
   */
  public static String promtFirstName() {
    System.out.print("Enter Your First Name:");
    String firstName = IN.nextLine();
    PATTERN = Pattern.compile(REGEXNAME);
    MATCHER = PATTERN.matcher(firstName);
    
    if (MATCHER.find() || firstName.length() > 50 || firstName.isEmpty()) {
      System.out.println("invalid name please re-enter");
      promtFirstName();
    }
    return firstName;
  }
  
  /**
   * Method get user last name, also check last name legitimate.
   */
  public static String promtLastName() {
    System.out.print("Enter Your Last Name:");
    String lastName = IN.nextLine();
    MATCHER = PATTERN.matcher(lastName);
    if (MATCHER.find() || lastName.length() > 50 || lastName.isEmpty()) {
      System.out.println("invalid name please re-enter");
      promtLastName();
    } 
    return lastName;
  }

  //prompts for and reads in two int values from the user (range of values are those of a 4 byte int)
  public static int promtInt() {
    return 0;
  }
  /**
   * Main method.
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    promtFirstName();
    promtLastName();
  }
}
