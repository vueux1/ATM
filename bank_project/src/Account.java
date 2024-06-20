public class Account {

    private String Ussername;
    private String Password;
    private int balance;

    public Account(String Ussername, String Password, int balance) {
        this.setUssername(Ussername);
        this.setPassword(Password);
        this.setBalance(balance);
    }


    public String getUssername() {
        return Ussername;
    }

    public void setUssername(String ussername) {
        Ussername = ussername;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit(int amount){
        this.balance += amount;
        System.out.println("New balance: " + this.balance);
    }
    public void withdraw(int amount){
        if (amount > 2000){
            System.out.println("You can't withdraw more than 2000$ in a day.");
        }
        else if (balance - amount < 0){
            System.out.println("Insufficient balance. Your balance: " + balance);
        }
        else {
            this.balance -= amount;
            System.out.println("New balance: " + balance);
        }
    }
}
