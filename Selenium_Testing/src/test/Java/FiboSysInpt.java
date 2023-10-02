import java.util.Scanner;

public class FiboSysInpt {
    public static void main(String[] args) {
        //Declaring First 2 integers as start of Fibonacci Series with 0 & 1
        int num1 = 0, num2 = 1;
        //This integer declare to print next number in the series
        int num3;
        //This is to Run the loop for required number of times
        int count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        count = sc.nextInt();
        System.out.println("Fibonacci Series Upto: " + count);
        if (count <= 0) {
            System.out.println("Kindly ");
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter Number: ");
            count = sc1.nextInt();
            System.out.println("Fibonacci Series Upto: " + count);
        }
        if (count < 2) {
            System.out.print(num1);
        } else {
            System.out.print(num1 + " " + num2);
            //As we have first 2 numbers of the  Fibonacci Series which is 0 & 1
            for (int i = 2; i < count; ++i) {
                num3 = num1 + num2;
                System.out.print(" " + num3);
                num1 = num2;
                num2 = num3;
            }
        }
    }
}