package StringsQuestions;

public class ReverseWordsAndPrint {

    public static void main(String[] args) {

        String str = "Welcome world";            //Welcome world world Welcome
        String words[] = str.split(" ");
        String s = " ";
        for(String word : words) {
            s = word + " " + s;
        }
        System.out.println(str +" "+s);

    }
}
