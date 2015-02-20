package com.dolia.artsiom.p0281_intentextras;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;


public class ViewInfoActivity extends ActionBarActivity {

    TextView tvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_info);

        tvView = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();

        String fName = intent.getStringExtra("fName");
        String lName = intent.getStringExtra("lName");

        tvView.setText("Passed Info: " + fName + " " + lName);
    }
}
