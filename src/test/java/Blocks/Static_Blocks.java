package Blocks;

//Static block is used to write the logic that needs to be executed only once when the class is loaded.
//Static blocks are executed in the order they are defined in the class.
//Inside the class we are able to declare multiple static blocks.
//user dont need to create any instance of the class to execute static block.
//Static blocks can be used to initialize static variables or perform actions that need to occur only once

public class Static_Blocks {

    static{
        System.out.println("Static block 1");
    }
    static{
        System.out.println("Static block 2");
    }

    Static_Blocks() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {

        Static_Blocks instance1 = new Static_Blocks();
        Static_Blocks instance2 = new Static_Blocks();
        Static_Blocks instance3 = new Static_Blocks();
    }
}
