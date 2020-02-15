package com.example.light;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Camera;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Parameter;
import java.security.Policy;

public class MainActivity extends AppCompatActivity{
    private Button Loginbutton,Logoutbutton;
    private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Loginbutton =(Button) findViewById(R.id.Loginbutton);
        Logoutbutton =(Button) findViewById(R.id.Logoutbutton);
        textview =(TextView) findViewById(R.id.textview);
    }
    public void showMessage(View v){
        if (v.getId()==R.id.Loginbutton){
            Toast.makeText(MainActivity.this,"Login button is clicked",Toast.LENGTH_LONG).show();
        }else if (v.getId()==R.id.Logoutbutton){
            Toast.makeText(MainActivity.this,"Logout button is clicked",Toast.LENGTH_LONG).show();
        }
    }
}
