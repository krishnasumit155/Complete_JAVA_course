package Loops;

import java.util.*;
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int x = sc.nextInt();
        
        do{
            System.out.println(x);
            System.out.println(x*1);
            x++;
            if(x==20) break;

        }while(x>10);
    }
}
