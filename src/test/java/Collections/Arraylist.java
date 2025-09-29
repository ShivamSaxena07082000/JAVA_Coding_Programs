package Collections;

import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();

        //ading elements
        list.add("JAVA");
        list.add("C++");
        list.add("Python");
        list.add("JavaScript");

        //Access Elements
        System.out.println("Array List are:" + list);
        System.out.println("First element in the list is: " +list.getFirst());
        System.out.println("Last element in the list is: " +list.getLast());
        System.out.println("Element at index 2 is: " +list.get(2));

        Iterator<String> list_values = list.iterator();
        while(list_values.hasNext())
        {
            System.out.println("List values are using iterator: " + list_values.next());
        }

        ListIterator<String> list_values1 = list.listIterator();
        while(list_values1.hasNext())
        {
            System.out.println("List values are using Listiterator: " + list_values1.next());
        }

        //Removing elements
        //list.removeFirst();
        //list.removeLast();

        System.out.println("After removing first and last elements, the list is: " + list);


    }

}
