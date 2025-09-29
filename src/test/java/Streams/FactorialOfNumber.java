package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial:");
        Integer num = sc.nextInt();
        int[] fac = {1};
        List<Integer> list = Arrays.asList(num);
        list.stream().forEach(n ->{
            for(int i=1;i<=num;i++)
            {
                fac[0] = fac[0] *i;
            }
            System.out.println("Factorial of "+num+" is: "+fac[0]);

        });



    }


}
