package api2;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReminderSystem system = ReminderSystem.getInstance();
        system.getThread().start();
        Scanner input = new Scanner(System.in);
        String action = "";
        while (!action.equalsIgnoreCase("exit")){
            System.out.println("Please select an action(add,get,exit)");
            action = input.nextLine();
            if (action.equalsIgnoreCase("add")){
                System.out.println("enter start hour");
                int sHour = input.nextInt();
                System.out.println("enter start minute");
                int sMinute = input.nextInt();
                System.out.println("enter end hour");
                int eHour = input.nextInt();
                System.out.println("enter end minute");
                int eMinute = input.nextInt();
                System.out.println("enter messege");
                input.nextLine();
                String messege = input.nextLine();
                Reminder reminder = new Reminder(LocalTime.of(sHour,sMinute),LocalTime.of(eHour,eMinute), messege);
                System.out.printf("did it work? %b\n",system.addReminder(reminder));
            }
            if (action.equalsIgnoreCase("get")){
                System.out.println(system.getReminders());
            }
        }

    }
}
