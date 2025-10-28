package ArraysConcept;

import java.util.*;

public class FindCommonElementfromTwoArray {

    public static void main(String[] args) {

        Integer arr[] = {8,9,5,7,6};
        Integer arr1[] = {12,32,43,6,78};

       // LinkedList<Integer> obj_arr = new LinkedList<>(Arrays.asList(arr));
       // LinkedList<Integer> obj_arr1 = new LinkedList<>(Arrays.asList(arr1));
        Set<Integer> obj_arr = new HashSet<>(Arrays.asList(arr));
        Set<Integer> obj_arr1 = new HashSet<>(Arrays.asList(arr1));
        obj_arr.retainAll(obj_arr1);
        System.out.println("Common Elements are: "+obj_arr);




    }
}
