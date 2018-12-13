public class AccountData {

    // variables
    String firstName;
    String lastName;
    String address;
    String pin;
    double balance = 0;

    // constructor
    public AccountData() {

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

}
