public class RevStr {
    public static void main(String [] args){
        String str = "I am Nilesh Karwa";
        char [] chrArr = str.toCharArray();
        for (int i=str.length()-1; i>=0;i--){
            System.out.print(chrArr[i]);
        }
    }
}
