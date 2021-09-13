import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        int decimal=0;
        int binaryInt = Integer.parseInt(binary);
        int place=1;
        while (binaryInt>0){
            int last= binaryInt % 10;
            decimal+=place*last;
            binaryInt/=10;
            place*=2;
        }
        return decimal;
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        if (decimal==0){
            return "0";
        }
        String remainders="";
        while (decimal>=1){
            remainders = (decimal % 2) + remainders;
            decimal = (decimal-(decimal % 2))/2;
        }
        return remainders;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number in binary format");
        String binary = scan.next();
        System.out.println(binary + " in decimal format is " + binaryToDecimal(binary));
        System.out.println("Type in a number in decimal format");
        int num = scan.nextInt();
        System.out.println(num + " in binary is " + decimalToBinary(num));
    }
}
