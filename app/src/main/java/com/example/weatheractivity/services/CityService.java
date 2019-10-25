package com.example.weatheractivity.services;

import android.content.Context;

import com.example.weatheractivity.ICityServiceListener;
import com.example.weatheractivity.ILocationServiceListener;
import com.example.weatheractivity.models.City;
import com.example.weatheractivity.models.Location;

public class CityService implements ILocationServiceListener {

    ICityServiceListener iCityServiceListener;

    public CityService(ICityServiceListener iCityServiceListener, Context context) {
        this.iCityServiceListener = iCityServiceListener;
        new LocationService(this,context);
    }

    @Override
    public void onLocationSuccess(Location location) {
        City newCity = new City();
        newCity.setLocation(location);
        iCityServiceListener.onCitySuccess(newCity);
    }

}

