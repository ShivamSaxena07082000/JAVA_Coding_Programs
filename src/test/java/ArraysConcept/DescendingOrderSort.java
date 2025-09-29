package ArraysConcept;

import java.util.Arrays;

public class DescendingOrderSort {

    public static void main(String[] args) {

        int arr[] = {98,43,100,243,54,23,12};
        for(int i=0;i<arr.length-1;i++)  //passes
        {
            for (int j = 0; j < arr.length-i-1; j++)   //swaps
            {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}
