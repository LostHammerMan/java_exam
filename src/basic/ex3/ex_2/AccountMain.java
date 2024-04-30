package basic.ex3.ex_2;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();



            System.out.println("");
            account.deposit(10000);
            account.withdraw(9000);
            account.withdraw(2000);

    }

}
