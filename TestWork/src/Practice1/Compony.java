package Practice1;

import java.util.List;

public class Compony {
    private String name;
    private List<Workplace> workplaceList;

    public Compony(String name, List<Workplace> workplaceList) {
        this.name = name;
        this.workplaceList = workplaceList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Workplace> getWorkplaceList() {
        return workplaceList;
    }

    public void setWorkplaceList(List<Workplace> workplaceList) {
        this.workplaceList = workplaceList;
    }

    @Override
    public String toString() {
        return "Compony: " +
                "name= " + name + '\'' +
                ", workplaceList= " + workplaceList +
                '}';
    }
}
