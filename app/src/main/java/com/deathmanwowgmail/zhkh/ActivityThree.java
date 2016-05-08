package com.deathmanwowgmail.zhkh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;

public class ActivityThree extends AppCompatActivity implements OnTouchListener {

    private float fromPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        LinearLayout win2 = (LinearLayout) findViewById(R.id.win2);
        win2.setOnTouchListener(this);
    }

    //Слайдинг при косании
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
                    startActivity(intent);
                }
                else if (fromPosition < toPosition)
                {
                    //Слайдинг вправо
                    Intent intent2 = new Intent(this, ActivityTwo.class);
                    finish();
                    startActivity(intent2);
                }
            default:
                break;
        }
        return true;
    }
}
