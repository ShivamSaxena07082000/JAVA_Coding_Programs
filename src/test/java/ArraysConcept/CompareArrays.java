package ArraysConcept;

import java.util.Arrays;

public class CompareArrays {

    public static void main(String[] args) {

        int arr[] = {23,43,12,67,87};
        int arr2[] = {23,43,12,67,87};
        if(Arrays.equals(arr,arr2))
        {
            System.out.println("arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }

    }
}
