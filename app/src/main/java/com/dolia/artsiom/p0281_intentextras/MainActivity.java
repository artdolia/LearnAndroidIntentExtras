package com.dolia.artsiom.p0281_intentextras;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements OnClickListener{

    EditText etFName;
    EditText etLName;

    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        etFName = (EditText) findViewById(R.id.etFName);
        etLName = (EditText) findViewById(R.id.etLName);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        Intent intent = new Intent(this, ViewInfoActivity.class);

        intent.putExtra("fName", etFName.getText().toString());
        intent.putExtra("lName", etLName.getText().toString());

        startActivity(intent);

    }
}
