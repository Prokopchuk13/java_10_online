package port;

import common.BaseEntity;

public class PortEntity extends BaseEntity {
    private String name;
    private String city;
    private String country;

    public PortEntity(String portName, String cityName, String countryName) {
        name = portName;
        city = cityName;
        country = countryName;
    }

    public void print() {
        System.out.println("Port{ name = " + name + ", city = " + city + ", country = " + country + ", id = " + super.getId() + " }");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}


