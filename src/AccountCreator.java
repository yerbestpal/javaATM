public class AccountCreator {

    // variables
    String firstName;
    String lastName;
    String address;
    int PIN = 0;
    double balance = 0;



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

        // TODO - fix error where setLastName only stores the first word of address
        lastName = last;

    }


    public void setAddress(String addr) {

        address = addr;

    }


    public int setPIN() {


        PIN = (int) (Math.random() * 9000) + 1000;
        return PIN;

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

}
