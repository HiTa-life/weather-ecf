package com.example.weatheractivity.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.example.weatheractivity.IWeatherServiceListener;
import com.example.weatheractivity.R;
import com.example.weatheractivity.models.Weather;
import com.example.weatheractivity.services.WeatherService;

public class WeatherActivity extends AppCompatActivity implements IWeatherServiceListener {
    TextView tvLocationGPS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvLocationGPS = findViewById(R.id.tvLocationGPS);
        new WeatherService(this);
    }

    @Override
    public void onWeatherSuccess(Weather weather) {
        Toast.makeText(
                this,
                weather.getCity().getLocation().getLatitude().toString()
                        + "  "
                        + weather.getCity().getLocation().getLongitude().toString(),
                Toast.LENGTH_LONG
        ).show();
    }

}



