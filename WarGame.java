import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WarGame {

    public static void main(String[] args) {
        int[][] deck = new int[4][14];
        for (int i = 0; i<deck.length; i++)
        {
            int cards = 1;

            for (int j = 0; j<deck[i].length; j++)
            {
                deck[i][j] = cards;
                cards++;
            }
        }

        int[] NewDeck = new int[56];
        int counter = 0;
        for (int i = 0; i<deck.length; i++)
        {
            for (int j = 0; j<deck[i].length; j++)
            {
                NewDeck[counter] = deck[i][j];
                counter++;
            }
        }

        System.out.println(Arrays.toString(NewDeck));

        Random rand = new Random();
        int temp = 0;
        for(int i = 0; i<1000; i++)
        {
            int positionA = rand.nextInt(56);
            int positionB = rand.nextInt(56);
            temp = NewDeck[positionA];
            NewDeck[positionA] = NewDeck[positionB];
            NewDeck[positionB] = temp;

        }

        System.out.println(Arrays.toString(NewDeck));

        Scanner input = new Scanner(System.in);
        System.out.println("enter player1 name");
        String player1 = input.nextLine();
        System.out.println("enter player2 name");
        String player2 = input.nextLine();

        int[] player1D = new int[28];
        int[] player2D = new int[28];
        for (int i = 0; i<NewDeck.length; i++)
        {
            if ((i%2==0))
            {
                player1D[i/2] = NewDeck[i];
            }else
            {
                player2D[i/2] = NewDeck[i];
            }
        }

        System.out.println("player 1 deck: " + Arrays.toString(player1D));
        System.out.println("player 2 deck: " + Arrays.toString(player2D));

        int points1 = 0;
        int points2 = 0;
        for(int i = 0; i<player1D.length; i++)
        {
            if(player1D[i]>player2D[i])
            {
                System.out.printf("%s won\n",player1);
                points1++;
            }else if (player1D[i] == player2D[i])
            {
                int tieBreaker = 2;
                while(i+tieBreaker<28 && player1D[i+tieBreaker] == player2D[i+tieBreaker])
                {
                    tieBreaker+=2;
                }
                while(i+tieBreaker>=28)
                    tieBreaker--;
                if (player1D[i+tieBreaker] == player2D[i+tieBreaker])
                    System.out.println("Match Draw, no point aworeded");
                if(player1D[i+tieBreaker]>player2D[i+tieBreaker])
                {
                    points1+=tieBreaker + 1;
                    System.out.printf("%s won the draw and got %d extra points\n",player1,tieBreaker);
                }
                else {
                    points2 += tieBreaker + 1;
                    System.out.printf("%s won the draw and got %d extra points\n",player2,tieBreaker);
                }
            }else {
                     System.out.printf("%s won \n",player2);
                points2++;
            }
        }
        if (points1 == points2)
        {
            System.out.println("draw");
        }
        else if (points1 > points2)
            System.out.println(player1 + " is winner, with: " + points1 + " points " + player2 + " has " + points2 + " poimts");
        else
            System.out.println(player2 + " is winner, with: " + points2 + " points " + player1 + " has " + points1 + " poimts");





    }

}
