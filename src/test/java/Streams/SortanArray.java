package Streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortanArray {

    public static void main(String[] args) {

        Integer a[] = {32,41,12,35,2,3,14};
        List<Integer> list = new LinkedList<>(Arrays.asList(a));
        List<Integer> l =list.stream().sorted().collect(Collectors.toList());
        System.out.println(l);

    }




}
