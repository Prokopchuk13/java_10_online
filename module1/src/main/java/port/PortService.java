package port;

import dao.PortDao;

public class PortService {
    private PortDao portDao;

    public PortService(PortDao portDaoInstance) {
        portDao = portDaoInstance;
    }

    public PortEntity create(PortEntity port) {
        return portDao.create(port);
    }

    public PortEntity get(String portId) {
        return portDao.get(portId);
    }
    public PortEntity update(String portId, PortEntity port) {
        return portDao.update(portId,port);
}
    public PortEntity delite(String portId) {
        return portDao.delite(portId);
    }
}

