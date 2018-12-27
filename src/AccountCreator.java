public class AccountCreator {

    // variables
    String firstName;
    String lastName;
    String address;
    String pin;
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
