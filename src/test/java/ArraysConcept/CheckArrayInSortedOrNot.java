package ArraysConcept;

public class CheckArrayInSortedOrNot {

    public static void main(String[] args) {

        int arr[] = {12,43,154,176};
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1])
            {
                isSorted= false;
                break;
            }
        }
        if(isSorted)
        {
            System.out.println("Array is in Ascending Order");
        }
        else
        {
            System.out.println("Array is not in Ascending order");
        }

    }
}
