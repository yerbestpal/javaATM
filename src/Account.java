import java.util.Scanner;

public class Account {

    // variables
    private String firstName;
    private String lastName;
    private String address;
    private int PIN = 0;
    private double balance = 0;
    Scanner myScan = new Scanner(System.in);


    // giving object sane name
    @Override
    public String toString() {

        return firstName + " " + lastName;

    }


    // set

    public void setFirstName(String first) {

        firstName = first;

    }


    public void setLastName(String last) {

        lastName = last;

    }


    public void setAddress(String addr) {

        address = addr;

    }


    public int setPIN() {


        PIN = (int) (Math.random() * 9000) + 1000;
        return PIN;

    }


    public double setBalance() {

        balance = myScan.nextInt();
        return balance;

    }


    // this setter is used specifically to create a default balance for the test account 'Bob Smith'
    public void setTestBalance(double testBalance) {

        balance = testBalance;

    }


    // get

    public String getFirstName() {

        return firstName;

    }


    public String getLastName() {

        return lastName;

    }


    public String getAddress() {

        return address;

    }


    public int getPIN() {

        return PIN;

    }


    public double getBalance() {
        return balance;
    }


    // other custom methods

    public void withdrawCash() {

        balance -= myScan.nextInt();

    }


    public void depositCash() {

        balance += myScan.nextInt();

    }

}
