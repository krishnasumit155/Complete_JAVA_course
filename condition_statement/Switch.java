package condition_statement;

import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Star_KS calculator");

        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter secound number : ");
        int b = sc.nextInt();

        System.out.println("enter your choice like +.-,*,/ ");
        String ch = sc.next();

        switch (ch) {
            case "+":
                System.out.println("sum = " + (a + b));
                break;
            
            case "-":
                System.out.println("sub = "+ (a-b));
                break;

            case "*":
                System.out.println("mul = "+(a*b));
                break;
            case "/":
                System.out.println("div = "+(a/b));
                break;
            default:
                System.out.println("plase enter valid choice!");    
        }

    }
}
