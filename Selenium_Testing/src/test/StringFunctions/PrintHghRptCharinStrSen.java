import java.util.HashMap;
import java.util.Scanner;

public class PrintHghRptCharinStrSen {
    public static String str;
    public static Scanner sc;
    public static String readInput(){
        //str=str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter New String: ");
        String strg = sc.nextLine();
        return strg;
    }

    public static String prtHghRptCharinStr(String str) {
        String[] words = str.split(" ");

        if (str == null || str.isEmpty() || words.length == 0) {
            return "-1";
        }

        String wordWthMaxRpt = words[0];
        int maxRptCnt = 0;

        for (String word : words) {
            int rptCnt = getRptCnt(word);
            if (rptCnt > maxRptCnt){
                maxRptCnt = rptCnt;
                wordWthMaxRpt = word;
            }
        }
        return (wordWthMaxRpt != null) ? wordWthMaxRpt : words[0];
    }

    public static int getRptCnt(String word){
        HashMap <Character,Integer> charHashMap = new HashMap<>();
        int rptCnt=0;

        for (char c:word.toCharArray()) {
            if (charHashMap.containsKey(c)) {
                charHashMap.put(c, charHashMap.get(c) + 1);
                rptCnt = charHashMap.get(c);
            }
            else {
                charHashMap.put(c, 1);
                rptCnt = charHashMap.get(c);
            }
        }
        return rptCnt;
    }

    public static void main(String []args){
        str = readInput();
        prtHghRptCharinStr(str);
        String result=prtHghRptCharinStr(str);

        if (result!=null)
            System.out.println(result);
        else
            System.out.println("-1");
    }
}