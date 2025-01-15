import java.util.*;
public class StringScan {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string s1: ");
    String s1 = sc.nextLine();
    System.out.print("Enter string s2: ");
    String s2 = sc.nextLine();

    System.out.println("Length of s1: " + s1.length());
    System.out.println("Length of s1: " + s1.length());
    
    String replaceds1 = s1.replace(" ","_");
    System.out.println("Replaced spaces to: " + replaceds1);

    if(!s1.isEmpty()){
        System.out.println("1st char of s1: " + s1.charAt(0));
    } else {
        System.out.println("s1 is empty");
    }
    }
}
