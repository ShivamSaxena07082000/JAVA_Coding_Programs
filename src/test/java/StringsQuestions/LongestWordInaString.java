package StringsQuestions;

public class LongestWordInaString {

    public static void main(String[] args) {

        String str = "My Name is Venkata";   //muineleS htiw avaj
        String words[] =str.split(" ");
        String longestWord="";
        for(String word: words)
        {
            if(word.length() > longestWord.length())
            {
                longestWord = word;
            }
        }
        System.out.println("Longest word is: "+longestWord);

    }
}
