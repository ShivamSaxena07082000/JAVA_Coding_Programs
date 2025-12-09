package StringsQuestions;

import java.util.Arrays;

public class ArrangeStringOntheBasisofLength {

    public static void main(String[] args) {

        String str = "Kushagra Shivam is a best friend";   //Venkata Name My is
        String st[] = str.split(" ");
        String result = "";
        for(int i=0;i<st.length-1;i++)
        {
            for(int j=0;j<st.length-i-1;j++)
            {
                if(st[j].length() < st[j+1].length())
                {
                    result = st[j];
                    st[j] = st[j+1];
                    st[j+1] = result;
                }
            }
        }
        System.out.println(Arrays.toString(st).replaceAll(",",""));
    }


}
