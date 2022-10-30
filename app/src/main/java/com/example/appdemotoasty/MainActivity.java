package com.example.appdemotoasty;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToasty(View v) {
        switch (v.getId()) {
            case R.id.btnToastyOK:
                Toasty.success(this, "Todo va bien", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnToastyKO:
                Toasty.error(this, "Precaucion, amigo conductor", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}