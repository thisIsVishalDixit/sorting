import java.util.Arrays;
import java.util.*;

class countingSort // using hashtable
{
    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 104, 5, 6, 7, 108 };

        int max = arr[arr.length - 1];

        int newArray[] = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            newArray[arr[i]]++;
        }

        for (int i = 0; i < newArray.length; i++) {
            while (newArray[i] > 0) {
                System.out.println(i);
                newArray[i]--;
            }
        }
    }
}

// Disadvantages of counting sort : wastage Memory

// number of swap : 0
// number of tern : 0
// time complexity : n^2
// space complexity : O(n)
// adoptive : if array are already sorted then we can break from : No
// stable : if same elements take order preserved then it's called stable : No
