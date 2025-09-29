package interfaces;


interface First_name{
    void first_name();
    void second_name();
}


public class Details implements First_name {

    public void first_name() {
        System.out.println("First name is: Shivam");
    }

    public void second_name() {
        System.out.println("Second name is: Saxena");
    }

    public static void main(String[] args) {
        Details obj = new Details();
        obj.first_name();
    }

}
