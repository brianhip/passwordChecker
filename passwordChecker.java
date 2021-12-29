//Author: Brian Peinado
//Exercise methods
/* A password is said to be strong if it satisfies the following criteria:
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%&*+
Its lenght is at least 8
It contains at least one digit
*/

import java.util.Scanner;

public class passwordChecker{
  public static void main(String[] args){
    final int MINLENGTH = 8;
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter a password:");
    String password = in.next();
    boolean lowerCase = isLowerCase(password);
    boolean upperCase = isUpperCase(password);
    boolean specialChar = isSpecialChar(password);
    boolean digit = isDigit(password);
    boolean length = isLength(password, MINLENGTH);

    if(lowerCase && upperCase && digit && specialChar && length){
      System.out.println("Welcome back:");
    }else{
      System.out.println("Password is not accepted, see you later");
    }
  }
  public static boolean isLowerCase(String str){
    for(int i=0; i<str.length(); i++){
      if(str.substring(i, i+1).equals(str.substring(i, i+1).toLowerCase())){
        return true;
      }
    }
    System.out.println("There is no lower case in the password");
    return false;
  }
  public static boolean isUpperCase(String str){
    for(int i=0; i<str.length(); i++){
      if(str.substring(i, i+1).equals(str.substring(i, i+1).toUpperCase())){
        return true;
      }
    }
    System.out.println("There is no upper case in the password");
    return false;
  }
  public static boolean isSpecialChar(String str){
    for(int i=0; i<str.length(); i++){
      if(str.substring(i, i+1).equals("!")||str.substring(i, i+1).equals("@")||str.substring(i, i+1).equals("#")||str.substring(i, i+1).equals("$")||str.substring(i, i+1).equals("%")||str.substring(i, i+1).equals("&")||str.substring(i, i+1).equals("*")||str.substring(i, i+1).equals("+")){
        return true;
      }
    }
    System.out.println("There is no special character in the password");
    return false;
  }
  public static boolean isDigit(String str){
    for(int i=0; i<str.length(); i++){
      if(str.substring(i, i+1).equals("0")||str.substring(i, i+1).equals("1")||str.substring(i, i+1).equals("2")||str.substring(i, i+1).equals("3")||str.substring(i, i+1).equals("4")||str.substring(i, i+1).equals("5")||str.substring(i, i+1).equals("6")||str.substring(i, i+1).equals("7")||str.substring(i, i+1).equals("8")||str.substring(i, i+1).equals("9")){
        return true;
      }
    }
    System.out.println("There is no digit in the password");
    return false;
  }
  public static boolean isLength(String str, int minLength){
    if(str.length()>=minLength){
      return true;
    }
    System.out.println("Is too small");
    return false;
  }
}
