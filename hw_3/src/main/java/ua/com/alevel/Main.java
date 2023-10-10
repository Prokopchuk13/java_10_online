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
        MusicController musicController = new MusicController(new MusicServiceImplementation(new MusicDb()));

        while ((position) != null) {
            menu();
            position = bufferedReader.readLine();
            crud(position, bufferedReader,musicController);
        }
    }
    private static void crud(String option, BufferedReader bufferedReader, MusicController musicController) throws IOException {
        String id = null;
        String author = null;
        String name = null;
        String age = null;
        String time = null;

        switch (option) {

            case ("1"):

                Music music = new Music();

                while (true) {
                    if (author != null) {
                        break;
                    }
                    System.out.println("Do you want to create an author ?");
                    author = bufferedReader.readLine();
                }
                if (!author.equals("No"))
                    music.setAuthor(author);

                while (true) {
                    if (name != null) {
                        break;
                    }
                    System.out.println("Do you want to create a name ?");
                    name = bufferedReader.readLine();
                }
                if (!name.equals("No"))
                    music.setName(name);

                    while (true) {
                        if (age != null) {
                            break;
                        }
                    System.out.println("Do you want to add age ? ");
                    age = bufferedReader.readLine();
                }
                if (!age.equals("No"))
                    music.setAge(Integer.valueOf(age));

                        while (true) {
                            if (time != null) {
                                break;
                            }
                    System.out.println("Do you want to add time ?");
                    time = bufferedReader.readLine();
                }
                if (!time.equals("No"))
                    music.setTime(Integer.valueOf(time));
                musicController.create(music);
                break;

            case ("2"):
                System.out.println("Type id if you are going to update");
                id = String.valueOf(bufferedReader.readLine());

                Music updateMusic = new Music();

                while (true) {
                    if (author != null) {
                        break;
                    }
                    System.out.println("Do you want to create an author ?");
                    author = bufferedReader.readLine();
                }
                if (!author.equals("No"))
                    updateMusic.setAuthor(author);

                while (true) {
                    if (name != null) {
                        break;
                    }
                    System.out.println("Do you want to create a name ?");
                    name = bufferedReader.readLine();
                }
                if (!name.equals("No"))
                    updateMusic.setName(name);

                while (true) {
                    if (age != null){
                        break;
                    }
                    System.out.println("Do you want to add age ? ");
                    age = bufferedReader.readLine();
                }
                if (!age.equals("No"))
                    updateMusic.setAge(Integer.valueOf(age));

                while (true) {
                    if (time != null) {
                        break;
                    }
                    System.out.println("Do you want to add time ?");
                    time = bufferedReader.readLine();
                }
                if (!time.equals("No"))
                    updateMusic.setTime(Integer.valueOf(time));
                musicController.update(id,updateMusic);
                break;

            case ("3"):
                System.out.println("Type id if you are going to delete");
                id = String.valueOf(bufferedReader.readLine());
                musicController.delete(id);
                break;

            case ("4"):
                System.out.println("Enter the id music album");
                id = String.valueOf(bufferedReader.readLine());
                musicController.find(id);
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
