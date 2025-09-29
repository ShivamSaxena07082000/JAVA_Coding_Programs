package Exceptions;

public class NullPointer_Exception {

    void method()
    {
        try
        {
            String a = null;
            if(a.equals("shivam"))
            {
                System.out.println("String is not null");
            }
            else
            {
                System.out.println("String is null");
            }

        }
        catch(NullPointerException np)
        {
            System.out.println(np);
        }
    }

    public static void main(String[] args) {

        NullPointer_Exception obj = new NullPointer_Exception();
        obj.method();

    }

}
