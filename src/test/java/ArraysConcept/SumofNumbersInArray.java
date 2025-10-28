package ArraysConcept;

public class SumofNumbersInArray {

    public static void main(String[] args) {

        int arr[] = {32,43,14,56,77};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all elements in an array is: "+sum);
    }
    
}
