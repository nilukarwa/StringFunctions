package SpaceTimeComplexity;

public class Linear {
    //O(n)
    public static void main(String [] args){
        int arr[]=new int[]{1,2,3,4,5};

        //Add 10 to the first element of an array
        arr[0]=arr[0]+10; //Time Comp. ->O(1) | S. C. - O(1)

        //Task print element of an array
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]); //O(n) - Time Complexity | S. C. - O(1)
        }
        //Total Time Complexity = O(1) + O(n) = O(1+n)=O(n) - Linear Time Complexity

        System.out.println(arr[0]); //Time Constant O(1) | S. C. - O(1)

        //Total Time Complexity = O(1) + O(1) + O(n) = O(2+n)=O(n) - Linear Time Complexity

        //Copy the elements of one array to another
        int newarr[]=new int[arr.length]; //T.C.- O(1) | S. C. - O(n)
        for(int i=0;i< arr.length;i++){ // T.C. - O(n) | S. C. - O(1)
            newarr[i]=arr[i];
        }
        for(int num: newarr){ //T.C. - O(n) | S. C. - O(1)
            System.out.println(num);
        }
        // S. C. -- 1 + 1 + 1 + n + 1 + 1 = 0 (5 + n) = O(n)
        // T. C. -- 1 + n + 1 + 1 + n + n = O(3 + 3n) = O(3N) = O (3*n) = O(n)
    }
}