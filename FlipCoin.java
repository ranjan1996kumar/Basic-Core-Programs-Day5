import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        int i = 0 , head =0 , tail = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a no to flip a coin ");
        int input = scan.nextInt();
        while ( i < input) {
            int random = (int) Math.floor(Math.random()*10%2);
            if (random == 1) {
                head++;
            }else {
                tail++;
            }
            i++;
        }
        int headPer = (head*100/input);
        int tailPer = (tail*100/input);
        System.out.println("Number of  head comes = " +head);
        System.out.println("Number of tail comes = " +tail);
        System.out.println("Percentage of head = " +headPer);
        System.out.println("Percentage of tail = " +tailPer);
    }
}
