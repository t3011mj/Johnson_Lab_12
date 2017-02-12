import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        String inputName = " ";
        String competitor = " ";
        String rbc = " ";
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter your name:");
        inputName = scan1.nextLine();
        System.out.println("Hello " + inputName  + " - Welcome to the Rock Paper Scissors Game");

        System.out.println("Do you wish to play against the Dr Kamel or Antonella ?");
        competitor = scan1.nextLine();

        System.out.println("You have decided to play against: " + competitor);

        System.out.println("Do you wish to play Rock, Paper, or Scissors? (r / b /c) ");
        rbc = scan1.nextLine();

        System.out.println(inputName + " plays " + rbc);

        Roshambo person = null;

        while(person==null){
            System.out.println("Enter your play: ");
            // person= Roshambo.parseType(scan1.next());
             person = Roshambo(scan1.nextLine());
            if(person ==null){
                System.out.println("invalid try again");
            }
        }

        String computer = "r";

       // Roshambo rbc, computer;

        if (rbc.equals(computer)) {
            System.out.println("It's a tie!");
        }
        // else if(rbc.beats(computer)) {
        //    System.out.println(rbc + " beats " + computer + "You win!!");
        // }
        else {
        System.out.println(rbc+ " beats " + person+ "You lose!!");
    }

    }
}
