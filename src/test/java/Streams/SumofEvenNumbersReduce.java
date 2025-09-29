package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumofEvenNumbersReduce {

    public static void main(String[] args) {

        //you need to remove the  duplicates and then find the sum of even numbers.

        Integer[] arr = {21,23,34,56,22,76,87,98,45,36,76,75,56,22,21,98};
        Set<Integer> s1 = new HashSet<>(Arrays.asList(arr));
        System.out.println("Remove duplicates: "+s1);
        int sum = s1.stream().filter(num -> num%2 == 0).reduce(0,Integer::sum);
        System.out.println("Sum of even numbers: "+sum);
        System.out.println("Count number of elements after removing duplicates "+s1.stream().count());



    }
}
