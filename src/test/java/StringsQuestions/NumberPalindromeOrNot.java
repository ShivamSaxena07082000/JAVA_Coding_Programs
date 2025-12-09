package StringsQuestions;

public class NumberPalindromeOrNot {

    public static void main(String[] args) {

        int num = 121;
        int s= num;
        int rev=0;
        while(num>0)
        {
            int r = num%10;
            rev = rev*10 + r;
            num=num/10;
        }
        if(s == rev)
        {
            System.out.println(s+ "is a palindrome");
        }
        else
        {
            System.out.println(s+ "is not a palindrome");
        }


    }

}
