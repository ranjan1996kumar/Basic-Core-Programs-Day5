import java.util.Scanner;
public class VowelAlphabet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Alphabet");
        String alphabet = scan.next();

        if (alphabet == "a" || alphabet == "e" || alphabet == "i" || alphabet == "o" || alphabet == "u") {
            System.out.println("Alphabet is vowel " + alphabet);
        } else {
            System.out.println("Alphabet is Constant " + alphabet);
        }
    }
}