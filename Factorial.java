import java.util.*;
public class Factorial {
    public static int printFactorial(int a){
        if(a<0){
            System.out.println("Invalid number");
           return -1;
        }

        int factorial = 1;

        for(int i=a; i>=1; i--){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int factorial = printFactorial(a);
        if (factorial != -1){
            System.out.println(a+ "! = " + factorial);
        }
    }
}
