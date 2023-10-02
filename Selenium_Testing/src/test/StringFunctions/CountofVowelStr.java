public class CountofVowelStr {
    public static int cntVowels = 0;

    public static int cntVwlStr(String str) {
        char[] vwlArr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < vwlArr.length; i++) {
            for (int j = str.length() - 1; j >= 0; j--)
                if (vwlArr[i] == str.charAt(j))
                    cntVowels++;
        }
        return cntVowels;
    }
}