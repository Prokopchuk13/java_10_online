package ua.com.alevel.entitys;

public class Car extends BaseEntitys
{

    private String color;
    private String model;
    private String engine;
    private String brand;

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getEngine(){
        return engine;
    }
    public void setEngine(String model){
        this.engine = engine;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand = brand;
    }
}
