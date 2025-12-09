package StringsQuestions;

import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        //length
        if(str1.length() != str2.length())
        {
            System.out.println("Strings are not anagram");
        }
        else {
            char [] ch_arr1 =str1.toCharArray();
            char [] ch_arr2 = str2.toCharArray();
            Arrays.sort(ch_arr1);
            Arrays.sort(ch_arr2);
            if(Arrays.equals(ch_arr1,ch_arr2))
            {
                System.out.println("Given strings are anagram");
            }
            else {
                System.out.println("Given strings are not anagram");
            }
        }

    }
}
