public class DisOnlyNumStr {
    public static String modifiedStr;

    public static String disNumbersStr(String str) {
        str = str.replaceAll("[^0-9]", " ");
        modifiedStr = str.replaceAll(" +", "");
        return modifiedStr;
    }
}
