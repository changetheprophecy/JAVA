import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the second5 number: ");
        double b = sc.nextDouble();

        System.out.println("Choose an operation: ");
        System.out.println("1: (Addition)");
        System.out.println("2: (Subtraction)");
        System.out.println("3: (Multiplication)");
        System.out.println("4: (Division)");
        System.out.println("5: (Remainder)");
        System.out.println("Enter the operation number");

        int operation = sc.nextInt();

        double result;

        switch(operation){
            case 1 :  result = a+b;
            System.out.println("Result: " + result);
            break;
            case 2 : result = a-b;
            System.out.println("Result: " + result);
            break;
            case 3 : result = a*b;
            System.out.println("Result: " + result);
            break;
            case 4 : 
            if(b!=0){
                result = a/b;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error!");
            }
            break;
            case 5 : 
            if(b!=0){
                result = a%b;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error!");
            }
            break;
           
            default : System.out.println("Invalid button");
        }

    }
}
