public class A2z_13 {
  
    public static int find(int[] arr, int key){
        int length = 0;

         for(int i = 0; i<arr.length-1; i++){
            int sum = arr[i];
            for(int j = i+1; j < arr.length; j++)
            {
                sum += arr[j];
                if( i == key || j == key)
                {
                       length = 1;
                       break;
                }else if (sum == key){
                    length =  Math.max(length, (j-i+1));
                    break;
                }
            }
 
         }

         return length;
    }
    public static void main(String[] args) {

        int   nums[] = {10, 5, 3, 8, 1, 15};
        int  k = 15 ;

          System.out.println(find(nums, k));
        }
    }
