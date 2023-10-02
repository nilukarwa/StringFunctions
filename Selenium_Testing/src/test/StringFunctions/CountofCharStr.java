import java.util.ArrayList;
import java.util.HashMap;

public class CountofCharStr {

    public static HashMap<Character, Integer> countofChar = new HashMap<>();
    public static HashMap<Character, Integer> vwlCnt = new HashMap<>();

    public static HashMap cntCharStr(String str) {

        for (char c : str.toCharArray()) {
            if (countofChar.containsKey(c))
                countofChar.put(c, countofChar.get(c) + 1);
            else
                countofChar.put(c, 1);
        }
        return countofChar;
    }

    public static HashMap cntIndVwlStr(String str) {
        ArrayList<Character> vwl = new ArrayList<>();
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vwl.add(c);
            }
        }

        for (char c : vwl) {
            if (vwlCnt.containsKey(c))
                vwlCnt.put(c, vwlCnt.get(c) + 1);
            else
                vwlCnt.put(c, 1);
        }
        return vwlCnt;
    }
}