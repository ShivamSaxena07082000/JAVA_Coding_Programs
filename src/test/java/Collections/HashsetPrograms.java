package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class HashsetPrograms {

    public static void main(String[] args) {
        //direct
        HashSet<Object> numbers = new HashSet<>();

        //Upcasting
        Set<Integer> numbers1 = new HashSet<>();

        numbers.add("Rahul");
        numbers.add(2);
        numbers.add("Ayush");
        numbers.add(123.43f);
        numbers.add(true);
        numbers.add(2);

        System.out.println("Size of an  numbers Set: "+numbers.size());
        System.out.println("Removal: "+numbers.remove(123.43f));

        System.out.println("Contains method: "+numbers.contains("Ayush"));

        System.out.println("Using Iterator to print all values: ");
        Iterator<Object> obj = numbers.iterator();
        while(obj.hasNext())
        {
            System.out.println(obj.next());
        }

        System.out.println("Using Lambda expression to print all values: ");
        numbers.forEach(nums -> System.out.println(nums));
        System.out.println("get class: "+numbers.getClass());
        System.out.println("Numbers are empty or not: "+numbers.isEmpty());


        System.out.println(numbers);

        numbers1.add(2);
        numbers1.add(4);
        numbers1.add(70);
        numbers1.add(12);
        System.out.println(numbers1);

    }
}
