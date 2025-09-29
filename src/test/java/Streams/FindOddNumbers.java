package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOddNumbers {

    public static void main(String[] args) {

        Integer arr[] = {1,2,3,4,5,21,22,24,26,23};

        List<Integer> oddNumbers = new ArrayList<>(Arrays.asList(arr));
        oddNumbers.stream().forEach(num -> {
            if(num %2 ==0)
                System.out.println(num+" is even");
            else
                System.out.println(num+" is odd");
        });

    }
}
