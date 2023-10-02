public class DisOnlyCharStr {
    public static String modifiedStr;

    public static String disCharStr(String str) {
        modifiedStr = str.replaceAll("[0-9]", "");
        return modifiedStr;
    }

}
