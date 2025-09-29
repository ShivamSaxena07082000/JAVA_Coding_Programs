package Streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbers {

    public static void main(String[] args) {

        Integer arr[] = {1,2,3,4,5,21,22,24,26,23};
        LinkedList<Integer> obj = new LinkedList<>(Arrays.asList(arr));
        List<Integer> list = obj.stream().filter(num -> num%2 == 0).collect(Collectors.toList());
        System.out.println(list);

    }

}
