package StringsQuestions;

public class OddEvenIndexCharacter {

    public static void main(String[] args) {

        String str = "IamanIndian";
        StringBuilder evenIndexResult = new StringBuilder();
        StringBuilder oddIndexResult = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(i%2 == 0)
            {
                evenIndexResult.append(str.charAt(i));
            }
            else
            {
                oddIndexResult.append(str.charAt(i));
            }
        }
        System.out.println("Even Index Result: "+evenIndexResult);
        System.out.println("Odd Index Result: "+oddIndexResult);
    }

}
