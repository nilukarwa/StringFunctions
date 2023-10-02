import java.util.Scanner;

public class PrintIntofString {
    public static void main(String[] args) {
        String str = "ABC15678XYZABC";
        str = str.replaceAll("[^0-9]", " ");

        str = str.replaceAll(" +", "");
        System.out.println(str);
        removeCapitalLetter();

    }

    public static void removeCapitalLetter() {
        String org = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter New String: ");
        org = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (char c : org.toCharArray()) {
            if (!Character.isUpperCase(c))
                sb.append(c);
        }

        String modified = sb.toString();

        System.out.print(modified);
    }
}