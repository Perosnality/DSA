package DSA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of stack [max=20]: ");
        int size = sc.nextInt();
        StackOperations stack = new StackOperations(size);
        int choose;
        while (true) {
            System.out.println("Stack Operations");
            System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Choose number (1-4): ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Something went wrong!");
            }
        }
    }
    
}
