package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist2 {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        //int []arr = new int[5];
        arr.add("Apple");
        arr.add("Orange");
        arr.add("Bananna");

        arr.add(2,"Grapes");

        System.out.println(arr);

        //access elements-:

        System.out.println("Accessing Grapes: "+arr.get(2));

        //update an element
        arr.set(1,"Pineapple");
        System.out.println(arr);

        //remove a fruit
        arr.remove(2);
        System.out.println("Remove grapes: "+ arr);

        //size of an arrayList
        System.out.println(arr.size());

        //Printing array List with various types
        //1 Method
        System.out.println("Using For Each Loop");
        for(String s : arr)
        {
            System.out.println(s);
        }

        //2ndMethod
        System.out.println("Using Iterator Abstract Method which is present in Iterable interface");
        Iterator<String> list1 = arr.iterator();
        while(list1.hasNext())
        {
            System.out.println(list1.next());
        }

        //3rd Method
        //ListIterator will print values from forward and backward while Iterator will print values from forward only

        System.out.println("Using ListIterator");
        ListIterator<String> arr3 = arr.listIterator();
        while(arr3.hasNext())
        {
            System.out.println(arr3.next());
        }

        while(arr3.hasPrevious())
        {
            System.out.println(arr3.previous());
        }

        ArrayList<Object> obj = new ArrayList<>();
        obj.add(12);
        obj.add("Shivam Saxena");
        obj.add("Rahul");
        obj.add(14);
        System.out.println(obj);

        //access the element
        System.out.println("Accessing the element: "+obj.get(2));

        //update the element
        obj.set(1,"Ayush");
        System.out.println("Updating the element: "+obj);

        //adding the element after 2nd index
        obj.add(2,"Kushagra");
        System.out.println("Adding the element: "+obj);


    }
}
