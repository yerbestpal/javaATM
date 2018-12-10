import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    // initial menu for user to choose options
    public static void menu() {

        ArrayList<AccountData> accountList = new ArrayList<AccountData>();
        AccountData account = new AccountData();

       while(true) {
           System.out.println("Welcome. Please choose an option");
           System.out.println("1: Display Balance");
           System.out.println("2: Withdraw Cash");
           System.out.println("3: Deposit Cash");
           System.out.println("4: Transfer Cash");
           System.out.println("5: Mini Statement");
           System.out.println("6: Change PIN");
           System.out.println("7: Administrator Settings");

           Scanner menuScan = new Scanner(System.in);
           int menuInput = menuScan.nextInt();

           switch (menuInput) {
               case 1:
                   // display balance
                   break;
               case 2:
                   // withdraw cash
                   break;
               case 3:
                   // deposit cash
                   break;
               case 4:
                   // Transfer cash
                   break;
               case 5:
                   // mini statement
                   break;
               case 6:
                   // change PIN
                   break;
               case 7:
                   // admin settings
                   for (int i = 3; i > 0; i--) {
                       System.out.println("Please enter the administrators passcode: "); // passcode is 1234
                       int passcode = menuScan.nextInt();
                       if (passcode == 1234) {System.out.println("Passcode is correct");


                           // contains a nested switch
                           System.out.println("1: Add Account");
                           System.out.println("2: Remove Account");
                           System.out.println("3: View Accounts");
                           int j = menuScan.nextInt();

                           switch (j) {
                               case 1:
                                   // add account
                                   Scanner accScan = new Scanner(System.in);

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
                                   // remove account
                                   break;
                               case 3:
                                   // view accounts
                                   System.out.println(accountList);

//                                default:
//                                    System.out.println("Please choose a valid option");
//                                    break;
                           }

                       } else {
                           System.out.println("Passcode is incorrect, please try again.");
                           System.out.println("You have " + i + " more attempt");
                       }
                       if(i == 0) {System.out.println("You have tried too many times");}
                   }
                   break;
               default:
                   System.out.println("Please choose a valid option");
                   break;
           }
       }

    }

}

