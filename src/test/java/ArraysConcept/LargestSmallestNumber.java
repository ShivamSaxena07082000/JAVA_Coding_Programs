package ArraysConcept;

import java.util.Arrays;
import java.util.Scanner;

public class LargestSmallestNumber {

    public static void main(String[] args) {

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i =0;i<arr.length;i++)
        {
            System.out.println("Enter Element "+i+": ");
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.println("Element "+i+" is: "+arr[i]);
        }

        int max = arr[0];
        int min = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            else if(arr[i]<min)
            {
                min = arr[i];
            }
        }

        System.out.println("Largest Element is: "+max);
        System.out.println("Smallest Element is: "+min);

        //2nd method
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
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Largest element is: "+arr[arr.length-1]);
        System.out.println("Smallest element is: "+arr[0]);

    }

}
