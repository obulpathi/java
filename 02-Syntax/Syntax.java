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
        } else if (i > j) {
            System.out.println("First > Second");
        } else {
            System.out.println("First = Second");
        }

        for(i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println("");

        while(i > 0){
            System.out.print(i-1);
            i--;
        }
        System.out.println("");

        System.out.println("");
    }
}
