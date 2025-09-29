package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctNumbers {

    public static void main(String[] args) {

        Integer []arr = {22,34,54,22,12,34,43,54};
        List<Integer> list = Arrays.asList(arr);
        List<Integer> l = list.stream().distinct().collect(Collectors.toList());
        System.out.println(l);

    }

}
