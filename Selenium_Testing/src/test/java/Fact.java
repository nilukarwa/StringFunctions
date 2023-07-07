import java.util.Scanner;
public class Fact {
    public static void main(String []args){
        int num1=1,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for Factorial: ");
        int num2= sc.nextInt();
        for (int i=1;i<=num2;i++){
            fact=fact*i;
        }
        System.out.print("Factorial of "+num2+" is : "+fact);
    }
}