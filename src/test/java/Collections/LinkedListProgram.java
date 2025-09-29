package Collections;
import java.util.*;

public class LinkedListProgram {

    public static void main(String[] args) {

        LinkedList<Integer> arr = new LinkedList<>();
        arr.add(30);
        arr.add(40);
        arr.add(150);
        arr.add(60);
        arr.add(70);
        arr.add(40);
        System.out.println(arr);

        arr.addFirst(-30);
        arr.addLast(1000);
        System.out.println(arr);

        //accessing the elements
        System.out.println(arr.get(0));
        System.out.println("Get First Element using getFirst() = "+arr.getFirst());
        System.out.println("Get Last Element using getLast() = "+arr.getLast());

        Iterator<Integer> arr2 = arr.descendingIterator();
        while(arr2.hasNext())
        {
            System.out.println("Descending order-: "+arr2.next());
        }

        System.out.println("containsoff= "+arr.contains(56));

        System.out.println("Index of= "+arr.indexOf(70));

        System.out.println("LastIndex of= "+arr.lastIndexOf(40));

        System.out.println("Array is:" +arr);

        System.out.println("Remove first element: "+arr.remove() +arr);

        System.out.println("Remove third element: "+arr.remove(2) +arr);

        System.out.println("Remove last element: "+arr.removeLast() +arr);

        System.out.println(arr.removeLastOccurrence(65));

        System.out.println(arr);

        int a = arr.peek();  //gives the first element
        int b = arr.peekFirst();  //gives the first element
        int c = arr.peekLast();   //gives the last element
        boolean d=arr.isEmpty();
        arr.push(56);  //adds the element at first position
        arr.push(78);
        arr.push(90);
        System.out.println(a+" "+b+" "+c+" "+d+" "+arr);

        //lambda expression to print all the elements
        arr.forEach(abcd  -> System.out.println(abcd));
    }

}
