package com.example.bangcuuchuong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText bangSo;
    TextView txtketQua;
    Button btnInBang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangSo = findViewById(R.id.editTextBangSo);
        txtketQua = findViewById(R.id.txtKQ);
        btnInBang = findViewById(R.id.buttonInRa);

        btnInBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int bangSo1 = Integer.parseInt(bangSo.getText().toString());

                //int i=0;
                String st="";
                for (int i=1;i<=10;i++){
                  st+=bangSo1 +" x "+ i + "=" + bangSo1*i +"\n";

                }
                txtketQua.setText(st);




            }
        });

    }
}
