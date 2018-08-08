package com.esmaili0gmail.baset.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ActivityPutExtra extends AppCompatActivity implements Constnts {
private TextView name,lastname,expert,locale;
private String str_name;
private String str_lastName;
private String str_Expert;
private String str_Locale;
private int int_Age;
    private static final String TAG = "ActivityPutExtra";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_put_extra);
        getIntents();
        setupViews();
        setupData();
    }

    private void setupData() {
        name.setText(str_name);
        lastname.setText(str_lastName);
        expert.setText(str_Expert);
        locale.setText(str_Locale);
        Toast.makeText(getBaseContext(),""+int_Age,Toast.LENGTH_SHORT).show();
    }

    private void getIntents() {
        str_name=getIntent().getStringExtra(MainActivity.KEY_NAME);
        str_lastName=getIntent().getStringExtra(MainActivity.KEY_LAST_NAME);
        str_Expert=getIntent().getStringExtra(MainActivity.EXPERT);
        str_Locale=getIntent().getStringExtra(MainActivity.LOCALE);
        int_Age=getIntent().getIntExtra(KEY_AGE,0);
        Log.e(TAG, "getIntents: "+int_Age );

    }

    private void setupViews() {
        // TODO: 2018/08/08 بعدا کامل شود
        name=(TextView)findViewById(R.id.tv_name);
        lastname=(TextView)findViewById(R.id.tv_lastName);
        expert=findViewById(R.id.tv_expert);
        locale=findViewById(R.id.tv_locale);
    }
}
