import java.util.Arrays;

class InsertionSort                       
{
    public static void main(String[] args) {
        
    int a[]={1,24,5,78,9,2,10};
    int temp;
    int j=0;

    for(int i=1;i<a.length;i++)
    {
        temp=a[i];
        j=i-1;
        while(j>=0 && a[j]>temp)
        {
           a[j+1]=a[j];
           j--;
        }
        a[j+1]=temp;
        
       
    }
    
    for(int i=0;i<a.length;i++)
    {
        System.out.println(a[i]);
    }
}
}


//number of swap : 0
//number of tern : 0
//time complexity : O(n^2)
//space complexity : O(1)
//adoptive : if array are already sorted then we can break from : No
//stable : if same elements take order preserved then it's called stable : Yes


