package com.e.clock;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView mydateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //////////////////This code is used to change the white color at the buttom of the the phone to any of your desired color//////
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(Color.argb(255, 0, 163, 255));
        }
        setContentView(R.layout.activity_main);

        mydateTime = (TextView) findViewById(R.id.dayMonthAndNumber);
        Calendar mycalendar = Calendar.getInstance();
        String myData = DateFormat.getDateInstance(DateFormat.DEFAULT).format(mycalendar.getTime());
        mydateTime.setText(myData);
    }
}
