import java.util.Scanner;

public class RemoveCapLetfromUserString {
    public static void main(String[] args) {
        String str = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any String: ");
        str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!Character.isUpperCase(c)) {
                result.append(c);
            }
        }

        String modOrgnl = result.toString();

        System.out.println("String without capital letters: " + modOrgnl);
    }
}