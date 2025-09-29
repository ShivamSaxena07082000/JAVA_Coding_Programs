package Blocks;


// Instance blocks are executed every time an instance of the class is created.
// They are executed in the order they are defined in the class.
// Instance blocks can be used to initialize instance variables or perform actions that need to occur every time


public class Instance_Block {

    {
        int a=23;
        System.out.println("Instance block 1");
    }

    {
        System.out.println("Instance block 2");
    }

    Instance_Block()
    {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {

        Instance_Block instance1 = new Instance_Block();
        Instance_Block instance2 = new Instance_Block();
        Instance_Block instance3 = new Instance_Block();

    }
}
