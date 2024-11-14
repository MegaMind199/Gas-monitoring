import db.AccountDAO;
import Modules.Account;

public class Main {


    public static void main(String[] args) {

        AccountDAO accountDAO = new AccountDAO();
        String uniqueNumber = "UN12345";  // Example unique number

        Account account = accountDAO.getAccountByUniqueNumber(uniqueNumber);

        if (account != null) {
            System.out.println("Account found:");
            System.out.println("Username: " + account.getUsername());
            System.out.println("Email: " + account.getEmail());
            // Output other details as needed
        } else {
            System.out.println("No account found with unique number: " + uniqueNumber);
        }


    }


}
