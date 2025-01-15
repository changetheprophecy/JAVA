public class PiAndE {
    public static void main(String[] args) {
        double a = 56.34, b = 6.58334, c = -34.4265;

        System.out.println("Value of pi: " + Math.PI);
        System.out.println("Value of e: " + Math.E);

        System.out.println("Random number: " + Math.random());
        
        System.out.println("Absolute value of c: " + Math.abs(c));

        System.out.println("Square root of a: " + Math.sqrt(a));

        System.out.println("Maximum value between a and b: " + Math.max(a,b));

        System.out.println("Value of a^b: " + Math.pow(a,b));

        System.out.println("Rounded value of a: " + Math.round(a));

        System.out.println("Value of √(a^2 + b^2): " + Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));

        System.out.println("Floor value of b: " + Math.floor(b));
        System.out.println("Ceil value of b: " + Math.ceil(b));
        System.out.println("Rounded value of b: " + Math.round(b));
        System.out.println("Floor value of c: " + Math.floor(c));
        System.out.println("Ceil value of c: " + Math.ceil(c));
        System.out.println("Rounded value of c: " + Math.round(c));

        double radianValue = Math.toRadians(a);
        System.out.println("Radian value of a: " + radianValue);

        System.out.println("Sin value of a: " + Math.sin(radianValue));
    }
}
