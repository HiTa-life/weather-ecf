package com.example.weatheractivity;

import com.example.weatheractivity.models.City;
import com.example.weatheractivity.models.Weather;

public interface IWeatherServiceListener {
     void onWeatherSuccess (Weather weather);
}
