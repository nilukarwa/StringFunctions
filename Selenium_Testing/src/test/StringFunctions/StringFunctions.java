import java.util.Scanner;

public class StringFunctions {
    public static String str = null;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("==========================================================================================");
        System.out.println("Kindly Enter new String: ");
        System.out.println("==========================================================================================");

        str = sc.nextLine();

        System.out.println("Original String: " + str);
        System.out.println("==========================================================================================");

        RemCapLetStr.RemCapLet(str);
        System.out.println("String without capital letters: " + RemCapLetStr.modifiedStr);
        System.out.println("==========================================================================================");

        RemLowLetStr.RemLowLet(str);
        System.out.println("String without lowercase letters: " + RemLowLetStr.modifiedStr);

        System.out.println("==========================================================================================");
        ReverseString.revStr(str);
        System.out.println("The Reverse String: " + ReverseString.modifiedStr);
        System.out.println("==========================================================================================");

        CountofCharStr.cntCharStr(str);
        System.out.print("The count of Key and Value Pair is: ");
        System.out.println(CountofCharStr.countofChar);
        System.out.println("==========================================================================================");

        LowerCaseString.lowCaseStr(str);
        System.out.println("String in Lower Case: " + LowerCaseString.modifiedStr);
        System.out.println("==========================================================================================");

        UpperCaseString.UpCaseStr(str);
        System.out.println("String in Upper Case: " + UpperCaseString.modifiedStr);
        System.out.println("==========================================================================================");

        DisOnlyNumStr.disNumbersStr(str);
        System.out.println("String containing numbers: " + DisOnlyNumStr.modifiedStr);
        System.out.println("==========================================================================================");

        DisOnlyCharStr.disCharStr(str);
        System.out.println("String containing Special characters: " + DisOnlyCharStr.modifiedStr);
        System.out.println("==========================================================================================");

        CountofVowelStr.cntVwlStr(str);
        System.out.println("String Vowels Count: " + CountofVowelStr.cntVowels);
        System.out.println("==========================================================================================");

        RemSplCharNumString.remSplCharNumStr(str);
        System.out.println("String without Number & Special Characters: " + RemSplCharNumString.modifiedStr);
        System.out.println("==========================================================================================");

        RemSplCharNumString.remSplCharStr(str);
        System.out.println("String without Special Characters: " + RemSplCharNumString.modifiedStr1);
        System.out.println("==========================================================================================");

        RemSplCharNumString.remCharStr(str);
        System.out.println("String without Characters: " + RemSplCharNumString.modifiedStr2);
        System.out.println("==========================================================================================");

        RemSplCharNumString.remCharNumStr(str);
        System.out.println("String without Characters & Numbers: " + RemSplCharNumString.modifiedStr3);
        System.out.println("==========================================================================================");

        CountofCharStr.cntIndVwlStr(str);
        System.out.println("String without Characters & Numbers: " + CountofCharStr.vwlCnt);
        System.out.println("==========================================================================================");

        PrintSubString.printAllSubString(str);
        System.out.println("All SubString are as follows: " +PrintSubString.subString);
        System.out.println("==========================================================================================");

        PrintFirstCharStr.printFstCharofStr(str);
        System.out.println("First Character of String: " +PrintFirstCharStr.c);
        System.out.println("==========================================================================================");
    }
}