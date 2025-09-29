package Variables;

public class StaticVariable {

    //Static variable are those variables which are declared inside the class but outside the method with static keyword is called static variable.

    static int a=90;
    //default value of static variable and instance variable is 0.
    //Static variable is initialized by default.
    //Static variable is accessible to all methods of the class.
    //Static variable is stored in heap memory.
    //Static variable is shared between all instances of the class.
    //Static variable is not instance variable.
    //Static variable is not local variable.
    //Static variable is not visible to other classes.

    public static void main(String[] args) {

        System.out.println(StaticVariable.a);
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        System.out.println(a);
        System.out.println(obj2.a);

        a=45;
        a=67;

        System.out.println(a);
        System.out.println(a);



    }
}
