public class ReverseString {
    public static String modifiedStr;

    public static String revStr(String str) {
        int length = str.length();
        char[] revStr = new char[length];
        int j = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            revStr[i] = str.charAt(j);
            j++;
        }
        for (char c : revStr) {
            sb.append(c);
        }
        return modifiedStr = sb.toString();
    }
}
