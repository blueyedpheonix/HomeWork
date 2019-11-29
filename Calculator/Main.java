package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Start ");
        Operations ope = new Operations();
        Scanner input = new Scanner(System.in);
        boolean running = true;
        double answere = input.nextDouble();
        char function = input.next().charAt(0);
        do {
        double num1 = input.nextDouble();
         switch (function){

            case '+':
                answere = ope.plus(answere,num1);
                System.out.println(answere);
                break;
            case '-':
                answere = ope.minus(answere,num1);
                System.out.println(answere);
                break;
            case '*':
                answere = ope.kefel(answere,num1);
                System.out.println(answere);
                break;
            case '/':
                answere = ope.hiluk(answere,num1);
                System.out.println(answere);
                break;
         }
         function = input.next().charAt(0);

        }while (function != '=');
        System.out.println(answere);

        input.close();




    }
}
