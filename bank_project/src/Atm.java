import java.util.Scanner;

public class Atm {

    public void work(Account account){

        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM.");

        System.out.println("******************************");
        System.out.println("Enter your ussername: ");
        System.out.println("******************************");

        int loginAttempt = 3;

        while (true){
            if (login.login(account)){
                break;
            }
            else {
                loginAttempt--;
                System.out.println("Login failed. " + loginAttempt + " attempts left.");
            }
            if (loginAttempt == 0){
                System.out.println("Your account has been blocked.");
                return;
            }
        }

        System.out.println("******************************");
        String operations = "1. Balance inquiry\n"
                + "2. Deposit\n"
                + "3. Withdraw\n"
                + "4. Exit for press q";
        System.out.println(operations);
        System.out.println("******************************");

        while (true){
            System.out.println("Choose an operation: ");
            String operation = scanner.nextLine();

            if (operation.equals("q")){
                break;
            }
            else if (operation.equals("1")){
                System.out.println("Balance: " + account.getBalance());
            }
            else if (operation.equals("2")){
                System.out.println("Enter the amount you want to deposit: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.deposit(amount);
            }
            else if (operation.equals("3")){
                System.out.println("Enter the amount you want to withdraw: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.withdraw(amount);
            }
            else {
                System.out.println("Invalid operation.");
            }
        }
    }

}
