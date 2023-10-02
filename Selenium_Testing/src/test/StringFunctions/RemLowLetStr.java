public class RemLowLetStr {
    public static String modifiedStr;

    public static String RemLowLet(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!Character.isLowerCase(c))
                sb.append(c);
        }
        return modifiedStr = sb.toString();
    }
}