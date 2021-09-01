class Account {
    private String name;
    private long amount;

    public Account(String name, long amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void deopsit(long amount) {
        this.amount += amount;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}

class SavingAccount extends Account {
    public SavingAccount(long amount) {
        super("Saving", amount);
    }
}
public class AccountDemo {
    public static void main(String[] args) {
        
    }
}
