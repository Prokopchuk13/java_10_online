package ua.com.alevel;
import ua.com.alevel.controller.MusicController;
import ua.com.alevel.db.MusicDb;
import ua.com.alevel.entitys.Music;
import ua.com.alevel.service.music.MusicServiceImplementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String position = "";

        while ((position) != null) {
            menu();
            position = bufferedReader.readLine();
            crud(position, bufferedReader);
        }
    }
    private static void crud(String option, BufferedReader bufferedReader) throws IOException {
        String id = "";
        MusicController musicController = new MusicController(new MusicServiceImplementation(new MusicDb()));
        String author = "";
        String name = "";
        String age = "";
        String time = "";

        switch (option) {

            case ("1"):

                Music music = new Music();

                while (author == "" && author != "No"){
                    System.out.println("Do you want to create an author ?");
                    author = bufferedReader.readLine();
                    System.out.println(author);
                }
                if (author != "No")
                    music.setAuthor(author);

                while (name == "" && name != "No") {
                    System.out.println("Do you want to create a name ?");
                    name = bufferedReader.readLine();
                }
                if (name != "No")
                    music.setName(name);

                while (age == "" && age != "No"){
                    System.out.println("Do you want to add age ? ");
                    age = bufferedReader.readLine();
                }
                if (age != "No")
                    music.setAge(Integer.valueOf(age));

                while (time == "" && time != "No") {
                    System.out.println("Do you want to add time ?");
                    time = bufferedReader.readLine();
                }
                if (time != "No")
                    music.setTime(Integer.valueOf(time));
                musicController.create(music);
                break;

            case ("2"):
                System.out.println("Type id if you are going to update");
                id = String.valueOf(bufferedReader.readLine());

                Music updateMusic = new Music();

                while (author == "" && author != "No"){
                    System.out.println("Do you want to create an author ?");
                    author = bufferedReader.readLine();
                }
                if (author != "No")
                    updateMusic.setAuthor(author);

                while (name == "" && name != "No") {
                    System.out.println("Do you want to create a name ?");
                    name = bufferedReader.readLine();
                }
                if (name != "No")
                    updateMusic.setName(name);

                while (age == "" && age != "No"){
                    System.out.println("Do you want to add age ? ");
                    age = bufferedReader.readLine();
                }
                if (age != "No")
                    updateMusic.setAge(Integer.valueOf(age));

                while (time == "" && time != "No") {
                    System.out.println("Do you want to add time ?");
                    time = bufferedReader.readLine();
                }
                if (time != "No")
                    updateMusic.setTime(Integer.valueOf(time));
                musicController.update(id,updateMusic);
                break;

            case ("3"):
                System.out.println("Type id if you are going to delete");
                id = String.valueOf(bufferedReader.readLine());
                musicController.delete(id);
                break;

            case ("4"):
                System.out.println("Enter the name of the music");
                id = String.valueOf(bufferedReader.readLine());
                Music music1 = musicController.find(id);
                System.out.println(music1.getName());
                System.out.println(music1.getTime());
                System.out.println(music1.getAge());
                System.out.println(music1.getAuthor());
                break;

            case ("5"):
                System.out.println("Do you want to complete the program ?");
                System.exit(0);
                break;
        }
    }
    private static void menu() {
        System.out.println("Create 1");
        System.out.println("Update 2");
        System.out.println("Delete 3");
        System.out.println("Find 4");
    }
}
