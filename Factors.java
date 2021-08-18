import java.util.Scanner;
public class Factors{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a  no");
        int number = scan.nextInt();
        for(int i = 2 ; i<=number ; i++) {
            while(number%i == 0) {
                number /= i;
                System.out.println(i);
            }
        }
    }
}
