import java.util.Scanner;

public class CheckISBN {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the first 9 digits of an ISBN "
    + "as an integer: ");
    String isbn = input.nextLine();
    int d1 = (int)isbn.charAt(0) - 48;
    int d2 = (int)isbn.charAt(1) - 48;
    int d3 = (int)isbn.charAt(2) - 48;
    int d4 = (int)isbn.charAt(3) - 48;
    int d5 = (int)isbn.charAt(4) - 48;
    int d6 = (int)isbn.charAt(5) - 48;
    int d7 = (int)isbn.charAt(6) - 48;
    int d8 = (int)isbn.charAt(7) - 48;
    int d9 = (int)isbn.charAt(8) - 48;
    
    int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 
            + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
    
    if(checksum == 10){
      System.out.println("The ISBN-10 number is " +  isbn 
              + "X");
    } // if
    else{
      System.out.println("The ISBN-10 number is " + isbn 
              + checksum);
    } // else
  } // main   
} //CheckISBN
