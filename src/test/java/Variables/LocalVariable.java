package Variables;

public class LocalVariable {

    //This is a local variable. We can access local variable only inside the method.
    //Local variable is not accessible outside the method.
    //Local variable is not initialized by default.
    //Local variable must be initialized before use.
    //Local variable is stored in stack memory.
    //Local variable is not a class variable or instance variable.
    //Local variable is not shared between instances of the class.
    //Local variable is not static.
    //Local variable is not visible to other methods in the class.
    //Local variable is not visible to other classes.
    public void method()
    {
        int var1=10;
        System.out.println(var1);
    }

    public static void main(String[] args) {

        int var1=20;
        System.out.println(var1);


    }

}

