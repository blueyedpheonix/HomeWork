import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WarGame2 {

    public static void main(String[] args) {
        int[][] deck = new int[4][14];
        int card;
        for (int i = 0; i<4; i++)
        {
            card = 1;
            for (int j = 0; j<deck[i].length; j++)
            {
                deck[i][j] = card;
                card++;
            }
        }
        int[] NewDeck = new int[56];
        card = 0;
        for(int i = 0; i<deck.length; i++)
        {
            for (int j = 0; j<deck[i].length; j++)
            {
                NewDeck[card] = deck[i][j];
                card++;
            }
        }
        System.out.println("New deck: " + Arrays.toString(NewDeck));


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
        System.out.println("Deck shuffeld: " + Arrays.toString(NewDeck));


        int[] player1 = new int[28];
        int[] player2 = new int[28];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player1 name:");
        String firstName = input.nextLine();
        System.out.println("Enter player1 name:");
        String seconedName = input.nextLine();
        for (int i = 0; i<NewDeck.length; i++)
        {
            if(i%2 == 0)
                player1[i/2] = NewDeck[i];
            else
                player2[i/2] = NewDeck[i];
        }
        System.out.printf("%s deck: %s \n%s deck: %s",firstName,Arrays.toString(player1),seconedName,Arrays.toString(player2));
        int points1 = 0;
        int points2 = 0;
        for (int i = 0; i<player1.length; i++)
        {
            if (player1[i] > player2[i])
            {
                System.out.printf("%s beat %s with %d over %d\n",firstName,seconedName,player1[i],player2[i]);
                points1++;
            }
            if (player2[i] > player1[i])
            {
                System.out.printf("%s beat %s with %d over %d\n",seconedName,firstName,player2[i],player1[i]);
                points2++;
            }
            if (player1[i] == player2[i])
            {
                System.out.println(player1[i] + " " + player2[i] + " DRAW! going into match draw");
                int extraCards = 2;
                while(player1[i+extraCards]<28 && player1[i+extraCards] == player2[i+extraCards])
                {
                    extraCards+=2;
                }
                while (player1[i+extraCards]>=28)
                {
                    extraCards--;
                }
                if (player1[i+extraCards] > player2[i+extraCards])
                {
                    System.out.printf("%s won draw over %s with %d over %d\n",firstName,seconedName,player1[i+extraCards],player2[i+extraCards]);
                    points1 += extraCards;
                }
                if (player2[i+extraCards] > player1[i+extraCards])
                {
                    System.out.printf("%s won draw over %s with %d over %d\n",seconedName,firstName,player2[i+extraCards],player1[i+extraCards]);
                    points2 += extraCards;
                }
                if (player1[i+extraCards] == player2[i+extraCards])
                {
                    System.out.println("After everything it is still a DRAW!!!");
                }
            }

        }
        if (points1 > points2)
            System.out.printf("%s crushed his opponent with %d points over his enamy lousy %d points",firstName,points1,points2);
        else
            System.out.printf("%s crushed his opponent with %d points over his enamy lousy %d points",seconedName,points2,points1);
    }
}
