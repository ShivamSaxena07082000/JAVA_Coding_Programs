import java.lang.*;
class Abc
{
    public static void main(String []args)
    {
        int a = 16;
        int c = 23;
        float b= 2345.644f;
        int absolute_value = -34;
       System.out.println(Math.PI);

       System.out.println("Squuare Root:"+Math.sqrt(a));
       System.out.println("Power of a number:"+Math.pow(a,2));
       System.out.println("Round function:"+Math.round(b));
        System.out.println("Max function:"+Math.max(a,c));
        System.out.println("Min function:"+Math.min(a,c));
        System.out.println("Absolute value:"+Math.abs(absolute_value));
        System.out.println("Random value:"+Math.random());

        System.out.println(Math.sin(a));
        System.out.println(Math.cos(a));
        System.out.println(Math.tan(a));

    }
}