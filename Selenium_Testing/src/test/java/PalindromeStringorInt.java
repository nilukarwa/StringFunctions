import java.util.Scanner;

public class PalindromeStringorInt {
    public static void main(String [] args){
        String orgnl, rev="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Palindrome String/Integer: ");
        orgnl= sc.nextLine();
        int len=orgnl.length();
        for (int i=len-1;i>=0;i--)
            rev = rev + orgnl.charAt(i);
        if(orgnl.equals(rev))
            System.out.print("Entered String or Number is Palindrome");
        else
            System.out.print("Entered String or Number is not Palindrome");
    }
}