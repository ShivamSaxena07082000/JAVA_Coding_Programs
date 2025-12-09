package StringsQuestions;

public class ReverseEachWordOfAString {

    public static void main(String[] args) {

        String str = "My Name is Venkata";   //muineleS htiw avaj
        String words[] =str.split(" ");
        for(String word: words)
        {
            System.out.print(new StringBuilder(word).reverse().toString());
            System.out.print(" ");
        }
    }
}
