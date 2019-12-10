package com.example.kalkulatorevernote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String pertama , kedua, ketiga ;
    private CheckBox ckpertama , ckkedua, ckketiga;
    private EditText edtpertama , edtkedua , edtketiga ;
    private Button btntambah,btnkurang , btnkali,btnbagi;
    private ArrayList<String> mresult;
    private TextView result;
    Double v1;
    Double v2;
    int hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ckpertama = findViewById(R.id.chekpertama);
        ckkedua = findViewById(R.id.chekkedua);
        ckketiga = findViewById(R.id.chekketiga);

        btntambah = findViewById(R.id.tambah);
        btnkurang = findViewById(R.id.kurang);
        btnkali = findViewById(R.id.kali);
        btnbagi = findViewById(R.id.bagi);

        edtpertama = findViewById(R.id.nilaipertama);
        edtkedua = findViewById(R.id.nilaiKedua);
        edtketiga = findViewById(R.id.nilaiKetiga);

        result= findViewById(R.id.resultok);

        mresult = new ArrayList<>();



        ckpertama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean Checked = ((CheckBox)view).isChecked();
                switch (view.getId()) {
                    case R.id.chekpertama:
                    if (Checked) {

                    } else {
                        Toast.makeText(MainActivity.this,"Harus di cek",Toast.LENGTH_SHORT);
                    }
                            break;
                }
            }
        });

        ckkedua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kedua = edtkedua.getText().toString();
                if (ckkedua.isChecked()) {
                    mresult.add(kedua);
                } else if (ckkedua.isChecked()&&kedua.length() == 0) {
                    Toast.makeText(MainActivity.this, "Fieldtidak boleh Kosong", Toast.LENGTH_SHORT);
                } else {
                    mresult.remove(kedua);
                }
            }
        });

        ckketiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketiga = edtketiga.getText().toString();
                if (ckketiga.isChecked()) {
                    mresult.add(ketiga);
                } else if (ckketiga.isChecked()&& ketiga.length() == 0) {
                    Toast.makeText(MainActivity.this, "Field tidak boleh kosong", Toast.LENGTH_SHORT);
                } else {
                    mresult.remove(ketiga);
                }
            }
        });


        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pertama = edtpertama.getText().toString();
                kedua = edtkedua.getText().toString();
                ketiga = edtketiga.getText().toString();

                if (TextUtils.isEmpty(pertama)){
                    edtpertama.setError("Masukan Angka ke 1");
                    return;
                }else if(TextUtils.isEmpty(kedua) ){
                    edtkedua.setError("Masukan Angka ke 2 ");
                    return;
                }else if (TextUtils.isEmpty(ketiga) ){
                    edtketiga.setError("Masukan Angka ke 3 ");
                    return;
                }else {
                    result.setText(""+hasil);
                }
                int nilaipertama = Integer.parseInt(pertama);
                int nilaikedua = Integer.parseInt(kedua);
                int nilaiketiga = Integer.parseInt(ketiga);
                hasil = nilaipertama+nilaikedua+nilaiketiga;

            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pertama = edtpertama.getText().toString();
                kedua = edtkedua.getText().toString();
                ketiga = edtketiga.getText().toString();

                if (TextUtils.isEmpty(pertama)){
                    edtpertama.setError("Masukan Angka ke 1");
                    return;
                }else if(TextUtils.isEmpty(kedua) ){
                    edtkedua.setError("Masukan Angka ke 2 ");
                    return;
                }else if (TextUtils.isEmpty(ketiga) ){
                    edtketiga.setError("Masukan Angka ke 3 ");
                    return;
                }else {
                    result.setText(""+hasil);
                }

                int nilaipertama = Integer.parseInt(pertama);
                int nilaikedua = Integer.parseInt(kedua);
                int nilaiketiga = Integer.parseInt(ketiga);
                hasil = nilaipertama-nilaikedua-nilaiketiga;
            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pertama = edtpertama.getText().toString();
                kedua = edtkedua.getText().toString();
                ketiga = edtketiga.getText().toString();

                if (TextUtils.isEmpty(pertama)){
                    edtpertama.setError("Masukan Angka ke 1");
                    return;
                }else if(TextUtils.isEmpty(kedua) ){
                    edtkedua.setError("Masukan Angka ke 2 ");
                    return;
                }else if (TextUtils.isEmpty(ketiga) ){
                    edtketiga.setError("Masukan Angka ke 3 ");
                    return;
                }else {
                    result.setText(""+hasil);
                }

                int nilaipertama = Integer.parseInt(pertama);
                int nilaikedua = Integer.parseInt(kedua);
                int nilaiketiga = Integer.parseInt(ketiga);
                hasil = nilaipertama*nilaikedua*nilaiketiga;
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pertama = edtpertama.getText().toString();
                kedua = edtkedua.getText().toString();
                ketiga = edtketiga.getText().toString();

                if (TextUtils.isEmpty(pertama)){
                    edtpertama.setError("Masukan Angka ke 1");
                    return;
                }else if(TextUtils.isEmpty(kedua) ){
                    edtkedua.setError("Masukan Angka ke 2 ");
                    return;
                }else if (TextUtils.isEmpty(ketiga) ){
                    edtketiga.setError("Masukan Angka ke 3 ");
                    return;
                }else {
                    result.setText(""+hasil);
                }

                int nilaipertama = Integer.parseInt(pertama);
                int nilaikedua = Integer.parseInt(kedua);
                int nilaiketiga = Integer.parseInt(ketiga);
                hasil = nilaipertama/nilaikedua/nilaiketiga;
            }
        });

    }
}


