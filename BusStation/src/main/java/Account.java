import java.text.DecimalFormat;

public class Account {
    private long card;
    private int balance;


    public Account(long card, DecimalFormat balance) {
        this.card = card;
        this.balance = balance;
    }
    public long getCard() {
        return card;
    }
    public DecimalFormat getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "card=" + card +
                ", balance=" + balance +
                '}';
    }
}
