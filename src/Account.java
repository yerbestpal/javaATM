import java.util.Scanner;

public class Account {

    // variables
    private String firstName;
    private String lastName;
    private String address;
    private int PIN = 0;
    private double balance = 0;
    private Scanner myScan = new Scanner(System.in);


    // giving object sane name
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    void setFirstName(String first) {
        firstName = first;
    }

    void setLastName(String last) {
        lastName = last;
    }

    void setAddress(String addr) {
        address = addr;
    }

    void generatePIN() {
        PIN = (int) (Math.random() * 9000) + 1000;
    }

    public double setBalance() {
        balance = myScan.nextInt();
        return balance;
    }

    // this setter is used specifically to create a default balance for the test account 'Bob Smith'
    void setTestBalance(double testBalance) {
        balance = testBalance;
    }

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


    void withdrawCash() {
        balance -= myScan.nextInt();
    }

    void depositCash() {
        balance += myScan.nextInt();
    }

}
