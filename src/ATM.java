/*
 * Author: Ross McLean
 * Proof of concept ATM program to for practice
 */

public class ATM {

    public static void main(String[] args) {

        Menu menu = new Menu();
        // 2 accounts are necessary to test cash transfer capabilities
        menu.testAccountBuilder("Bob", "Smith", "5 Rain Road", 300);
        menu.testAccountBuilder("Jane", "Jones", "16 Sun Street", 3799);
        menu.login();

        Account account = new Account();

    }

}
