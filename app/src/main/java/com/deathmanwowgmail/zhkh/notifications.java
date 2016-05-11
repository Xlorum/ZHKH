package com.deathmanwowgmail.zhkh;

//import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;

public class notifications extends AppCompatActivity implements OnTouchListener
{
    //Объявление переменных
    private float fromPosition;

    //Создание Activity
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.main_layout);
        mainLayout.setOnTouchListener(this);


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

                    Intent intent = new Intent(this, ActivityStatement.class);
                    finish();
                    startActivity(intent);
                }
                else if (fromPosition < toPosition)
                {
                    //Слайдинг вправо
                    Intent intent2 = new Intent(this, ActivityInfo.class);
                    finish();
                    startActivity(intent2);
                }
            default:
                break;
        }
        return true;
    }



}
