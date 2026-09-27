/*
import java.util.ArrayList;
public class BankAccount {
    String owner;
    double balance;
    ArrayList<Transaction> transactions = new ArrayList<>();

    public BankAccount(String owner, double startBalance) {
        this.owner = owner;
        transactions.add(new Transaction("deposit", startBalance));
    }

    public void deposit(double amount) {
        transactions.add(new Transaction("deposit", amount));
    }

    public void withdraw(double amount) {
        transactions.add(new Transaction("withdraw", amount));
    }

    public void transactionHistory() {
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }
    }

    public void getBalance() {

        for (int i = 0; i < transactions.size(); i++) {
            Transaction x = transactions.get(i);
            if (x.type == "deposit") {
                balance = balance + x.amount;

            }
            if (x.type == "withdraw") {
                balance = balance - x.amount;

            }

        }
        System.out.println("Final balance: " + balance);


    }
}

 */
