package interfaces;

//interface contains methods without a body. The Implementation of the methods is done in the class that implements the interface.
//By default, all methods in an interface are abstract and public.
//A class can implement multiple interfaces, providing a way to achieve multiple inheritance in Java.
//Interfaces are used to define a contract that implementing classes must adhere to, ensuring a certain level

public interface BankingClient {

    void deposit();
    void withdraw();
    void checkBalance();

}
