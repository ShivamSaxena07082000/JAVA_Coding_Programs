package StringsQuestions;

public class PalindromeOrNot {

    public static void main(String[] args) {

        //1)
        String str = "malayalam";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("String is a palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }

        //2)
        String str1="madam";
        boolean isPalindrome=true;
        for(int i=0;i<str1.length()/2;i++)
        {
            if(str1.charAt(i) != str1.charAt(str1.length()-i-1))
            {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
        {
            System.out.println(str1+ " is a palindrome");
        }
        else
        {
            System.out.println(str1+ " is not a palindrome");
        }


    }

}
