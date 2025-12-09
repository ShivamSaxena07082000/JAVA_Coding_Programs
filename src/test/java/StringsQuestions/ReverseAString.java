package StringsQuestions;

public class ReverseAString {

    public static void main(String[] args) {

        //1)
        String str = "Shivam";
        StringBuilder result = new StringBuilder();
        for(int i = str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }

        //2) Using String Builder
        System.out.println("Using String Builder");
        System.out.println(new StringBuilder(str).reverse().toString());



    }

}
