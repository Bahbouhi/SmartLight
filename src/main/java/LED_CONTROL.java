package com.example.bluetooth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ListActivity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.os.SystemClock;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;

import android.os.Bundle;

import static com.example.bluetooth.MainActivity.bTSocket;

public class LED_CONTROL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led__control);
    }
    //BluetoothSocket btSocket;

    public void turnOffLed(View view)
    {
        if (bTSocket!=null)
        {
            try
            {
                bTSocket.getOutputStream().write("0".toString().getBytes());
                ImageView i1 = findViewById(R.id.imageView3);
                ImageView i2 = findViewById(R.id.imageView2);
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.INVISIBLE);
            }
            catch (IOException e)
            {
                Toast.makeText(getApplicationContext(), "Could not  turn off: "+e.toString(), Toast.LENGTH_LONG).show();
            }
        }
    }
    public void turnOnLed(View view)
    {
        if (bTSocket!=null)
        {
            try
            {
                bTSocket.getOutputStream().write("1".toString().getBytes());
                ImageView i1 = findViewById(R.id.imageView2);
                ImageView i2 = findViewById(R.id.imageView3);
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.INVISIBLE);
            }
            catch (IOException e)
            {
                Toast.makeText(getApplicationContext(), "Could not  turn on: "+e.toString(), Toast.LENGTH_LONG).show();

            }
        }
    }
}
