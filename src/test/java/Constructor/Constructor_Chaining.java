package Constructor;

public class Constructor_Chaining {

    // Constructor chaining is a technique in which a constructor calls another constructor in the same class or in the parent class.
    // It is used to avoid code duplication and to initialize instance variables in a single place.
    //using this keyword we can call another constructor in the same class.

    Constructor_Chaining() {      //Default Constructor
        this(10); // Calling another constructor in the same class
        System.out.println("Default constructor called");
    }

    Constructor_Chaining(int x) {   //parameterized Constructor
        System.out.println("Constructor with parameter called: " + x);
    }

    public static void main(String[] args) {
        Constructor_Chaining obj = new Constructor_Chaining(); // This will call the default constructor
    }
}
