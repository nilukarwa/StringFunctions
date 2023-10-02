import java.util.HashMap;

public class SplChrCnt {
    public static void main(String[] args){
        String str="A1e2I!3o4U%5bcd6*78XY~Z345)";
        String splChr=str.replaceAll("[a-zA-Z0-9]","");
        System.out.println(splChr);
        HashMap<Character,Integer> cntChr = new HashMap<>();

        /*char [] chrArr = str.toCharArray();
        ArrayList<Character> chrLst = new ArrayList<>();
        for (int i=0;i<str.length();i++){
            chrLst.add(chrArr[i]);
            System.out.println(chrArr[i]);
        }
        System.out.println(chrLst);*/

        for (char c:splChr.toCharArray()) {
            if (cntChr.containsKey(c))
                cntChr.put(c, cntChr.get(c)+1);
            else
                cntChr.put(c,1);
        }
        System.out.println(cntChr);
    }
}