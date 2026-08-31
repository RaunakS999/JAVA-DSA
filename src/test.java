


import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int guess = (int) (Math.random() * 100) + 1;
        int userGuess;
        int maxGuess = 10;
        do {
            userGuess = sc.nextInt();
            if (userGuess == guess) {
                System.out.println("bhadai ho");
                break;
            }
            if (--maxGuess == 0) {
                System.out.println("khel khatam");
                break;
            }

            if (userGuess > guess) {
                System.out.println("chota socho");
            } else {
                System.out.println("bada socho");

            }
        } while (true);


    }
}
