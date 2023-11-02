package country;

import common.BaseEntity;

public class CountryEntity extends BaseEntity {
    private String name;
    private int portCount = 0;

    public CountryEntity(String countryName) {
        name = countryName;
    }

    public void setPortCount(int portCount) {
        this.portCount = portCount;
    }

    public int getPortCount() {
        return portCount;
    }
}
