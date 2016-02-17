import java.util.Scanner;

public class CheckISBN {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the first 9 digits of an ISBN "
    + "as an integer: ");
    int isbn = input.nextInt();
    int d1 = isbn / 100000000;
    int d2 = (isbn % 100000000) / 10000000;
    int d3 = (isbn % 10000000) / 1000000;
    int d4 = (isbn % 1000000) / 100000;
    int d5 = (isbn % 100000) / 10000;
    int d6 = (isbn % 10000) / 1000;
    int d7 = (isbn % 1000) / 100;
    int d8 = (isbn % 100) / 10;
    int d9 = isbn % 10;
    
    int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 
            + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
    
    if(checksum == 10){
      System.out.println("The ISBN-10 number is " + d1 + isbn 
              + "X");
    } // if
    else{
      System.out.println("The ISBN-10 number is " + d1 + isbn 
              + checksum);
    } // else
  } // main   
} //CheckISBN
