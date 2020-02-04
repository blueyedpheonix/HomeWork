package api;

import java.time.LocalDateTime;
import java.util.Objects;

public class Reminder implements Comparable<Reminder> {
    private LocalDateTime start;
    private LocalDateTime end;
    private String messege;
    private Boolean seen;

    public Reminder(LocalDateTime start, LocalDateTime end, String messege) {
        this.start = start;
        this.end = end;
        this.messege = messege;
        this.seen = false;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public Boolean getSeen() {
        return seen;
    }

    public void setSeen(Boolean seen) {
        this.seen = seen;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "start=" + start +
                ", end=" + end +
                ", messege='" + messege + '\'' +
                ", seen=" + seen +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reminder reminder = (Reminder) o;
       if (start == null){
           if(o != null)
               return false;
       }else if (!start.equals(((Reminder) o).start))
           return false;
       return true;
    }

    @Override
    public int compareTo(Reminder o) {
        return start.compareTo(o.start);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, messege, seen);
    }
}
