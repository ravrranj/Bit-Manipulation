import java.util.Scanner;

public class CountOnes {
  public static int CountOnes(int n){
  int count = 0;
  while (n > 0) {
    n = n & (n -1);  //Remove the righhtmost set bit
    count++;
  } 
    return count;
  }
   public static void main(String args[]){
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter the number : ");
          int number = sc.nextInt();

          int setBits = CountOnes(number);
          System.out.println("Number of 1's in binary representation: " + setBits);

          sc.close();

   }


}