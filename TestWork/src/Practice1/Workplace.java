package Practice1;

import java.util.List;

public class Workplace {
    private Devision devision;
    private List<Employee> employeeList;
    private Boss boss;

    public Workplace(Devision devision, List<Employee> employeeList, Boss boss) {
        this.devision = devision;
        this.employeeList = employeeList;
        this.boss = boss;
    }

    public Devision getDevision() {
        return devision;
    }

    public void setDevision(Devision devision) {
        this.devision = devision;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    @Override
    public String toString() {
        return "\n" +
                "devision=" + devision +
                ", employeeList=" + "\n" + employeeList +
                ", boss=" + boss +
                '}' + "\n";
    }
}
