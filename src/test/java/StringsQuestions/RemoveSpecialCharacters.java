package StringsQuestions;

public class RemoveSpecialCharacters {

    public static void main(String[] args) {

        String str1 = "Shiv@m%$#213*765";

        //Remove all Special Characters
        System.out.println(str1.replaceAll("[^a-zA-Z0-9]",""));

        //get only characters
        System.out.println(str1.replaceAll("[^a-zA-Z]",""));

        //get only characters
        System.out.println(str1.replaceAll("[^a-zA-Z]",""));

        String str2 = "This& is @ Shivam";
        System.out.println(str2.replaceAll("[^a-zA-z\\s]",""));

        String str4 = "I                         am    an       Indian   staying";
        System.out.println(str4.replaceAll("\\s+"," "));

    }
}
