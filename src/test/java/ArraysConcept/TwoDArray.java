package ArraysConcept;

public class TwoDArray {

    int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    int [][]arr1 = {{13,14,15,16},{17,18,19,20},{21,22,23,24}};
    int arr2[][] = {{25,26,27,28},{29,30,31,32},{33,34,35,36}};

    public void displayArr()
    {
        for(int i = 0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Array of arr= "+arr[i][j]);
            }
        }
    }

    public void displayArr1()
    {
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.println("Array of arr1= "+arr1[i][j]);
            }
        }
    }

    public void displayArr2()
    {
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                System.out.println("Array of arr2= "+arr2[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        TwoDArray obj  = new TwoDArray();
        obj.displayArr();
        obj.displayArr1();
        obj.displayArr2();
    }

}
