package dao;

import Utils.Utils;
import port.PortEntity;

import java.lang.reflect.Field;
import java.util.Arrays;

public class PortDao {
    private PortEntity[] portEntities = new PortEntity[10];
    private int lastIndex = 0;

    public PortEntity create(PortEntity portEntity) {

        if (lastIndex == portEntities.length) {
            portEntities = Arrays.copyOf(portEntities, ((portEntities.length * 3) / 2) + 1);
        }
        add(portEntity);
        return portEntity;
    }
    private void add(PortEntity portEntity) {
        portEntity.setId(Utils.generateId());
        portEntities[lastIndex] = portEntity;
        lastIndex++;
    }
    public PortEntity get(String id) {
        PortEntity result = null;

        for (PortEntity port : portEntities) {
            if (port!=null && (port.getId()).equals(id)){
                result = port;
                break;
            }
        }
        return result;
    }
    public PortEntity update(String  id, PortEntity port) {
        PortEntity result = null;
        for (int i = 0; i < portEntities.length; i++) {
            if (portEntities[i] != null){
                if (portEntities[i].getId().equals(id)) {
                    PortEntity updatePort = portEntities[i];
                    Field[] fields = port.getClass().getDeclaredFields();

                    for(Field field: fields) {
                        if (field.getName() == "name"){
                            updatePort.setName(port.getName());
                        }
                        if (field.getName() == "city"){
                            updatePort.setCity(port.getCity());
                        }
                        if (field.getName() == "country"){
                            updatePort.setCountry(port.getCountry());
                        }
                    }
                    result = updatePort;
                    break;
                }
            }
        } return result;
    }
    public PortEntity delite(String id) {
        PortEntity result = null;
        int deleteIndex = 0;
        PortEntity [] deleteId = new PortEntity[portEntities.length - 1];
        for (int i = 0; i <portEntities.length; i++) {
            if (portEntities[i].getId().equals(id)) {
                result = portEntities[i];
                portEntities[i] = null;
                deleteIndex = i;
                break;
            }
        }
            for(int e = 0; e < deleteIndex; e++){
                deleteId[e] = portEntities[e];
            }
            for(int r = deleteIndex; r < deleteId.length; r++){
                deleteId[r] = portEntities[r + 1];
            }
        return result ;
    }
}


