package udb.fp180271dsm.loginfirebaseapp;

import android.content.Intent;
import android.support.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Registrarse(View v)
    {
        Intent open = new Intent(MainActivity.this, RegistrationActivity.class);
        startActivity(open);
    }

    public void IS(View v)
    {
        Intent open = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(open);
    }
}