import java.util.HashMap;

public class CharOccuranceinString {
    public static void main(String[] args) {
        String str = "Google";
        //str = str.toLowerCase();

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        System.out.println(charCountMap);

        /*for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey()+" " +entry.getValue());
        }*/
    }
}