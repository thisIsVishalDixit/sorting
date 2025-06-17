import java.util.Arrays;
import java.util.*;

class bubbleSort                          //using hashtable
{
    public static void main(String[] args) {
        int arr[]={1,2,8,104,5,6,7};
        bubbleSort bs=new bubbleSort();
        bs.bubble(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }

    public void bubble(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }   
            if(flag==0)
            {
                break;
            }
        }
    }
}

//Disadvantages of counting sort : wastage Memory

//number of swap : 0
//number of tern : 0
//time complexity : n^2
//space complexity : O(n)
//adoptive : if array are already sorted then we can break from  : No
//stable : if same elements take order preserved then it's called stable : No
