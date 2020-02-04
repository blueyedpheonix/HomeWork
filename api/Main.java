package api;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     ReminderSystem system = ReminderSystem.getInstance();
     Thread run = system.getThread();
     run.start();
        Scanner input = new Scanner(System.in);
        String action = "";
        String exit = "exit";
        String get = "get";
        String add = "add";
        while(!action.equals(exit)){
            System.out.println("Please pick an action: (exit,get,add)");
            action = input.nextLine();
            if(action.equals(get)){
                for(Reminder reminder : system.getReminder()){
                    System.out.println(reminder);
                }
            }
            if (action.equals(add)){
                System.out.println("enter start year");
                int Syear = input.nextInt();
                System.out.println("enter start month");
                int Smonth = input.nextInt();
                System.out.println("enter start day");
                int Sday = input.nextInt();
                System.out.println("enter start hour");
                int Shour = input.nextInt();
                System.out.println("enter start minute");
                int Sminute = input.nextInt();
                System.out.println("enter start seconds");
                int Sseconds = input.nextInt();
                System.out.println("enter end year");
                int Eyear = input.nextInt();
                System.out.println("enter end month");
                int Emonth = input.nextInt();
                System.out.println("enter end day");
                int Eday = input.nextInt();
                System.out.println("enter end hour");
                int Ehour = input.nextInt();
                System.out.println("enter end minute");
                int Eminute = input.nextInt();
                System.out.println("enter end seconds");
                int Eseconds = input.nextInt();
                System.out.println("enter your message");
                input.nextLine();
                String messege = input.nextLine();
                Reminder reminder = new Reminder(LocalDateTime.of(Syear,Smonth,Sday,Shour,Sminute,Sseconds),
                                                 LocalDateTime.of(Eyear,Emonth,Eday,Ehour,Eminute,Eseconds),messege);
                system.addReminder(reminder);
            }
        }
        run.interrupt();
        input.close();
    }
}
