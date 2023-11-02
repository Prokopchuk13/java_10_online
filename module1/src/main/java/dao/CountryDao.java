package dao;

import country.CountryEntity;

import java.util.Arrays;

// data access object (об'єкт доступу до даних)
public class CountryDao {
    private CountryEntity countries[] = new CountryEntity[10];
    public void create(CountryEntity country){
        int lastIndex = 0;
        if (lastIndex == countries.length) {
            countries = Arrays.copyOf(countries, ((countries.length * 3) / 2) + 1);
        }
    }
}

