//Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
import java.util.*;
public class Circle {
    public static void main(String[] args){
        System.out.println("Enter the radius of the circle");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println("Radius: " +radius);
        final float pi = 3.1416f;
        float area = pi * (float) (radius * radius);
        System.out.println("Area of circle: " + area);

    }
}