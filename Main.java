 import java.util.Scanner;
/**
 *This program couts down from 100 to whatever the user wants
 * @author Zach Ramriez
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for input 
    Scanner input = new Scanner(System.in);
    //ask user for integer to count down to
    System.out.println("please enter integer to count down to");
    int integer = input.nextInt(); 
    //let the user know we are counting down
    System.out.println("Count Down:");
    //create a varibale to keep track of number
    int count = 100; 
    //pre looping code 
    while(count >= integer){
      //print the starting number 
      System.out.println(count);
      //decrease the value by 5
      count = count - 5;  
    }
    
  }
}
