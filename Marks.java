import java.util.*;
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        do{
            System.out.println("Enter either 1(to get marks) or 0(to stop): ");
            n = sc.nextInt();
            if(n==1) {
                System.out.println("Enter marks out of 100: ");
                int m = sc.nextInt();
            if(m>=90) {
                System.out.println("This is good"); }
                else if(m>=60 && m<=89) {
                    System.out.println("This is also good");
                }
                else if(m>=0 && m<=59){
                    System.out.println("This is good as well");
                }
                else {
                    System.out.println("Invalid marks");
                }
            }
            else if(n==0){
                System.out.println("Invalid choice");
            }
        } while(n!=0);   
    }
}
