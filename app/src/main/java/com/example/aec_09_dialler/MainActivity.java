package com.example.aec_09_dialler;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_AC,btn_DEL,btn_CALL,btn_SAVE;
    TextView TV_NumberField;
    static int PERMISSION_CODE= 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializer();
        handleNumBtnClick();
        handleOperationBtnClick();
        handleCallSaveBTN();
        

    }

    private void handleCallSaveBTN() {
        btn_CALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_NumberField.getText().toString();
                if (temp.length()<10){
                    Toast.makeText(MainActivity.this, "NUM MUST BE 10 DIGIT", Toast.LENGTH_SHORT).show();
                }else if(temp.length()==10) {
                    Toast.makeText(MainActivity.this, "CALLED", Toast.LENGTH_SHORT).show();
                    String phoneno = TV_NumberField.getText().toString();
                    Intent i = new Intent(Intent.ACTION_CALL);
                    i.setData(Uri.parse("tel:"+phoneno));
                    startActivity(i);
                }
            }
        });

        btn_SAVE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_NumberField.getText().toString();
                if (temp.length()<10){
                    Toast.makeText(MainActivity.this, "NUM MUST BE 10 DIGIT", Toast.LENGTH_SHORT).show();
                }else if(temp.length()==10) {
                    Toast.makeText(MainActivity.this, "SAVED", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    private void handleOperationBtnClick() {
        btn_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV_NumberField.setText("");
            }
        });
        btn_DEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = TV_NumberField.getText().toString();
                TV_NumberField.setText(temp.substring(0,temp.length()-1));
            }
        });
    }

    private void handleNumBtnClick() {
//        Toast.makeText(this, "hello nums", Toast.LENGTH_SHORT).show();
        if (TV_NumberField.getText().toString().length() == 10){
            Toast.makeText(this, "BAS", Toast.LENGTH_SHORT).show();
            return;
        }
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TV_NumberField.getText().toString().length() == 10){
                    Toast.makeText(MainActivity.this, "BAS", Toast.LENGTH_SHORT).show();
                    return;
                }
                TV_NumberField.setText(TV_NumberField.getText().toString()+btn_0.getText().toString());
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TV_NumberField.getText().toString().length() == 10){
                    Toast.makeText(MainActivity.this, "BAS", Toast.LENGTH_SHORT).show();
                    return;
                }
                TV_NumberField.setText(TV_NumberField.getText().toString()+btn_1.getText().toString());
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TV_NumberField.getText().toString().length() == 10){
                    Toast.makeText(MainActivity.this, "BAS", Toast.LENGTH_SHORT).show();
                    return;
                }
                TV_NumberField.setText(TV_NumberField.getText().toString()+btn_2.getText().toString());
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TV_NumberField.getText().toString().length() == 10){
                    Toast.makeText(MainActivity.this, "BAS", Toast.LENGTH_SHORT).show();
                    return;
                }
                TV_NumberField.setText(TV_NumberField.getText().toString()+btn_3.getText().toString());
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TV_NumberField.getText().toString().length() == 10){
                    Toast.makeText(MainActivity.this, "BAS", Toast.LENGTH_SHORT).show();
                    return;
                }
                TV_NumberField.setText(TV_NumberField.getText().toString()+btn_4.getText().toString());
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TV_NumberField.getText().toString().length() == 10){
                    Toast.makeText(MainActivity.this, "BAS", Toast.LENGTH_SHORT).show();
                    return;
                }
                TV_NumberField.setText(TV_NumberField.getText().toString()+btn_5.getText().toString());
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TV_NumberField.getText().toString().length() == 10){
                    Toast.makeText(MainActivity.this, "BAS", Toast.LENGTH_SHORT).show();
                    return;
                }
                TV_NumberField.setText(TV_NumberField.getText().toString()+btn_6.getText().toString());
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TV_NumberField.getText().toString().length() == 10){
                    Toast.makeText(MainActivity.this, "BAS", Toast.LENGTH_SHORT).show();
                    return;
                }
                TV_NumberField.setText(TV_NumberField.getText().toString()+btn_7.getText().toString());
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TV_NumberField.getText().toString().length() == 10){
                    Toast.makeText(MainActivity.this, "BAS", Toast.LENGTH_SHORT).show();
                    return;
                }
                TV_NumberField.setText(TV_NumberField.getText().toString()+btn_8.getText().toString());
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TV_NumberField.getText().toString().length() == 10){
                    Toast.makeText(MainActivity.this, "BAS", Toast.LENGTH_SHORT).show();
                    return;
                }
                TV_NumberField.setText(TV_NumberField.getText().toString()+btn_9.getText().toString());
            }
        });
    }


    public void initializer(){
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_AC = findViewById(R.id.btn_AC);
        btn_SAVE = findViewById(R.id.btn_SAVE);
        btn_DEL = findViewById(R.id.btn_DEL);
        btn_CALL = findViewById(R.id.btn_CALL);
        TV_NumberField = findViewById(R.id.TV_NumberField);
        if (ContextCompat.checkSelfPermission(MainActivity.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CALL_PHONE},PERMISSION_CODE);

        }
    }

}