import java.util.ArrayList;

public class PrintSubString {
    public static ArrayList<String> subString = new ArrayList<>();
    static String subStr;
    public static ArrayList<String> printAllSubString(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++){
                subStr = str.substring(i, j);
                subString.add(subStr);
            }
        }
        return subString;
    }
}