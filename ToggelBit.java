import java.util.Scanner;

public class ToggelBit{
  public static int toggleBit(int n, int pos) {
  
    //Create a bitmask by shifting 1 to the left by 'pos' positions
    int mask = 1 << pos;
    // XOR the number with the mask to toggle the bit
    return n ^ mask;
  }

  public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the number (n): ");
  int n = sc.nextInt();

  System.out.println("Enter the position to toggle (0-based index): ");
  int pos = sc.nextInt();

  int toggledNumber = toggleBit(n, pos);

  System.out.println("Number after toggling bit at position " + pos + ": " + toggledNumber);
  sc.close();

  }


}