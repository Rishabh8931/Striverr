// Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

// Example 1:
// Input:
//  [1, 2, 4, 7, 7, 5]  
// Output:
  
// Second Smallest : 2  
// Second Largest : 5  
// Explanation:
//   The elements are sorted as 1, 2, 4, 5, 7, 7.  
// Hence, the second smallest element is 2, and the second largest element is 5.

// Example 2:
// Input:
//  [1]  
// Output:
  
// Second Smallest : -1  
// Second Largest : -1  
// Explanation:
//   Since there is only one element in the array, it is both the largest and smallest element.  
// Therefore, there is no second smallest or second largest element present.



package striverr.Arrays;
public class secondLargestandSmallest {

    public static void sec(int[] arr){
        int largest = Integer.MIN_VALUE, second_largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, second_smallest = Integer.MAX_VALUE;

        
        for(int i = 0; i<arr.length; i++)
        {
          if(arr.length < 2){
            second_largest = -1;
            second_smallest = -1;
            break;
          }
            // comparision for second largest
            if(arr[i] > second_largest && arr[i] <largest) {
                second_largest = arr[i];
            }
            else {
                largest = arr[i];
            }
 

            // comparison for second smallest
            if(arr[i] > smallest && arr[i] < second_smallest) {
                second_smallest = arr[i];
            } else {
                smallest = arr[i];
            }
        }

        System.out.println("second Largest = "+ second_largest );
        System.out.println("Second Smallest = " + second_smallest);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 7, 5  };
        int arr2[] = {1};
        sec(arr);
        sec(arr2);
    }
}
