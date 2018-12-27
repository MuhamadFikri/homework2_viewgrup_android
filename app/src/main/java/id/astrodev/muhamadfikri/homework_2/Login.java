package id.astrodev.muhamadfikri.homework_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClickDaftar(View view) {
        //untuk pindah halaman ke form pendaftaran
        Intent intent = new Intent(this, create.class);
        startActivity(intent);
    }
    public void onClickLogin(View view) {
        //untuk pindah halaman ke form pendaftaran
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}
