// Move all Zeros to the end of the array



// 14

// Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

// Examples
// Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
// Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
// Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
// Input : 1,2,0,1,0,4,0
// Output: 1,2,1,4,0,0,0
// Explanation : All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

import accessories.ArrayUtils;
public class moveZeroEnd {

    public static int[] move(int arr[]){
        int count = 0;
        int temp[] =  new int[arr.length];
    int j = 0;
        for(int i = 0; i< arr.length ; i++)
        {
            if(arr[i] != 0)
            {
                count++;
                temp[j++] = arr[i];
            }
            
        }

            for(   count  = arr.length - count + 2; count < arr.length; count ++)
            {
                temp[count] = 0;
            }

        return temp;

    }


    // second approach
  
    public static void move2(int arr[])
    {
        int j = -1 ;
        
        for(j = 0; j< arr.length; j++)
        {
            if(arr[j] == 0) {
                break;
            }
            
        }
       if(j == -1)
         return; // not found
         
       for(int i = j+1; i < arr.length; i++)
       {
        if(arr[i] != 0){
            arr[j++] = arr[i];
        }
       }

       while( j < arr.length)
       {
        arr[j++] = 0;
       }
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,0,4,0,5};
        move2(arr);
        // ArrayUtils.printArray(move(arr));
        ArrayUtils.printArray(arr);
    }
}
