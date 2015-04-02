import java.util.Scanner;

public class AccountTest {
    public static void main(String args[]) {
        Account account = new Account(100.0);

        System.out.printf("Starting balance %f\n", account.getBalance());
    }
}
