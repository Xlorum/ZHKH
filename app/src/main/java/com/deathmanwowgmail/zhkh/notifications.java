package com.deathmanwowgmail.zhkh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class notifications extends AppCompatActivity implements View.OnClickListener {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        //3232323
        //Сережа хоть и гей,но молодец.!!&& Серега,увидь эти изменения!Ещё разок!
        //Поддурживаю
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn1:
                Intent intent = new Intent(this, ActivityTwo.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
