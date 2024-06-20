public class Main {

    public static void main(String[] args) {

        Atm atm = new Atm();

        Account account = new Account("Alp", "1234", 5000);

        atm.work(account);
        System.out.println("Logging out of your account");
    }

}
