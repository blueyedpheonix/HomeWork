package api;

import java.time.LocalDateTime;
import java.util.*;

public class ReminderSystem {

    private ReminderTask task;
    private Thread thread;
    public static ReminderSystem reminderSystem;

    public static ReminderSystem getInstance(){
        if(reminderSystem == null){
            reminderSystem = new ReminderSystem();
        }
        return reminderSystem;
    }

    private ReminderSystem(){
        Set<Reminder> reminders = new HashSet<>();
                reminders.add(new Reminder(LocalDateTime.of(2020,2,1,10,00),
                                         LocalDateTime.of(2020,2,5,17,00),
                                          "wake up1"));
        reminders.add (new Reminder(LocalDateTime.of(2020,2,1,10,00),
                                          LocalDateTime.of(2020,2,5,17,00),
                                         "wake up2"));
        reminders.add (new Reminder(LocalDateTime.of(2020,2,1,10,00),
                                          LocalDateTime.of(2020,2,5,17,00),
                                         "wake up3"));
       reminders.add (new Reminder(LocalDateTime.of(2020,2,1,10,00),
                                          LocalDateTime.of(2020,2,5,17,00),
                                         "wake up4"));
        task = new ReminderTask(reminders);
        thread = new Thread(task);
        thread.setDaemon(true);

    }

    public ReminderTask getTask() {
        return task;
    }

    public void setTask(ReminderTask task) {
        this.task = task;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }
    public void addReminder(Reminder reminder){
        Set<Reminder> newReminder = new HashSet<>(task.getReminders());
        newReminder.add(reminder);
        task.setReminders(newReminder);
    }
    public List<Reminder> getReminder(){
        List<Reminder> reminders = new ArrayList<>(task.getReminders());
        Collections.sort(reminders);
        return reminders;
    }
}

