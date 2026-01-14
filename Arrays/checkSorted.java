// Check if an Array is Sorted

// Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

// xample 1:
// Input: N = 5, array[] = {1,2,3,4,5}
// Output: True.
// Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.

// Example 2:
// Input: N = 5, array[] = {5,4,6,7,8}
// Output: False.
// Explanation: The given array is Not sorted i.e Every element in the array is not smaller than or equal to its next values, So the answer is False.
// Here element 5 is not smaller than or equal to its future elements.

public class checkSorted {
    public static boolean checkSort(int nums[])
    {
            for(int i = 0; i< nums.length-1; i++)
            {
                if(nums[i] > nums[i+1]){
                    return false;
                }
            }

        return true;
    }

    // recursive approach
 
    public static boolean ceckSortRecursive(int nums[], int idx)
    {
   if(idx == nums.length-1)
   {
    return true;
   }
         
        if(nums[idx] > nums[idx+1]){
            return false;
        }
        return ceckSortRecursive(nums, idx+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = {5,4,6,7,8};
        System.out.println(checkSort(arr));
        System.out.println(checkSort(arr2));

        System.out.println(ceckSortRecursive(arr2, 0));
        System.out.println(ceckSortRecursive(arr, 0));
    }
}
