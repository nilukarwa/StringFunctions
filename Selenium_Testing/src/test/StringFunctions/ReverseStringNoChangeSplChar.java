import java.util.Stack;
public class ReverseStringNoChangeSplChar {
    public static String reverse(String str) {
        char[] charArr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder revStr = new StringBuilder();

        // Push alphabetic characters onto the stack
        for (char c : charArr) {
            if (Character.isAlphabetic(c))
                stack.push(c);
        }

        for (char c : charArr) {
            if (Character.isAlphabetic(c))
                revStr.append(stack.pop());
            else
                revStr.append(c); // Append special characters as they are
        }
        return revStr.toString();
    }

    public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";
        String revStr = reverse(str);

        System.out.println("Reverse String: " + revStr);
    }
}