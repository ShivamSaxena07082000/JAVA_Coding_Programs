package ArraysConcept;

public class CheckArrayInAscendingOrDescending {

    public static void main(String[] args) {

        //int arr[] = {12,43,154,176};
        int arr[] = {40,5,20,10};
        boolean isAscending=true;
        boolean isDescending = true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1])
            {
                isAscending = false;
            }
            if(arr[i] < arr[i+1])
            {
                isDescending = false;
            }

        }
        if(isAscending)
        {
            System.out.println("Array is in Ascending Order");
        }
        else if(isDescending)
        {
            System.out.println("Array is in Descending Order");
        }
        else
        {
            System.out.println("Array is not in Ascending nor in Descending");
        }


    }
}
