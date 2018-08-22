import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    System.out.println("Are any control values in this run at or greater than 2s?");
    Scanner user_input = new Scanner(System.in);
   // String input
    String response1 = user_input.nextLine();
    if(response1.toLowerCase() == "y" || response1.toLowerCase() == "yes"){
          
    }
    else{
      System.out.println("Test system is in control.");
      return 0;
    }
  }
};
