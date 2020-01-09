package Practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Salary {
    private List<Integer> salaries;

    public Salary() {
        salaries = new ArrayList<>();
    }

    public List<Integer> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Integer> salaries) {
        this.salaries = salaries;
    }
    public void addSalary(int i){
        salaries.add(i);
    }

    @Override
    public String
    toString() {
        return "Salary{" +
                "salaries=" + salaries +
                '}';
    }
}
