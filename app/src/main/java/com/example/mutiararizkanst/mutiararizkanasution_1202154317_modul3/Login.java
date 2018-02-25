package com.example.mutiararizkanst.mutiararizkanasution_1202154317_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
//    Deklarasi variabel
    private EditText Username, Pass;
    private Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        //menghubungkan dengan id
        Username = (EditText)findViewById(R.id.userForm);
        Pass = (EditText)findViewById(R.id.passForm);
        Login = (Button) findViewById(R.id.btnLogin);

        //berfungsi membuat tombol login dapat di klik dan menampilkan tampilan selanjutnya yaitu (daftar menu)
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = Username.getText().toString().trim();
                String pass = Pass.getText().toString().trim();

                if(user.equals("EAD") && pass.equals("MOBILE")){
                    Intent intent = new Intent(Login.this, Daftarmenu.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(Login.this, "Username dan Passwordnya Salah !", Toast.LENGTH_SHORT).show();
                }// alert ketika user salah memasukkan username dan password
                if(user.isEmpty()){
                    Toast.makeText(Login.this, "Username belum diisi", Toast.LENGTH_SHORT).show();// alert ketika user salah belum input username
                }if(pass.isEmpty()){
                    Toast.makeText(Login.this, "Password belum diisi", Toast.LENGTH_SHORT).show();// alert ketika user salah belum input Password
                }
            }
        });
    }
}
