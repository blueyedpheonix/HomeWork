package api;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class ReminderTask implements Runnable {
    private Set<Reminder> reminders = new HashSet<>();

    public ReminderTask(Set<Reminder> reminders) {
        this.reminders = reminders;
    }

    public Set<Reminder> getReminders() {
        return reminders;
    }
    public void addReminder(Reminder reminder){
        reminders.add(reminder);
    }

    public void setReminders(Set<Reminder> reminders) {
        this.reminders = reminders;
    }

    @Override
    public String toString() {
        return "ReminderTask{" +
                "reminders=" + reminders +
                '}';
    }

    private boolean isNowBetween(LocalDateTime start, LocalDateTime end){
        LocalDateTime now = LocalDateTime.now();
        return now.isAfter(start) && now.isBefore(end);
    }

    @Override
    public void run() {
        while(true){
            for (Reminder reminder : reminders) {
                if (isNowBetween(reminder.getStart(), reminder.getEnd()) && !reminder.getSeen()){
                    System.out.println(reminder.getMessege());
                    reminder.setSeen(true);
                }
            }
        }

    }
}
