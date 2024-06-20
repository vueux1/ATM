import java.util.Scanner;

public class Login {

    public boolean login(Account account){
        Scanner scanner1 = new Scanner(System.in);
        String usser_name;
        String pass_word;


        usser_name = scanner1.nextLine();
        System.out.println("Enter your password: ");
        pass_word = scanner1.nextLine();


       if (account.getUssername().equals(usser_name) && account.getPassword().equals(pass_word)){
           System.out.println("Login successful.");
           return true;
       }
       else {
           System.out.println("Login failed.");
           return false;
       }
    }

}
