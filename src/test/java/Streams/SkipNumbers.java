package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SkipNumbers {

    public static void main(String[] args) {

        Integer []a = {12,23,34,45,56,67,78,89};
        List<Integer> list = Arrays.asList(a);
        List<Integer> s = list.stream().skip(7).collect(Collectors.toList());
        System.out.println(s);

    }
}
