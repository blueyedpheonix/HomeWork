package api2;

import java.time.LocalTime;
import java.util.Objects;

public class Reminder implements Comparable<Reminder> {

    private LocalTime srtart;
    private LocalTime end;
    private String messege;
    private boolean seen;

    public Reminder(LocalTime srtart, LocalTime end, String messege) {
        this.srtart = srtart;
        this.end = end;
        this.messege = messege;
        this.seen = false;
    }

    public LocalTime getSrtart() {
        return srtart;
    }

    public void setSrtart(LocalTime srtart) {
        this.srtart = srtart;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "srtart=" + srtart +
                ", end=" + end +
                ", messege='" + messege + '\'' +
                ", seen=" + seen +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reminder reminder = (Reminder) o;
        return Objects.equals(srtart, reminder.srtart) &&
                Objects.equals(end, reminder.end);

    }

    @Override
    public int hashCode() {
        return Objects.hash(srtart, end);
    }

    @Override
    public int compareTo(Reminder o) {
        if (this.srtart.compareTo(o.srtart) == 0)
            return this.end.compareTo(o.end);
        return this.srtart.compareTo(o.srtart);
    }
}
