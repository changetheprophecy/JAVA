import java.util.*;
public class Sum {
    public static int add(int a, int b){
        int sum = a+b;
        
        
        return sum;
    }
    public static void main(String[] args) {
         System.out.println("Enter two numbers: ");
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();

         int sum = add(a,b);
         System.out.println("Sum : " + sum);
    }
}
