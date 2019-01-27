import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    AccountCreator account = new AccountCreator();
    private Scanner myScan = new Scanner(System.in);
    // TODO - eventually replace ArrayList with database
    // ArrayList containing account objects created with AccountCreator
    private ArrayList<AccountCreator> accountList = new ArrayList<>();

    public void login() {

        Scanner accScan = new Scanner(System.in);

        while (true) {

            System.out.println("Welcome. Please choose an option: ");
            System.out.println("1: Login");
            System.out.println("2: Administrator Settings");
            int menuInput = accScan.nextInt();

            switch (menuInput) {

                case 1: // login
                    System.out.println("Please choose an account to login to: ");
                    System.out.println("PIN for Bob Smith is: " + accountList.get(0).getPIN());
                    System.out.println("PIN for Jane Jones is: " + accountList.get(1).getPIN());
                    System.out.println("Don't forget that Bob and Jane are just default applications, and you can add " +
                            "as many accounts as you would like within the limits of ArrayList!");
                    TextSpacer();
                    ViewAccounts();
                    int a = accScan.nextInt();

                    for (int b = 0; b < accountList.size(); b++) {

                        for (int attempts = 3; attempts >= 0; attempts--) {

                            if (a == b) {

                                System.out.println("Please enter the PIN for " + accountList.get(a) + ": ");
                                int c = accScan.nextInt();
                                if (c == accountList.get(a).getPIN()) {

                                    System.out.println("pin is correct");
                                    TextSpacer();
                                    userMenu(accountList.get(a));

                                } else if (attempts == 0) {

                                    System.out.println("Too many attempts.");
                                    System.exit(0);

                                } else {

                                    System.out.println("pin is incorrect, please try again.");
                                    //  ensuring correct grammar if their is only 1 attempt left

                                    if (attempts != 1) {

                                        System.out.println("You have " + attempts + " attempts");

                                    } else {

                                        System.out.println("You have " + attempts + " attempt");

                                    }

                                }
                            }
                        }

                    }
                    break;
                case 2: // administrator settings
                    Admin:
                    { // block is useful for creating a point to break out of loops!
                        int passcode;

                        for (int attempts = 3; attempts >= 0; attempts--) {

                            System.out.println("Please enter the administrators passcode: "); // passcode is 1234
                            passcode = myScan.nextInt();

                            if (passcode == 1234) {

                                System.out.println("Correct");
                                TextSpacer();
                                break;

                            } else {

                                System.out.println("Passcode is incorrect, please try again.");
//                    ensuring correct grammar if their is only 1 attempt left

                                if (attempts != 1) {

                                    System.out.println("You have " + attempts + " attempts");

                                } else {

                                    System.out.println("You have " + attempts + " attempt");

                                }
                                if (attempts == 0) {

                                    break Admin;

                                }
                            }
                        }

                        admin();
                        break;

                    }
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }

        }

    }


    // main menu for user to choose options
    public void userMenu(AccountCreator account) {

        while (true) {

            System.out.println("Welcome. Please choose an option");
            System.out.println("1: Display Balance");
            System.out.println("2: Withdraw Cash");
            System.out.println("3: Deposit Cash");
            System.out.println("4: Transfer Cash");
            System.out.println("5: Mini Statement");
            System.out.println("6: Change PIN");

            int menuInput = this.myScan.nextInt();

            switch (menuInput) {

                case 1:
                    // display balance
                    System.out.println("Balance: £" + account.getBalance());
                    TextSpacer();
                    break;
                case 2:
                    // withdraw cash
                    System.out.println("How much would you like to withdraw?");
                    account.withdrawCash();
                    System.out.println("Balance: £" + account.getBalance());
                    TextSpacer();
                    break;
                case 3:
                    // deposit cash
                    System.out.println("How much cash would you like to deposit?");
                    account.depositCash();
                    System.out.println("Balance: £" + account.getBalance());
                    TextSpacer();
                    break;
                case 4:
                    // TODO - Transfer cash to other accounts
                    break;
                case 5:
                    // TODO - mini statement
                    break;
                case 6:
                    // change pin
                    System.out.println("Your current PIN is " + account.getPIN());
                    System.out.println("Would you like to change your PIN?");
                    System.out.println("1: yes || 2: no");
                    int decision = myScan.nextInt();

                    switch (decision) {

                        case 1:
                            //change pin
                            account.setPIN();
                            System.out.println("Your new PIN is " + account.getPIN());
                            break;
                        case 2:
                            // don't change pin
                            System.out.println("Your PIN remains " + account.getPIN());
                            break;
                        default:
                            System.out.println("Please select option 1 or 2");

                    }

                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;

            }


        }

    }


    private void admin() {

        while (true) {

            System.out.println("1: Add Account");
            System.out.println("2: Remove Account");
            System.out.println("3: View Account Details");
            System.out.println("4: Edit Accounts");
            System.out.println("5: Back to main menu");
            int menuScan = myScan.nextInt();

            Scanner accScan = new Scanner(System.in);
//                     create new instance of AccountCreator


            switch (menuScan) {

                case 1:
//                          add account
                    System.out.println("Please enter the following account details: ");
                    System.out.println("First name: ");
                    account.setFirstName(accScan.nextLine());
                    System.out.println("Last name: ");
                    account.setLastName(accScan.nextLine());
                    System.out.println("Full address: ");
                    account.setAddress(accScan.nextLine());
                    account.setPIN();
                    System.out.println("New account PIN is: " + account.getPIN());
                    accountList.add(account);
                    break;
                case 2:
                    System.out.println("Please select one of the following accounts to remove by entering the corresponding number: ");
                    System.out.println();
                    ViewAccounts();
                    TextSpacer();
                    int a = accScan.nextInt();

                    for (int b = 0; b < accountList.size(); b++) {

                        if (a == b) {

                            accountList.remove(a);

                        }

                    }
                    break;
                case 3:
                    System.out.println("Please select one of the following accounts to view by entering the corresponding number: ");
                    System.out.println();
                    ViewAccounts();
                    TextSpacer();
                    int c = accScan.nextInt();

                    for (int d = 0; d < accountList.size(); d++) {

                        if (c == d) {

                            System.out.println(accountList.get(c));
                            System.out.println("First name: " + accountList.get(c).getFirstName());
                            System.out.println("Last name: " + accountList.get(c).getLastName());
                            System.out.println("Full address: " + accountList.get(c).getAddress());
                            System.out.println("PIN number: " + accountList.get(c).getPIN());
                            TextSpacer();

                        }

                    }
                    break;
                case 4:
//                      view and edit accounts
                    System.out.println("Please select one of the following accounts to edit by entering the corresponding number: ");
                    System.out.println();
                    ViewAccounts();
                    TextSpacer();
                    int m = accScan.nextInt();
                    accScan.nextLine(); // This must always be placed between the last .next...() and a following .nextLine()

                    for (int l = 0; l < accountList.size(); l++) {

                        if (m == l) {

                            System.out.println(accountList.get(m));
                            System.out.println("Please enter the following account details: ");
                            System.out.println("First name: ");
                            accountList.get(m).setFirstName(accScan.nextLine());
                            System.out.println("Last name: ");
                            accountList.get(m).setLastName(accScan.nextLine());
                            System.out.println("Full address: ");
                            accountList.get(m).setAddress(accScan.nextLine());

                            System.out.println("The new account details are as follows: ");
                            System.out.println("First name: " + accountList.get(m).getFirstName());
                            System.out.println("Last name: " + accountList.get(m).getLastName());
                            System.out.println("Full address: " + accountList.get(m).getAddress());

                        }

                    }

                    break;
                case 5:
//                  back to main menu
                    return;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
        }

    }


    private void ViewAccounts() {
//      view accounts
//      iterates through accountList and prints contents alongside position number
        for (int k = 0; k < accountList.size(); k++) {

            System.out.print(k + ": " + accountList.get(k) + " || ");

        }
    }


    private void TextSpacer() {

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();

    }


    // creates default accounts for testing purposes
    // Two are necessary to test cash transfer capabilities
    public void TestAccount1() {

        AccountCreator account = new AccountCreator();
        account.setFirstName("Bob");
        account.setLastName("Smith");
        account.setAddress("5 Rain Road");
        account.setPIN();
        account.setTestBalance(300);
        accountList.add(account);

    }

    public void TestAccount2() {

        AccountCreator account = new AccountCreator();
        account.setFirstName("Jane");
        account.setLastName("Jones");
        account.setAddress("16 Sun Street");
        account.setPIN();
        account.setTestBalance(3799);
        accountList.add(account);

    }
}

