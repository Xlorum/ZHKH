package com.deathmanwowgmail.zhkh;

//import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;


public class notifications extends AppCompatActivity implements View.OnTouchListener {
    //Объявление переменных
    private float fromPosition;
    private LinearLayout win2;


    //Создание Activity
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);


        win2 = (LinearLayout) findViewById(R.id.main_layout);
        win2.setOnTouchListener(this);

        for(int i=0; i<10; i++){
            chanel_layout frame = new chanel_layout(getApplicationContext());

            frame.setNewsTitle("sdfdf");
            frame.setNewsContent("Content");
            win2.addView(frame);
        }
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
                            //Слайдинг влево
                            Intent intent1 = new Intent(this, ActivityStatement.class);
                            finish();
                            startActivity(intent1);

                        }
                        else if (fromPosition < toPosition)
                        {
                            //Слайдинг вправо
                            Intent intent3 = new Intent(this, ActivityInfo.class);
                            finish();
                            startActivity(intent3);
                        }
                    default:
                        break;
                }
        return true;
    }


}
