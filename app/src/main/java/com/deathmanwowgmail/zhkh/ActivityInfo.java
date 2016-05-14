package com.deathmanwowgmail.zhkh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class ActivityInfo extends AppCompatActivity implements View.OnTouchListener {

    private float fromPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        LinearLayout win1 = (LinearLayout) findViewById(R.id.ll);
        win1.setOnTouchListener(this);
    }

    public boolean onTouch(View view, MotionEvent event)
    {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                fromPosition = event.getX();
                break;
            case MotionEvent.ACTION_UP:
                float toPosition = event.getX();
                if (fromPosition > toPosition)
                {
                    //Слайдинг вправо
                    Intent intent = new Intent(this, notifications.class);
                    finish();
                    overridePendingTransition(R.anim.go_next_in, R.anim.go_next_out);
                    startActivity(intent);
                }
                else if (fromPosition < toPosition)
                {
                    //Слайдинг вправо
                    Intent intent2 = new Intent(this, ActivityStatement.class);
                    finish();
                    overridePendingTransition(R.anim.go_prev_in, R.anim.go_prev_out);
                    startActivity(intent2);
                }
            default:
                break;
        }
        return true;
    }
}
