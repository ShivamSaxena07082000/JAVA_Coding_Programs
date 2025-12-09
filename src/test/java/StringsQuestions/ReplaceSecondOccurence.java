package StringsQuestions;

public class ReplaceSecondOccurence {

    public static void main(String[] args) {

        String str = "BOOKEEPER";   //BOOKE#PER
        int firstOccurence = str.indexOf('E');
        int secondOccurence = str.indexOf('E',firstOccurence+1);
        System.out.println(str.substring(0,secondOccurence)+"#"+str.substring(secondOccurence+1));

    }

}



