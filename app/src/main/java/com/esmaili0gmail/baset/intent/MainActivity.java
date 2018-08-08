package com.esmaili0gmail.baset.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, Constnts {
    public static final String KEY_NAME = "Name";
    public static final String KEY_LAST_NAME = "LastName";
    public static final String EXPERT = "Expert";
    public static final String LOCALE = "Locale";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //<editor-fold desc="Init">
        final Button implicit = (Button) findViewById(R.id.btn_implicit);
        Button explicit = (Button) findViewById(R.id.btn_explicit);
        Button putExtra = (Button) findViewById(R.id.btn_putEtra);
        implicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicit_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(implicit_intent);
            }
        });
        //</editor-fold>

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn_explicit:
                Intent explicit = new Intent(getBaseContext(), ActivityExplicit.class);
                startActivity(explicit);
                break;
            case R.id.btn_putEtra:
                Intent intent = new Intent(getBaseContext(), ActivityPutExtra.class);
                String name = "Baset";
                String lastName = "Esmaeili";
                String expert = "Android and Java";
                String locale = "fa-IR";
                int age = 17;
                intent.putExtra(KEY_NAME, name);
                intent.putExtra(KEY_LAST_NAME, lastName);
                intent.putExtra(EXPERT, expert);
                intent.putExtra(LOCALE, locale);
                intent.putExtra(KEY_AGE, age);
                startActivity(intent);
        }
    }
}
