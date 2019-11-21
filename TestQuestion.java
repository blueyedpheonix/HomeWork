import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestQuestion {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);


        char[] listOfColors = {'B','Y','R','G','O'};
        char[] gameList = new char[3];
        int pose1 = rand.nextInt(5);
        int pose2 = rand.nextInt(5);
        int pose3 = rand.nextInt(5);

             while(pose1 == pose2 || pose1 == pose3 || pose2 == pose3)
             {
                 pose1 = rand.nextInt(5);
                 pose2 = rand.nextInt(5);
                 pose3 = rand.nextInt(5);
             }

        gameList[0] = listOfColors[pose1];
        gameList[1] = listOfColors[pose2];
        gameList[2] = listOfColors[pose3];

        System.out.println(Arrays.toString(gameList));



        char[] playerguess = new char[3];
        char[] outPute = new char[3];
        boolean running = true;
        int winningCounter = 0;
        int numberOfTries = 0;
        while(running)
        {
            winningCounter = 0;

            for(int i = 0; i < 3; i++)
            {
                System.out.println("Please enter guess " + (i+1));
                playerguess[i]= input.next().charAt(0);
                if(playerguess[i] == 'X')
                    running = false;
            }
            int counter = 0;
            for(int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    if (playerguess[i] == gameList[j] && i == j)
                    {
                        outPute[i] = 'X';
                        counter++;
                        winningCounter++;
                        break;
                    }
                    if (playerguess[i] == gameList[j] && i != j)
                    {
                        outPute[i] = '0';
                        counter++;
                        break;
                    }
                }
                if (counter == 0)
                {
                    outPute[i] = '_';
                }
            }
            System.out.println(Arrays.toString(outPute));
            numberOfTries++;
            if (winningCounter == 3)
                running = false;
            else
                System.out.println("Try again");

        }
        System.out.printf("You Won!!! in only %d tries",numberOfTries);

    }
}
