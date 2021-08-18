import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first num");
        int num = scan.nextInt();
        if((num%2) == 0) {
            System.out.println("Even num"+num);
        }
        else {
            System.out.println("odd  num"+num);
        }
    }

}