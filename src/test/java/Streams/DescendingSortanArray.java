package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingSortanArray {

    public static void main(String[] args) {

        Integer []a = {32,41,12,35,2,3,14};
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(a));
        List<Integer> l =list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Descending order: "+l);
    }
}
