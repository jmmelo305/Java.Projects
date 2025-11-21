/*
 * Programmer: Jose Melo
 * Program: Chapter 12 Fix - it Exercise
 * Purpose: The purpose of this file is to find the errors and fix them based on a java file that was provided
 * Date: 11/21/2025
 */
import java.util.Scanner;
public class MelofixitCh12_fixed{  
  public static void main(String[] args) {
    try {
      System.out.println("Enter an integer: ");
      Scanner input = new Scanner(System.in);
      int intValue = input.nextInt();
      EvenNumber evenNumber = new EvenNumber(intValue); 
      System.out.println("Current number is " + evenNumber.getValue());
      System.out.println("Next even number is " + evenNumber.getNext().getValue());
      System.out.println("Previous even number is " + evenNumber.getPrevious().getValue());
      input.close();
    }
    catch (RuntimeException ex) {
      System.out.println("Exception " + ex.getMessage());
    }
  }
}

class EvenNumber {
  private int value;
 
  public EvenNumber() {
    value = 0;
  }

  // Constructor
  public EvenNumber(int value) {
    if (value % 2 == 0){
      this.value = value;
    }
  
    else {
      throw new RuntimeException("value not even");
    }
  }

  public int getValue() {
    return value;
  }

  public EvenNumber getNext() {
    return new EvenNumber(value + 2);
  }

  public EvenNumber getPrevious() {
    return new EvenNumber(value - 2);
  } 
}
