package com.kittendev.math.view.activity;

import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.kittendev.math.R;
import com.kittendev.math.view.widget.QuadraticWidget;

public class QuadraticActivity extends AppCompatActivity implements View.OnClickListener {

    private QuadraticWidget quadraticWidget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadratic);

        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.quadratic_floatingActionButton);
        quadraticWidget = (QuadraticWidget) findViewById(R.id.quadratic_quadraticWidget);

        floatingActionButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.quadratic_floatingActionButton:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("请输入参数");
                View dialogView = LayoutInflater.from(this).inflate(R.layout.widget_quadratic_dialog, null);
                final EditText a = (EditText) dialogView.findViewById(R.id.quadratic_dialog_a);
                final EditText b = (EditText) dialogView.findViewById(R.id.quadratic_dialog_b);
                final EditText c = (EditText) dialogView.findViewById(R.id.quadratic_dialog_c);
                builder.setView(dialogView);
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        quadraticWidget.setString("A = " + a.getText().toString() + " B = " + b.getText().toString() + " C = " + c.getText().toString());
                    }
                });
                builder.setCancelable(false);
                builder.show();
                break;
        }
    }


}
