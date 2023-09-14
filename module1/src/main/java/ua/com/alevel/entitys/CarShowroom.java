package ua.com.alevel.entitys;

public class CarShowroom extends BaseEntitys
{

    private String name;
    private String city;
    private String street;
    private int number;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }

    public String getStreet(){
        return street;
    }
    public void setStreet(String city){
        this.street = street;
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
}
