import javax.swing.text.View;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    //     ArrayList containing user bank accounts
    // TODO - eventually replace ArrayList with database
    ArrayList<AccountCreator> accountList = new ArrayList<AccountCreator>();
    Scanner menuScan = new Scanner(System.in);

    //     main menu for user to choose options
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
//                     call admin method
                    admin();
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }


        }

    }

    //     case 7: administrator settings
    public void admin() {


        for (int i = 4; i > 0; i--) {
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
//                     create new instance of AccountCreator
                    AccountCreator account = new AccountCreator();

                    switch (j) {
                        case 1:
//                             add account
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
                            ViewAccounts();
                            TextSpacer();
                            break;
                        case 4:
//                          view and edit accounts
                            System.out.println("Please select one of the following accounts to edit by entering the corresponding number: ");
                            System.out.println();
                            ViewAccounts();
                            TextSpacer();

                            int m = accScan.nextInt();
                            for (int l = 0; l < accountList.size(); l++) {
                                if (m == l) {
                                    System.out.println(accountList.get(m));
                                    System.out.println("Please enter the following account details: ");
                                    System.out.println("First name: ");
                                    accountList.get(m).setFirstName(accScan.next());
                                    System.out.println("Last name: ");
                                    accountList.get(m).setLastName(accScan.next());
                                    System.out.println("Full address: ");
                                    accountList.get(m).setAddress(accScan.next());

                                    System.out.println("The new account details are as follows: ");
                                    System.out.println("First name: " + accountList.get(m).firstName);
                                    System.out.println("Last name: " + accountList.get(m).lastName);
                                    System.out.println("Full address: " + accountList.get(m).address);

                                }
                            }

                            break;
                        case 5:
//                          back to main menu
                            return;
                        default:
                            System.out.println("Please choose a valid option");
                            break;
                    }


                } else {
                    System.out.println("Passcode is incorrect, please try again.");
                    System.out.println("You have " + i + " more attempt");
                    if (i == 0) {
                        System.out.println("You have tried too many times");
                        return;
                    }
                }


            }
        }
    }


    public void AddAccounts() {

    }


    public void ViewAccounts() {
//      view accounts
//      iterates through accountList and prints contents alongside position number
        for (int k = 0; k < accountList.size(); k++) {
            System.out.print(k + ": " + accountList.get(k) + " || ");
        }
    }


    public void TextSpacer() {
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();
    }
}

