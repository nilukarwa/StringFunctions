public class RemSplCharNumString {

    public static String modifiedStr, modifiedStr1, modifiedStr2, modifiedStr3;

    public static String remSplCharNumStr(String str) {
        modifiedStr = str.replaceAll("[^a-zA-Z]", "");
        return modifiedStr;
    }

    public static String remSplCharStr(String str) {
        modifiedStr1 = str.replaceAll("[^a-zA-Z0-9]", "");
        return modifiedStr1;
    }

    public static String remCharStr(String str) {
        modifiedStr2 = str.replaceAll("[a-zA-Z]", "");
        return modifiedStr2;
    }

    public static String remCharNumStr(String str) {
        modifiedStr3 = str.replaceAll("[a-zA-Z0-9]", "");
        return modifiedStr3;
    }
}