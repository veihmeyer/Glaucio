package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    EditText telefone;
    Button ligar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        telefone = (EditText) findViewById(R.id.telefone);
        ligar = (Button) findViewById(R.id.ligar);
        ligar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = telefone.getText().toString();
                Uri uri = Uri.parse("tel:" + numero);

                Intent intent = new Intent(Intent.ACTION_CALL, uri);
                startActivity(intent);
            }
        });

        }
    }