package Constructor;

//Constructor Name should be same as the class name.
//Constructor should not return any value.
//Constructor have no return type.
//Constructor should be called when an object of the class is created.
//Constructor can be used to initialize instance variables.
//Constructor can be overloaded.
//Constructor can have parameters.
//Constructor can be public,Protected,default and private
//There should be no same constructor in the class.
//Constructor can be public, protected, or private.
//Constructor cannot be static,final, or abstract.

public class Constructor_A {

    Constructor_A()
    {
        System.out.println("Constructor_A is called");
    }



    public static void main(String[] args) {

        new Constructor_A(); // This will call the constructor and print the message


    }
}
