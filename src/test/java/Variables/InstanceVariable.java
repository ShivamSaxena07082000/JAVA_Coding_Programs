package Variables;

public class InstanceVariable {

    //Instance variable are those variables which are declared inside the class but outside the method those are called instance variables.

    int a=23;

    //Instance variable is initialized by default.
    //Instance variable is accessible to all methods of the class.
    //Instance variable is stored in heap memory.
    //Instance variable is shared between all instances of the class.

    public static void main(String[] args) {

        InstanceVariable  obj = new InstanceVariable();
        System.out.println(obj.a);

    }



}
