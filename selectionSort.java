import java.util.Arrays;
import java.util.*;

class selectionSort                 
{
    public static void main(String[] args) {
        int arr[]={9,1,2,8,104,5,-26,7};
        
        for(int i=0;i<arr.length;i++)
        { 
            int min=i;                              // min 0 now                                    min=1 then 
            for(int j=i+1;j<arr.length;j++)           //j=0+1;1<8;1++                               again j<2;j<8;j++
            {
               if( arr[min] > arr[j] )          // a[1] < a[0]  yes                                    again a[2]<a[1] no
               {
                min=j;                   //  min 1 then                                             now min=1;
               }
            }
             int temp=arr[min];
             arr[min]=arr[i];
             arr[i]=temp;
           
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


//number of swap : n-1
//number of tern : 1
//time complexity : O(n^2)
//space complexity : O(1)
//adoptive : if array are already sorted then we can break from : No
//stable : if same elements take order preserved then it's called stable : Yes


