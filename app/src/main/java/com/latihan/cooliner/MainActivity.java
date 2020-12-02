package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveActivity2 = findViewById(R.id.btn_move_activity2);
        btnMoveActivity2.setOnClickListener(this);

        Button btnMoveActivity3 = findViewById(R.id.btn_move_activity3);
        btnMoveActivity3.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_move_activity2:
                Intent moveIntent2 = new Intent(MainActivity.this, MoveActivity2.class);
                startActivity(moveIntent2);
                break;

            case R.id.btn_move_activity3:
                Intent moveIntent3 = new Intent(MainActivity.this, MoveActivity3.class);
                startActivity(moveIntent3);
                break;
        }
    }
}