import java.util.Scanner;
public class LargestThreeNo {
    public static void main(String[] args) {
        int num1, num2, num3 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first number");
        num1 = scan.nextInt();
        System.out.println("Enter a second number");
        num2 = scan.nextInt();
        System.out.println("Enter a Third number");
        num3 = scan.nextInt();
        if(num1>num2 && num1 >num3) {
            System.out.println(num1+ " first number is greater");
        }else if( num2 >num3) {
            System.out.println(num2 +" secound number is greater");
        }else {
            System.out.println(num3+"  third number is greater");
        }
    }
}
