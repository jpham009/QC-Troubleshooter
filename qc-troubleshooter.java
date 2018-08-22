import java.io.*;
import java.util.*;

class Solution {
  public static boolean ask(String question) {
    System.out.println(question);
    Scanner user_input = new Scanner(System.in);
    String response = user_input.nextLine();
    if(response.toLowerCase().equals("y") || response.toLowerCase().equals("yes")){
      System.out.println("true");
      return true;
    }
    else{
      System.out.println("false");
      return false;
    }
  }

  public static void one2(){
    if(ask("Is at least one control value in this run greater than 3s?")){
      one3();
    }
    else{
      one2f();
    }   
  }

  public static void one3(){
    if(ask("Other than the control value that is greater than 3s, are any other control values in this run greater than 2s?")){
      return;
    }
    else{
      return;
    }   
  }

  public static void one2f(){
    if(ask("Is only one control value in this run between 2s and 3s?")){
      return;
    }
    else{
      return;
    }   
  }

  //First question of the program
  public static void main(String[] args) { 
    if(ask("Are any control values in this run at or greater than 2s?")){
      one2();
    }
    else{
       System.out.println("Test system is in control.");
    }   
  }
};
