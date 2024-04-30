package basic.ex3.ex_2;

public class Account {

    int balance = 0;

    public int deposit(int amount){
        System.out.println(amount + " 원 입금");
        System.out.println("잔액 : " + (balance + amount));
        return balance += amount;
    }

    public boolean withdraw(int amount){
        if (balance < amount){
            System.out.println("잔액부족");
            return false;
        }else {
            System.out.println("출금  " + amount);
            System.out.println("잔고 : " + (balance -= amount));
            return true;
        }
    }
}

