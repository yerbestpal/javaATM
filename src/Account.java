import java.util.Scanner;

public class Account {

    private String firstName;
    private String lastName;
    private String address;
    private int PIN = 0;
    private double balance = 0;
    private Scanner myScan = new Scanner(System.in);


    public Account() {

    }

    public Account(String firstName, String lastName, String address, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.PIN = generatePIN();
        this.balance = balance;
    }


    // giving object sane name
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }


    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setBalance(double balance) {this.balance = balance; }


    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getAddress() {
        return address;
    }

    int getPIN() {
        return PIN;
    }

    double getBalance() {
        return balance;
    }


    void withdrawCash() { balance -= myScan.nextInt(); }

    void depositCash() { balance += myScan.nextInt(); }

    int generatePIN() {
        return (int) (Math.random() * 9000) + 1000;
    }

}
