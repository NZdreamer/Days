package com.hi45288871.days;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.R.color.holo_blue_light;
import static android.R.color.holo_orange_light;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mySwitchButton = (Button) findViewById(R.id.button_switchButtton);

    }
    public void buttonOnClick(View view)
    {
        Button mySwitchButton = (Button) findViewById(R.id.button_switchButtton);
        String buttonText = (String)mySwitchButton.getText();
        if (buttonText.equals("later") )
        {
            mySwitchButton.setText("before");
            mySwitchButton.setTextColor(getResources().getColor(holo_blue_light) );
        }
        else if (buttonText.equals("before"))
        {
            mySwitchButton.setText("later");
            mySwitchButton.setTextColor(getResources().getColor(holo_orange_light));
        }
        else
        {
            Log.v("Mainactivity","bottonText is neither 'later' nor 'before'!");
        }
    }
}
