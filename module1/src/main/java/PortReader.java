import port.PortEntity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PortReader {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static PortEntity create() throws IOException {
        String name;
        String city;
        String country;

        System.out.println("Enter the name of a port");
        name = br.readLine();

        System.out.println("Enter the city of a port");
        city = br.readLine();

        System.out.println("Enter the country of a port");
        country = br.readLine();

        return new PortEntity(name, city, country);
    }
    public static String get() throws IOException {
        String id;

        System.out.println("Enter the id of a port");
        id = br.readLine();
        return id;
    }
    public static String delite() throws IOException {
        String deliteId;

        System.out.println("Enter the id of a port");
        deliteId = br.readLine();
        return deliteId;
    }
    public static PortEntity update() throws IOException {
        String updateId;

        System.out.println("Enter the id of a port");
        updateId = br.readLine();

        String name;
        String city;
        String country;

        System.out.println("Enter the name of a port");
        name = br.readLine();

        System.out.println("Enter the city of a port");
        city = br.readLine();

        System.out.println("Enter the country of a port");
        country = br.readLine();
        PortEntity portEntity = new PortEntity(name, city, country);
        portEntity.setId(updateId);
        return portEntity;
    }
}


