package SpaceTimeComplexity;
public class Constant {
    public static void main(String []args){
        int arr[]=new int[]{1,2,3,4,5};
        //Add 10 to the first element of an array
        arr[0]=arr[0]+10; //Time Comp. ->O(1)
        int num=arr[arr.length-1];// S. C. -- int 4 <bytes> O(4)
        System.out.println(arr[0]); //Time Comp. ->O(1)
        //O(1)+ O(1)=O(2) -- Constant Time Complexity
        //O(4 bytes) = O(1) -- Constance Space Complexity
    }
}