//Make a program that prints the table of a number that is input by the user.
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args)
    {
        System.out.print("Enter the number to print it's multiplication table: ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1; i<=10; i++){
            int table = n*i;
            System.out.println(n+"*"+i+"="+table);
        }
    
    }
}
