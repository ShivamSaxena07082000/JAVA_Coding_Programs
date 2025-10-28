package DateConcept;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

    public static void main(String[] args) {

        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String s = sdf.format(dt);

        System.out.println(s);
        System.out.println(dt.toString());

    }
}
