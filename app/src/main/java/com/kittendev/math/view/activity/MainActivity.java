package com.kittendev.math.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.kittendev.math.R;
import android.support.v7.widget.*;
import android.widget.*;
import android.graphics.*;
import com.common.design.*;
import com.common.design.MaterialDialog.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
		CardView Math3 = (CardView)findViewById(R.id.Math3);
        CardView Math2 = (CardView)findViewById(R.id.Math2);
        CardView Math1 = (CardView) findViewById(R.id.Math1);
		
        Math1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, QuadraticActivity.class));
            }
        });
		Math2.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
				startActivity(new Intent(MainActivity.this, Math2.class));
				}
		});
		Math3.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
				startActivity(new Intent(MainActivity.this, Math3.class));
				}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
		
        int id = item.getItemId();

        if (id == R.id.action_settings) {
			new MaterialDialog.Builder(this)
				.setTitle("关于")
				.setMessage("本软件是团队项目，由\nKally\nBlue Sky\nLovely boy\n制作")
				.setPositiveButton(null)
				.setNegativeButton(null).show();
			
        }
		return false;
	 }
}
