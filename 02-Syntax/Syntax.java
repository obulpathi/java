import java.util.Scanner;

public class Syntax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, j;

        System.out.print("Enter an integer: ");
        i = input.nextInt();
        System.out.print("Enter another integer: ");
        j = input.nextInt();

        System.out.printf("Sum of numbers is %d%n", i + j);

        if(i < j) {
            System.out.println("First < Second");
        }
        
        System.out.println("");
    }
}
