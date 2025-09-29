package ArraysConcept;

import java.util.Scanner;

public class OneDArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int []arr1 = {5,6,7,8};
        int arr2[] = {9,10,11,12};

        //foreach loop
        for(int i : arr)
        {
            System.out.println("Array of arr= "+i);
        }
        for(int j : arr1)
        {
            System.out.println("Array of arr1= "+j);
        }
        for(int k: arr2)
        {
            System.out.println("Array of arr2= "+k);
        }

        //2nd Method to declare an array at RunTime

        int[] arr3 = new int[4];
        int []arr4 = new int[5];
        int arr5[] = new int[6];
        System.out.println("Enter an arr3");
        for(int i=0;i<arr3.length;i++)
        {
            Scanner sc = new Scanner(System.in);
            arr3[i] = sc.nextInt();
        }
        for(int j : arr3)
        {
            System.out.println("Array of arr3= "+j);
        }

        System.out.println("Enter an arr4");
        for(int i=0;i<arr4.length;i++)
        {
            Scanner sc = new Scanner(System.in);
            arr4[i] = sc.nextInt();
        }
        for(int j : arr4)
        {
            System.out.println("Array of arr3= "+j);
        }
    }


}
