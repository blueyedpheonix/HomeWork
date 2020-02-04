package api2;

import api2.ReminderTask;

import java.time.LocalTime;
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
      reminders.add(new Reminder(LocalTime.of(13,40),
              LocalTime.of(14,40),"wake up time"));
        reminders.add(new Reminder(LocalTime.of(15,30),
                LocalTime.of(15,40),"wake up time"));
        reminders.add(new Reminder(LocalTime.of(13,40),
                LocalTime.of(15,40),"all right"));
        reminders.add(new Reminder(LocalTime.of(14,40),
                LocalTime.of(14,40),"wake up time"));
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

    public static ReminderSystem getReminderSystem() {
        return reminderSystem;
    }

    public static void setReminderSystem(ReminderSystem reminderSystem) {
        ReminderSystem.reminderSystem = reminderSystem;
    }

    public List<Reminder> getReminders(){
        List<Reminder> reminderList = new ArrayList<>(task.getReminders());
        Collections.sort(reminderList);
        return reminderList;
    }
    public boolean addReminder(Reminder reminder){
        Set<Reminder> newReminders = new HashSet<>(task.getReminders());
        boolean didWork = newReminders.add(reminder);
        task.setReminders(newReminders);
        return didWork;
    }

}
