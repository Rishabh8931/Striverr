// Problem Statement: Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.

// Examples
// Example 1:
// Input:
//  nums = [10, 5, 2, 7, 1, 9], k = 15  
// Output:
//  4  
// Explanation:
//  The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array is 4.

// Example 2:
// Input:
//  nums = [-3, 2, 1], k = 6  
// Output:
//  0  
// Explanation:
//  There is no sub-array in the array that sums to 6. Therefore, the output is 0.

public class maxLengthwithKey {

    // brute force
    public static int max(int[] arr, int key) {

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == key) {
                    max = Math.max((j - i + 1), max);
                }

            }
        }

        return max;
    }

    // more optimized

    public static int max2(int[]arr, int key)
    {
        int max = 0;
          int n = arr.length;
        int[] temp = new int[n];
        temp[0] = arr[0];

        for(int i = 1; i < n; i++)
        {
             temp[i] = temp[i-1] + arr[i];
        }

        for(int start = 0; start < arr.length; start++)
        {
            for(int end = start; end < arr.length; end++)
            {   int sum = 0;
                if(start == 0)
                {
                    sum  = temp[end];
                }  
                else{
                     sum  = temp[end] - temp[start-1];
                }
                
                if(sum == key)
                {
                    max = Math.max(max, (end - start +1));
                }

            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        int key = 15;

        System.out.println(max(arr, key));
        System.out.println(max2(arr, key));
    }

}