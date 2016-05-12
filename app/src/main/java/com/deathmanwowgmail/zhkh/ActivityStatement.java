package com.deathmanwowgmail.zhkh;

import android.app.LauncherActivity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ActivityStatement extends AppCompatActivity implements OnTouchListener, View.OnClickListener {

    //Объявление переменных
    private float fromPosition;
    private static final int NOTIFY_ID = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statement);

        LinearLayout win1 = (LinearLayout) findViewById(R.id.win1);
        win1.setOnTouchListener(this);

        Button btnStart = (Button) findViewById(R.id.play);
        Button btnStop = (Button) findViewById(R.id.stop);

        //Запуск службы
        btnStart.setOnClickListener(this);
        btnStop.setOnClickListener(this);

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
                    Intent intent = new Intent(this, ActivityInfo.class);
                    finish();
                    startActivity(intent);
                }
                else if (fromPosition < toPosition)
                {
                    //Слайдинг вправо
                    Intent intent2 = new Intent(this, notifications.class);
                    finish();
                    startActivity(intent2);
                }
            default:
                break;
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.play:
                startService(new Intent(this, MyService.class));
                break;
            case R.id.stop:
            stopService(new Intent(this, MyService.class));
        break;
        }
    }
}
