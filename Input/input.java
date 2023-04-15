import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // INPUT synatx:
        // Data_type Variable_name = object_name.next_data_type();

        // for interger 
        System.out.println("Enter a Interger number : ");
        int a =sc.nextInt();

        // for float
        System.out.println("Enter a float number : ");
        float b=sc.nextFloat();

         // for string
         System.out.println("Enter name1 : ");
         String name1 = sc.next(); // it take input untill new space or new line are not come.


         // for double
         System.out.println("Enter double Data_type number : ");
         double c= sc.nextDouble();

         System.out.println(a);
         System.out.println(b);
         System.out.println(name1);
         System.out.println(c);
    }
}
