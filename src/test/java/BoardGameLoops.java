import java.util.Random;
import java.util.Scanner;

public class BoardGameLoops {

    public static void main(String args[]){

        int throwsNumber = 5;
        Random random = new Random();
        Scanner keyIn = new Scanner(System.in);
        int stepsToWin = 20;
        String winMessage = "You have won, Congrats!";
        String loseMessage = "Looooser";
        boolean winner = false;

        int spaceNumber = 0;
        int spacesToGo= 0;
        int actualThrow = 0;
        while(spaceNumber<=stepsToWin && actualThrow<throwsNumber){
            System.out.println("Press ENTER to roll the dice");
            keyIn.nextLine();
            int die = random.nextInt(6) + 1;
            actualThrow = actualThrow+ 1;
            spaceNumber = spaceNumber + die;
            spacesToGo = stepsToWin-spaceNumber;
            System.out.println("Dice: " + die);
            if(spacesToGo>0) {
                System.out.println("Number of spaces to go: " + spacesToGo);
            }
        }
        if(spaceNumber>=stepsToWin) {
            System.out.println(winMessage);
        }
            else{
                System.out.println(loseMessage);
            }
        }


    }

