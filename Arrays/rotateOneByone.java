// Left Rotate the Array by One



// 11

// Problem Statement: Given an integer array nums, rotate the array to the left by one.

// Note: There is no need to return anything, just modify the given array.
// Example 1:
// Input:
//  nums = [1, 2, 3, 4, 5]  
// Output:
//  [2, 3, 4, 5, 1]  
// Explanation:
//  Initially, nums = [1, 2, 3, 4, 5]  
// Rotating once to the left results in nums = [2, 3, 4, 5, 1].

// Example 2:
// Input:
//  nums = [-1, 0, 3, 6]  
// Output:
//  [0, 3, 6, -1]  
// Explanation:
//  Initially, nums = [-1, 0, 3, 6]  
// Rotating once to the left results in nums = [0, 3, 6, -1].

import accessories.ArrayUtils;

public class rotateOneByone {

    public static void reverse(int arr[], int start, int end)
    {
        
// revesing at given index;
          while(start <= end)
          {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
          }
    }

    public static void rotate(int arr[], int idx){
        // reverse left of the idx
        reverse(arr, 0, idx);
        // reverse right of the idx
        reverse(arr, idx+1, arr.length-1);

        // reverse whole array
        reverse(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,4,5,7};
        rotate(arr, 2);
       ArrayUtils.printArray(arr);

    }
}
