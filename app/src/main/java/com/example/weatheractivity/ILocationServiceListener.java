package com.example.weatheractivity;

import android.content.Context;
import android.location.LocationManager;

import com.example.weatheractivity.activities.WeatherActivity;
import com.example.weatheractivity.models.Location;

public interface ILocationServiceListener {

     void onLocationSuccess (Location location);


}
