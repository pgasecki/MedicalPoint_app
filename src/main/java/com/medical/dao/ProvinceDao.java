package com.medical.dao;

import com.medical.domain.City;
import com.medical.domain.Province;

public interface ProvinceDao extends GenericDao<Province>{

    City findCityInProvinceByName(String cityName, Province province);
    void addCity(String cityName, Province province);
    City findCityInProvince(City city);
}
