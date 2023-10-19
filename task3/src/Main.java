import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean check = true;
        int number_won = 0;
        while(check){
            int max_count = 3;
            Scanner input = new Scanner(System.in);
            System.out.println("\n\n--------------------------------------");
            System.out.println("\t\tWELCOME TO THE GAME");
            System.out.println("--------------------------------------");
            System.out.println("BASIC RULES OF THE GAME: \n1.)You have 3 guesses to guess the number from 0-100\n2.)No cheating\n3.)Hints will be provided for guidance");
            Random random = new Random();
            int question = random.nextInt(0,101);
            for(int i = 0;i<max_count;i++){
                System.out.println("Number of Chances Left: "+(max_count-i));
                System.out.println("\nEnter your guess: ");
                int temp = input.nextInt();
                if(temp == question){
                    System.out.println("\nCONGRATS YOU HAVE SUCCESSFULLY GUESSED THE NUMBER ");
                    i = max_count;
                    number_won++;
                }
                else if(question > temp){
                    System.out.println("\nHINT: Guess a number higher than this!");
                }
                else if(question < temp){
                    System.out.println("\nHINT: Guess a number smaller than this!");
                }
            }
            System.out.println("\nLAST CHANCE TO GUESS: ");
            int temp = input.nextInt();
            if(temp == question) {
                System.out.println("\nCONGRATS YOU HAVE SUCCESSFULLY GUESSED THE NUMBER ");
                number_won++;
            }
            else if(temp != question){
                System.out.println("BETTER LUCK NEXT TIME");
                System.out.println("THE NUMBER IS : "+question);
            }
            System.out.println("\nDo you want to Continue:\nPress 1 for continue any other digit to exit");
            int checker = input.nextInt();
            if(checker != 1){
                check = false;
            }
        }
        System.out.println("Number of Matches WON are: "+number_won);
    }
}