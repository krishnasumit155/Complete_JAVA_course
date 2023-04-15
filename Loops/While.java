package Loops;

import java.util.*;
public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");

        int x = sc.nextInt();
        int i=1;
        while(true){
            if(i==10) break;
            System.out.println(x+" * "+i+" = "+(x*i));
            i++;
        }
    }
}
