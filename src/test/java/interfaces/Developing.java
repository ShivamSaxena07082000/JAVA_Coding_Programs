package interfaces;

public class Developing implements BankingClient,DomainClient {

    public void deposit(){
        System.out.println("Deposit method implemented");
    }

    public void withdraw()
    {
        System.out.println("Withdraw method implemented");
    }
    public void checkBalance()
    {
        System.out.println("Check Balance method implemented");
    }
    public void logininBankingApplication()
    {
        System.out.println("Login method implemented");
    }
    public void clientName() {
        System.out.println("Client Name method implemented");
    }
    public void clientId() {
        System.out.println("Client ID method implemented");
    }
    public void clientAddress() {
        System.out.println("Client Address method implemented");
    }
    public void clientContact() {
        System.out.println("Client Contact method implemented");
    }

    public static void main(String[] args) {
        BankingClient obj = new Developing();   //Run time Polymorphism
        Developing obj1 = new Developing();
        DomainClient obj2 = new Developing();
        obj1.logininBankingApplication();
        obj.checkBalance();
        obj.deposit();
        obj.withdraw();
        obj2.clientName();
        obj2.clientId();
        obj2.clientAddress();
        obj2.clientContact();

    }

}
