package com.example.weatheractivity.services;

import android.content.Context;

import com.example.weatheractivity.ICityServiceListener;
import com.example.weatheractivity.IWeatherServiceListener;
import com.example.weatheractivity.models.City;
import com.example.weatheractivity.models.Weather;

public class WeatherService implements ICityServiceListener {

    IWeatherServiceListener iWeatherServiceListener;

    public WeatherService(IWeatherServiceListener iWeatherServiceListener) {
        Context context = (Context)iWeatherServiceListener;
        this.iWeatherServiceListener = iWeatherServiceListener;
        new CityService(this,  context);
    }

    @Override
    public void onCitySuccess(City city) {
        Weather newWeather = new Weather();
        newWeather.setCity(city);

        iWeatherServiceListener.onWeatherSuccess(newWeather);
    }

}
