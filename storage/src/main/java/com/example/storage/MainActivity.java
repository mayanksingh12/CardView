package com.example.storage;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6;
    EditText edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      bt1=findViewById(R.id.button);
        bt2=findViewById(R.id.button2);
        bt3=findViewById(R.id.button3);
        bt4=findViewById(R.id.button4);
        bt5=findViewById(R.id.button5);
        bt6=findViewById(R.id.button6);
        edt1=findViewById(R.id.editText);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File file=getCacheDir();
                File datafile=new File(file,"cache.txt");
                write(datafile);


            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }

    private void write(File datafile) {

        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream(datafile);
            fileOutputStream.write(edt1.getText().toString().getBytes());
            Toast.makeText(this, datafile.getAbsolutePath(), Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileOutputStream!=null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
