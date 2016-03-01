import java.util.Scanner;

public class CheckISBN {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the first 9 digits of an ISBN "
    + "as an integer: ");
    int isbn = input.nextInt();
    int checksum = 0;
    
    for(int i = 1; i < 10; i++){
      checksum += i * (isbn % ((int)(Math.pow(10, (10-i))))) / 
              ((int)(Math.pow(10, (9-i))));
    } // for i
    
    checksum = checksum % 11;
    
    int d1 = isbn / 100000000;
    if(checksum == 10){
      System.out.println("The ISBN-10 number is " + isbn + "X");
    } // if 
    else{
      System.out.println("The ISBN-10 number is " + isbn + checksum);
      /*if (isbn / 100000000 == 0)
        System.out.print("0");
      System.out.print(isbn + checksum);
      System.out.println();*/
    } // else
  } // main   
} //CheckISBN
