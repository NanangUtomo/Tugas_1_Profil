package com.example.myprofil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyProfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profil);

        final EditText nama = (EditText) findViewById(R.id.inputNama);
        final EditText nim = (EditText) findViewById(R.id.inputNim);
        final EditText kelas = (EditText) findViewById(R.id.inputKelas);
        final EditText jurusan = (EditText) findViewById(R.id.inputJurusan);
        final EditText hobi = (EditText) findViewById(R.id.inputHobi);

        final TextView nama_t = (TextView) findViewById(R.id.txt_nama);
        final TextView nim_t = (TextView) findViewById(R.id.txt_nim);
        final TextView kelas_t = (TextView) findViewById(R.id.txt_kelas);
        final TextView jurusan_t = (TextView) findViewById(R.id.txt_jurusan);
        final TextView hobi_t = (TextView) findViewById(R.id.txt_hobi);

        final Button input = (Button) findViewById(R.id.btn_input);
        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama1 = nama.getText().toString();
                String nim1 = nim.getText().toString();
                String kelas1 = kelas.getText().toString();
                String jurusan1 = jurusan.getText().toString();
                String hobi1 = hobi.getText().toString();

                nama_t.setText(nama1);
                nim_t.setText(nim1);
                kelas_t.setText(kelas1);
                jurusan_t.setText(jurusan1);
                hobi_t.setText(hobi1);
            }
        });
    }
}