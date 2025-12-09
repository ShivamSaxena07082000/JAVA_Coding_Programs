package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListConcept {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Orange");
        list1.add("Grapes");

        //insertion using index
        list1.add(2,"Mangoes");

        System.out.println(list1);

        //Accessing elements
        System.out.println("Accessing element= "+list1.get(3));

        //replacing
        list1.set(1,"Pineapple");
        System.out.println("After replace= "+list1);

        //removing
        list1.remove(2);
        System.out.println("After removing= "+list1);

        //size of an array
        System.out.println("Number of elements in an array= "+list1.size());

        //how many ways to print the arraylist

        //1) For Each
        for(String l1 : list1)
        {
            System.out.println(l1);
        }

        //2) Iterator
        Iterator<String> it =  list1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //3) ListIterator
        System.out.println("Using List Iterator");
        ListIterator<String> lit= list1.listIterator();
        while(lit.hasNext())
        {
            System.out.println(lit.next());
        }

        while(lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }

        //lambda expression
        System.out.println("Lambda Expressions");
        list1.forEach(fruits -> System.out.println(fruits));

        //Streams
        System.out.println("Using Streams");
        list1.stream().forEach(System.out::println);

        //Method reference
        System.out.println("Method Reference");
        list1.forEach(System.out::println);

    }
}
