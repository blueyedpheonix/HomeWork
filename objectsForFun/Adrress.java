package objectsForFun;

public class Adrress {
    private String country;
    private String city;
    private String street;
    private int number;

    public Adrress(String country,String city,String street,int number){
        this.country = country;
        this.city = city;
        this.street = street;
        this.number = number;
    }


    public Adrress(){
        country = "Israel";
        city = "ramatgan";
        street = "granados";
        number= 27;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Adrress{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}
