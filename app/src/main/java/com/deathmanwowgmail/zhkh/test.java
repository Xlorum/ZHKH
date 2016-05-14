package com.deathmanwowgmail.zhkh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class test extends AppCompatActivity {

    private Socket client;
    private PrintWriter printwriter;
    private EditText textField;
    private Button button;
    private String messsage;
    String ip="25.109.103.63";
    int port=8087;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);
        textField = (EditText) findViewById(R.id.textout);
        button = (Button) findViewById(R.id.send);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                messsage = textField.getText().toString();
                Socket client = null;
                textField.setText("");
                DataOutputStream dataOutputStream = null;
                DataInputStream dataInputStream = null;

                try {

                    client = new Socket("25.109.103.63", 8087);
                    client.setSoTimeout(100);
                    dataOutputStream = new DataOutputStream(client.getOutputStream());
                    dataInputStream = new DataInputStream(client.getInputStream());
                    dataOutputStream.writeUTF(messsage);

                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    System.out.println("Got an IOException: " + e.getMessage());
                }
            }
        });
    }
}
