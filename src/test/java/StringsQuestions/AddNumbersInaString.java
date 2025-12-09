package StringsQuestions;

import java.io.CharConversionException;

public class AddNumbersInaString {

    public static void main(String[] args) {

        String str = "Moha2nm4jk9jklj6";
        int sum=0;
        for(char c : str.toCharArray())
        {
            if(Character.isDigit(c))
            {
                sum = sum + Character.getNumericValue(c);
            }
        }
        System.out.println(sum);

        /*String s = digits.toString();
        int num = Integer.parseInt(s);
        int sum=0;
        while(num>0)
        {
            int rem = num%10;
            sum =sum +rem;
            num=num/10;
        }
        System.out.println(sum);*/



    }
}
