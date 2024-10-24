import java.util.Scanner;

public class miniProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number from 1-10: ");
        int guessNumber = (int)(Math.random()*10);
        
        int userGuess = input.nextInt();   
        int attempt=0;
        int remainingAttempt=10;
        for (int i=0; i<remainingAttempt; i++){
            System.out.println("Your Number of Atttempt is: "+ ++attempt);
            if (guessNumber==userGuess) {
                System.out.println("Congratulations! your guess is correct");
                break;
            }else if(guessNumber>userGuess){
                System.out.println("Your guess is smaller than the actual number");
            }else{
                System.out.println("Your guess is bigger than the actual number");
            }
            System.out.println("Your attempt remaining: "+ --remainingAttempt);
            System.out.print("Enter Your Number Again: ");
            userGuess=input.nextInt();
            if(remainingAttempt==0){
                System.out.println("Sorry, you have no more attempts left. The number was: "+guessNumber);
                
            }
        }
    }
    
}
