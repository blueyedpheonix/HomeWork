package Practice1;

import java.lang.reflect.Array;
import java.time.Month;
import java.util.*;

import static Practice1.Calculations.*;
import static Practice1.Devision.*;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alon",25);
        Employee employee2 = new Employee("Gal",28);
        Employee employee3 = new Employee("Lol",38);
        Boss bossDev = new Boss("Dylan",23);
        Employee employee4 = new Employee("yaya",26);
        Employee employee5 = new Employee("sdfs",277);
        Employee employee6 = new Employee("Lol",38);
        Boss bossQa = new Boss("Jake",23);
        Employee employee7 = new Employee("Gilad",25);
        Employee employee8 = new Employee("Moshe",28);
        Employee employee9 = new Employee("Itsik",38);
        Boss bossHr = new Boss("Omer",23);
        Employee employee10 = new Employee("GayLord",25);
        Employee employee11 = new Employee("Shmolic",28);
        Employee employee12 = new Employee("yoyo",38);
        Boss bossGrapgics = new Boss("Freddie",23);
        List<Employee> employeeListDev = new ArrayList<>();
        List<Employee> employeeListQa = new ArrayList<>();
        List<Employee> employeeListHr = new ArrayList<>();
        List<Employee> employeeListGraphics = new ArrayList<>();
        employeeListDev.add(employee1);
        employeeListDev.add(employee2);
        employeeListDev.add(employee3);
        employeeListQa.add(employee4);
        employeeListQa.add(employee5);
        employeeListQa.add(employee6);
        employeeListHr.add(employee7);
        employeeListHr.add(employee8);
        employeeListHr.add(employee9);
        employeeListGraphics.add(employee10);
        employeeListGraphics.add(employee11);
        employeeListGraphics.add(employee12);
        Workplace dev = new Workplace(DEV,employeeListDev,bossDev);
        Workplace qa = new Workplace(Devision.QA,employeeListQa,bossQa);
        Workplace hr = new Workplace(Devision.HR,employeeListHr,bossHr);
        Workplace graphics = new Workplace(Devision.GRAPHICS,employeeListGraphics,bossGrapgics);
        List<Workplace> workplaceList = new ArrayList<>();
        workplaceList.add(dev);
        workplaceList.add(qa);
        workplaceList.add(hr);
        workplaceList.add(graphics);
        Compony gaya = new Compony("gaya",workplaceList);
        initEmployeeSalery(employeeListDev,DEV,false);
        initEmployeeSalery(employeeListQa,QA,false);
        initEmployeeSalery(employeeListHr,HR,false);
        initEmployeeSalery(employeeListGraphics,GRAPHICS,false);
        initSalary(bossDev,DEV,true);
        initSalary(bossQa,QA,true);
        initSalary(bossHr,HR,true);
        initSalary(bossGrapgics,GRAPHICS,true);

        System.out.println(gaya);
        System.out.println("avarage of devisions: ");
        avgOfDevisions(gaya);
        System.out.println("avarage of compony salaries: ");
        avgaOfCompony(gaya);
        System.out.println();
        avarageofage(gaya,22,32);
        avarageofage(gaya, 34);
        avarageOfBossesSalary(gaya);
        oldestPersoon(gaya);
        youngestPersoon(gaya);
    }

    public static void initEmployeeSalery(List<Employee> employeeList, Devision devision, boolean isBoss){
        Random rand = new Random();
        for (Employee employee : employeeList) {
            initSalary(employee, devision , isBoss);
        }
    }

    public static void initSalary(Person person, Devision devision, boolean isBoss){
        Random rand = new Random();
        int[] rang = getThisSalaryRange( devision,isBoss);
        int min = rang[0];
        int max = rang[1];
        for (int i = 0; i < Month.values().length; i++){
            person.salary.addSalary(rand.nextInt(max - min)+min);
        }
    }
    public static int [] getThisSalaryRange(Devision devision, boolean isBoss){
        int min = 0;
        int max = 0;
        int[] rang = new int[2];
        if(isBoss){
            switch (devision){
                case HR:
                    rang[0] = 18000;
                    rang[1] = 23000;
                 break;
                case QA:
                    rang[0] = 15000;
                    rang[1] = 18000;
                break;
                case GRAPHICS:
                    rang[0] = 20000;
                    rang[1] = 23000;
                break;
                case DEV:
                    rang[0] = 22000;
                    rang[1] = 25000;
                break;
            }
        }else{
            switch (devision){
                case HR:
                    rang[0] = 8000;
                    rang[1] = 13000;
                    break;
                case QA:
                    rang[0] = 5000;
                    rang[1] = 8000;
                    break;
                case GRAPHICS:
                    rang[0] = 10000;
                    rang[1] = 13000;
                    break;
                case DEV:
                    rang[0] = 12000;
                    rang[1] = 15000;
                    break;
            }
        }
       return rang;
    }
}
