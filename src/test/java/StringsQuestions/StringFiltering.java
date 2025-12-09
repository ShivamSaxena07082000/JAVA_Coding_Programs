package StringsQuestions;

import java.util.Arrays;

public class StringFiltering {

    public static void main(String[] args) {

        String str = "3aBcA1bC2"; //abcABC123

        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        for(char character : str.toCharArray()) {
            if (Character.isLowerCase(character)) {
                lower.append(character);
            } else if (Character.isUpperCase(character)) {
                upper.append(character);
            } else if (Character.isDigit(character)) {
                digits.append(character);
            }
        }

       char[] lower_strings = lower.toString().toCharArray();
       char [] upper_strings = upper.toString().toCharArray();
       char[] digit_strings= digits.toString().toCharArray();

       Arrays.sort(lower_strings);
       Arrays.sort(upper_strings);
       Arrays.sort(digit_strings);
       System.out.println(new String(lower_strings) + new String(upper_strings) + new String(digit_strings));

    }
}
