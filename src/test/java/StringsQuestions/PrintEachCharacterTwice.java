package StringsQuestions;

public class PrintEachCharacterTwice {

    public static void main(String[] args) {

        String str = "Hello";
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray())
        {
            if(c == 'l')
            {
                result.append(c);
            }
            else
            {
                result.append(c).append(c);
            }
        }
        System.out.println(result);

    }
}
