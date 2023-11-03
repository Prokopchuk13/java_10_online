import dao.PortDao;
import port.PortController;
import port.PortEntity;
import port.PortService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String position = "";

        PortController portController = new PortController(new PortService(new PortDao()));

        while ((position) != null) {
            menu();
            position = bufferedReader.readLine();
            crud(position, portController);
        }
    }

    public static void menu() {
        System.out.println("Choose an option:");
        System.out.println("1 - Create");
        System.out.println("2 - Get");
        System.out.println("3 - Delite");
        System.out.println("4 - Update");
    }

    public static void crud(String position, PortController portController) throws IOException {
        switch (position) {
            case "1":
                // DTO - data transfer object
                PortEntity portDto = PortReader.create();
                PortEntity createdPort = portController.create(portDto);

                createdPort.print();
                break;
            case "2":
                String portIdDto = PortReader.get();
                PortEntity port = portController.get(portIdDto);
                if (port == null){
                    System.out.println("No port");
                break;
                }
                port.print();
                break;
            case "3":
                String portIdDelite = PortReader.delite();
                PortEntity delitePort = portController.delite(portIdDelite);
                delitePort.print();
                break;
            case "4":
                PortEntity portIdUpdate = PortReader.update();
                PortEntity updatePort = portController.update(portIdUpdate.getId(),portIdUpdate);
                updatePort.print();
                break;
                default:
                return;

        }
    }
}
