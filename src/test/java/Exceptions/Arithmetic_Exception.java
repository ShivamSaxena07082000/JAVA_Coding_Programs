package Exceptions;

public class Arithmetic_Exception {

    int method_exceptions()
    {
        try
        {
            return 54/0;
        }
        catch(Exception e )
        {
            return 0;
        }
    }


    public static void main(String[] args) {

        Arithmetic_Exception obj = new Arithmetic_Exception();
        int ab=obj.method_exceptions();
        System.out.println("Value of ab is: " + ab);

    }
}
