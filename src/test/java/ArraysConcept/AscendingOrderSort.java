package ArraysConcept;

import java.util.Arrays;

public class AscendingOrderSort {

    public static void main(String[] args) {

        int arr[] = {98,43,100,243,54,23,12};
        /*System.out.println("Using Predefined method sort");
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }*/

        System.out.println("Without using Predefined method sort");
        for(int i=0;i<arr.length-1;i++)  //passes
        {
            for (int j = 0; j < arr.length-i-1; j++)   //swaps
            {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            if(i==0)
            {
                System.out.println("First Largest element is: "+arr[arr.length-1]);
            }
            if(i==1)
            {
                System.out.println("Second Largest Element is: "+arr[arr.length-2]);
            }
            if(i==2)
            {
                System.out.println("Third Largest Element is: "+arr[arr.length-3]);
            }
        }
        System.out.println(Arrays.toString(arr));

        //2nd method
        int arr1[] = {32,54,12,34,65};
        Arrays.sort(arr1);
        System.out.println("First Largest element is: "+arr1[arr1.length-1]);
        System.out.println("Second Largest Element is: "+arr1[arr1.length-2]);
        System.out.println("Third Largest Element is: "+arr1[arr1.length-3]);




    }
}
