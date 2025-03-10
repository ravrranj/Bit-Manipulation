import java.util.Scanner;

public class decimalToBinary {

    // Fubction to convert decimal to binary 
    public static String decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        if (n == 0) {
            return "0";
        }
        while (n > 0) {
            binary.append(n % 2);
            n = n/2;
        }
        return binary.reverse().toString();  // Reverse to get the correct binary representation 

    }

    //Function to convert binary to decimal
    public static int binaryToDecimal(String binary) {
         int decimal = 0;
         for (int i = 0; i < binary.length(); i++) {
             char bit = binary.charAt(i);
             decimal = decimal * 2 + (bit - '0'); // Convert char to int and calculate 

         }
         return decimal;

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Decimal to Binary conversion
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        String binaryResult = decimalToBinary(decimalNumber);
        System.out.println("Binary representation: " + binaryResult);

        //Binary to Decimal conversion 
        System.out.print("Enter a binary number: ");
        String binaryNumber = sc.next();
        int decimalResult = binaryToDecimal(binaryNumber);
        System.out.println("Decimal representation: " + decimalResult);

        sc.close();
    }




}