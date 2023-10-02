import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        long fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for Factorial: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.print("Factorial of " + num + " is : " + fact);
    }
}