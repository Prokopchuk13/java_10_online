package ua.com.alevel.entitys;

public class Music extends BaseEntity {

    public int length;
    private int age;
    private int time;
    private String name;
    private String author;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getTime(){
        return time;
    }
    public void setTime(int time){
        this.time = time;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
