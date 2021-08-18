import java.util.Scanner;
public class SwapNum {
    public static void main(String[] args) {
        int num1 , num2, temp;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a first num");
            num1 = scan.nextInt();
            System.out.println("Enter a second num");
            num2 = scan.nextInt();
            temp = 0;
            temp = num1;
            num1 =num2;
            num2 = temp;

            System.out.println("Enter a first num" + num1);
            System.out.println("Enter a second num" + num2);

        }

    }
