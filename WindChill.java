import java.util.Scanner;
public class WindChill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x condinate");
        double t = scan.nextDouble();
        System.out.println("Enter y condinate");
        double v = scan.nextDouble();
        double windchill = (35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16));
        System.out.println(windchill);
    }
}