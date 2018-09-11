import java.util.Scanner;

public class GuessNumber {

    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Guess the number");
        int number=scanner.nextInt();

        while (true) {

            if (number > 50) {
                System.out.println("Number guessed is more than original numbe");
                System.out.println("Guess the number  Again");
                number = scanner.nextInt();
            }

            else if (number < 1) {
                System.out.println("Number guessed is less than original numbe");
                System.out.println("Guess the number  Again");
                number = scanner.nextInt();
            }

            else{
                System.out.println("Number guessed matches the original number!! Good Job");
                break;
            }
        }

    }
}
