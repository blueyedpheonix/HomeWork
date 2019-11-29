package objectsForFun;

public class Person {

    private int age;
    private String firstName;
    private String secondName;
    private int salary;
//    Adrress adrress = new Adrress();
    public Adrress adrress;

    public Person(int age,String firstName, String secondName, int salary,Adrress adrress){
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
        this.adrress = adrress;
    }
    public Person(){
        age = 23;
        firstName = "Dylan";
        secondName = "Karaassik";
        salary = 1000000;
        Adrress adrress = new Adrress();
    }


    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String name){
        this.firstName = name;
    }
    public  String getSecondName(){
        return this.secondName;
    }
    public void setSecondName(String name){
        this.secondName = name;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setAdrress(Adrress adrress) {
        this.adrress = adrress;
    }

    public Adrress getAdrress() {
        return adrress;
    }

    public String helloFriend(Person friend){
        Person person = new Person();
        int diffrence;
        String ageLine;
        if (friend.getAge() > person.getAge()){
            diffrence = friend.getAge() - person.getAge();
            ageLine = "you are ";
        }else{
            diffrence = person.getAge() - friend.getAge();
            ageLine = " I am ";
        }
       return  "hello "+ friend.firstName + " I am " + person.firstName +" " + ageLine + diffrence +" " + "years older";
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + salary +
                ", adrress=" + adrress +
                '}';
    }
}
