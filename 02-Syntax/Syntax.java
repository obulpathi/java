import java.util.Scanner;

public class Syntax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, j;

        System.out.print("Enter an integer: ");
        i = scanner.nextInt();
        System.out.print("Enter another integer: ");
        j = scanner.nextInt();

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

        for(int k = 0; k < 10; k++) {
            System.out.print(k);
        }
        System.out.println("");

        System.out.print("Enter in integer below 4: ");
        int x = scanner.nextInt();
        switch(x){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Outside range");
        }

        System.out.println("");
    }
}
