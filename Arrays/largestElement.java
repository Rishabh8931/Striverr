// Problem Statement: Given an array, we have to find the largest element in the array.

// Example 1:
// Input:
//  arr[] = {2, 5, 1, 3, 0}  
// Output:
//  5  
// Explanation:
  
// 5 is the largest element in the array.

// Example 2:
// Input:
//  arr[] = {8, 10, 5, 7, 9}  
// Output:
//  10  
// Explanation:
  
// 10 is the largest element in the array.


public class largestElement {
    
    public static int largest(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++)
        {
            if(max < arr[i]){
                max = arr[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
       int arr1[] = {2, 5, 1, 3, 0} ;
       int arr2[] = {8, 10, 5, 7, 9} ;

         System.out.println(largest(arr1));
         System.out.println(arr2);
    }
}
