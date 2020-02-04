package api2;

import java.time.LocalTime;
import java.util.Set;

public class ReminderTask implements Runnable {

    private Set<Reminder> reminders;

    public ReminderTask(Set<Reminder> reminders) {
        this.reminders = reminders;
    }

    public Set<Reminder> getReminders() {
        return reminders;
    }

    public void setReminders(Set<Reminder> reminders) {
        this.reminders = reminders;
    }

    private boolean shouldremind(Reminder reminder){
        return  (reminder.getSrtart().isBefore(LocalTime.now()) && reminder.getEnd().isAfter(LocalTime.now()) && !reminder.isSeen());
    }

    @Override
    public void run() {
        while(true){
            for (Reminder reminder : reminders){
                if (shouldremind(reminder)) {
                    System.out.println(reminder.getMessege());
                    reminder.setSeen(true);
                }
            }
        }
    }
}
