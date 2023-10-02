public class ReverseStringwithoutAffectingSpecialChar {
    public static void reverse(char[] str) {
        // Initialize left and right pointers
        int rght = str.length - 1, lft = 0;

        // Traverse string from both ends until 'l' and 'r'
        while (lft < rght) {
            // Ignore special characters
            if (!Character.isAlphabetic(str[lft]))
                lft++;
            else if (!Character.isAlphabetic(str[rght]))
                rght--;

                // Both str[l] and str[r] are not spacial
            else {
                char tmp = str[lft];
                str[lft] = str[rght];
                str[rght] = tmp;
                lft++;
                rght--;
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";
        char[] charArray = str.toCharArray();

        //System.out.println("Input string: " + str);
        reverse(charArray);
        String revStr = new String(charArray);

        System.out.println("Reverse String without changing position of special character: " + revStr);
    }

    /*public static String reverse(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            if (!Character.isAlphabetic(charArray[left])) {
                left++;
            } else if (!Character.isAlphabetic(charArray[right])) {
                right--;
            } else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";
        String reversedStr = reverse(str);

        //System.out.println("Original String: " + str);
        System.out.println("Reverse String without changing position of special characters: " + reversedStr);
    }*/
}