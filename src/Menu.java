import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    // ArrayList containing user bank accounts
    // TODO - eventually replace ArrayList with database
    ArrayList<AccountData> accountList = new ArrayList<AccountData>();
    Scanner menuScan = new Scanner(System.in);

    // initial menu for user to choose options
    public void menu() {

        while (true) {
            System.out.println("Welcome. Please choose an option");
            System.out.println("1: Display Balance");
            System.out.println("2: Withdraw Cash");
            System.out.println("3: Deposit Cash");
            System.out.println("4: Transfer Cash");
            System.out.println("5: Mini Statement");
            System.out.println("6: Change PIN");
            System.out.println("7: Administrator Settings");


            int menuInput = this.menuScan.nextInt();

            switch (menuInput) {
                case 1:
                    // TODO - display balance
                    break;
                case 2:
                    // TODO - withdraw cash
                    break;
                case 3:
                    // TODO - deposit cash
                    break;
                case 4:
                    // TODO - Transfer cash
                    break;
                case 5:
                    // TODO - mini statement
                    break;
                case 6:
                    // TODO - change PIN
                    break;
                case 7:
                    // call admin method
                    admin();
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }


        }

    }

    // case 7: admin settings
    public void admin() {


        for (int i = 5000; i > 0; i--) {
            System.out.println("Please enter the administrators passcode: "); // passcode is 1234
            int passcode = menuScan.nextInt();

            boolean truthCheck = true;
            while (truthCheck) {
                if (passcode == 1234) {
                    System.out.println("1: Add Account");
                    System.out.println("2: Remove Account");
                    System.out.println("3: View Accounts");
                    System.out.println("4: Edit Accounts");
                    System.out.println("5: Back to main menu");
                    int j = menuScan.nextInt();

                    Scanner accScan = new Scanner(System.in);

                    switch (j) {
                        case 1:
                            // create new instance of AccountData
                            AccountData account = new AccountData();

                            // add account

                            System.out.println("Please enter the following account details: ");
                            System.out.println("First name: ");
                            account.setFirstName(accScan.next());
                            System.out.println("Last name: ");
                            account.setLastName(accScan.next());
                            System.out.println("Full address: ");
                            account.setAddress(accScan.next());

                            accountList.add(account);

                            break;
                        case 2:
                            // TODO - remove account
                            break;
                        case 3:
//                          iterates through accountList and prints contents alongside position number
                            for(int k = 0; k < accountList.size(); k++) {
                                System.out.print(k + ": " + accountList.get(k) + " || ");
                            }
                            System.out.println();
                            System.out.println("-------------------------------------");
                            System.out.println();

                            break;
                        case 4:
                            //TODO - view and edit accounts
                            System.out.println("Please select one of the following accounts to edit by entering the corresponding number: ");
                            System.out.println();

//                            iterates through accountList and prints contents alongside position number
                            for(int k = 0; k < accountList.size(); k++) {
                                System.out.println(k + ": " + accountList.get(k) + " || ");
                            }
                            System.out.println();
                            System.out.println("-------------------------------------");
                            System.out.println();

                            // TODO - find an alternative to switch which will allow me to select on object from arrayList to edit
                            int l = accScan.nextInt();

                            switch(l) {
                                case l:

                            }

                            break;
                        case 5:
                            // back to main menu
                            return;
                        default:
                            System.out.println("Please choose a valid option");
                            break;
                    }


                } else {
                    System.out.println("Passcode is incorrect, please try again.");
                    System.out.println("You have " + i + " more attempt");
                }
                if (i == 0) {
                    System.out.println("You have tried too many times");
                }

            }
        }
    }
}

