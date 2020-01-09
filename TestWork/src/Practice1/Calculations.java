package Practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculations {

    private static int avgOfSalaries(Person person){
        int avg = 0;
        for (int salary : person.getSalary().getSalaries()) {
            avg += salary;
        }
        avg /= 12;
        return avg;
    }

    public static void avgOfDevisions(Compony compony){
        int avg = 0;
        int counter = 0;
        for (Workplace workplace : compony.getWorkplaceList()){
            avg = 0;
            counter = 0;
            for (Employee employee : workplace.getEmployeeList()) {
                avg += avgOfSalaries(employee);
                counter++;
            }
            avg += avgOfSalaries(workplace.getBoss());
            counter++;
            avg /= counter;
            System.out.printf("company name: %s devison: %s average of salaries %d\n"
                    ,compony.getName(),workplace.getDevision(),avg);
        }
    }

    public static void avgaOfCompony(Compony compony){
        int avgCompony = 0;
        int cCounter = 0;
        int avg = 0;
        int counter = 0;
        for (Workplace workplace : compony.getWorkplaceList()){
            avg = 0;
            counter = 0;
            for (Employee employee : workplace.getEmployeeList()){
                avg += avgOfSalaries(employee);
                counter++;
            }
            avg += avgOfSalaries(workplace.getBoss());
            counter++;
            cCounter++;
            avg /= counter;
            avgCompony += avg;
        }
        avgCompony /= cCounter;
        System.out.printf("The componie %s average salary is: %d",
                compony.getName(),avgCompony);
    }

    public static void avarageofage(Compony compony, int min , int max){
        int avg = 0;
        int counter = 0;
        for(Workplace workplace : compony.getWorkplaceList()){
            for(Employee employee : workplace.getEmployeeList()){
                if(employee.getAge() >= min && employee.getAge() <= max){
                    avg += avgOfSalaries(employee);
                    counter++;
                }
            }
           if (workplace.getBoss().getAge() >= min && workplace.getBoss().getAge() <= max){
               avg += avgOfSalaries(workplace.getBoss());
               counter++;
           }
        }
        avg /= counter;
        System.out.printf("The number of employees(including bosses) between the ages of: %d - %d is: %d\n" +
                "and there avarage salary is: %d\n",min,max,counter,avg);
    }

    public static void avarageofage(Compony compony, int minage) {
        avarageofage(compony,minage,Integer.MAX_VALUE);
    }

    public static void avarageOfBossesSalary(Compony compony){
        int avg= 0;
        int counter =0;
        for (Workplace workplace : compony.getWorkplaceList()){
            avg += avgOfSalaries(workplace.getBoss());
            counter++;
        }
        avg /= counter;
        System.out.printf("The avarage salary of the bosses is: %d\n",avg);
    }

    public static int topSalary(Person person){
        int highest = 0;
        for(int salary : person.getSalary().getSalaries()){
            if (salary > highest)
                highest = salary;
        }
        return highest;
    }


    public static void oldestPerson(Compony compony){
        List<Person> personList = new ArrayList<>();
        Person oldest = personList.get(personList.size()-1);
        System.out.printf("The oldest person in %s is: %s with age of: %d and his highst salary is: %d\n"
                ,compony.getName(),oldest.getName(),oldest.getAge(),topSalary(oldest));
    }

    public static void youngestPerson(Compony compony){
        List<Person> personList = allWorkersSorted(compony);
        Person youngest = personList.get(0);
        System.out.printf("The youngest person in %s is: %s with age of: %d and his highst salary is: %d\n"
                ,compony.getName(),youngest.getName(),youngest.getAge(),topSalary(youngest));
    }


    private static List<Person> allWorkersSorted(Compony compony){
        List<Person> personList = new ArrayList<>();
        for (Workplace workplace : compony.getWorkplaceList()) {
            personList.add(workplace.getBoss());
            personList.addAll(workplace.getEmployeeList());
        }
        Collections.sort(personList);
        return personList;
    }


//    public static void oldestPersoon(Compony compony){
//        Person oldest = compony.getWorkplaceList().get(0).getBoss();
//        for (Workplace workplace : compony.getWorkplaceList()){
//            for(Employee employee : workplace.getEmployeeList()){
//                if(employee.getAge() > oldest.getAge()){
//                    oldest = employee;
//                }
//            }
//            if(workplace.getBoss().getAge() > oldest.getAge()){
//                oldest = workplace.getBoss();
//            }
//        }
//        System.out.printf("The oldest person in %s is: %s with age of: %d and his highst salary is: %d\n"
//                ,compony.getName(),oldest.getName(),oldest.getAge(),topSalary(oldest));
//    }
//    public static void youngestPersoon(Compony compony){
//        Person youngest = compony.getWorkplaceList().get(0).getBoss();
//        for (Workplace workplace : compony.getWorkplaceList()){
//            for(Employee employee : workplace.getEmployeeList()){
//                if(employee.getAge() < youngest.getAge()){
//                    youngest = employee;
//                }
//            }
//            if(workplace.getBoss().getAge() < youngest.getAge()){
//                youngest = workplace.getBoss();
//            }
//        }
//
//        System.out.printf("The youngest person in %s is: %s with age of: %d and his highst salary is: %d\n"
//                ,compony.getName(),youngest.getName(),youngest.getAge(),topSalary(youngest));
//    }

}
