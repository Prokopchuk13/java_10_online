package port;

public class PortController {
    private PortService portService;

    public PortController(PortService portServiceInstance) {
        portService = portServiceInstance;
    }

    public PortEntity create(PortEntity port) {
        return portService.create(port);
    }
    public PortEntity get(String portId) {
        return portService.get(portId);
    }
    public PortEntity update(String portId, PortEntity port) {
        return portService.update(portId,port);
    }
    public PortEntity delite(String portId) {
        return portService.delite(portId);
    }
}


