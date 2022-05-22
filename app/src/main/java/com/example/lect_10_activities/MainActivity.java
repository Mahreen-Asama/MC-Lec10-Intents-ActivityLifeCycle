package com.example.lect_10_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnCall,btnWebPage,btnSeocndActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("A1", " onCreate Activity Main");

        btnCall=findViewById(R.id.btn_call);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("tel:+923001234567");
                Intent intent=new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });

        btnWebPage=findViewById(R.id.btn_web);

        btnSeocndActivity=findViewById(R.id.btn_a2);
        /*btnSeocndActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                throw new IllegalStateException("Unexpected value: " + view.getId());
                Intent intent=new Intent(this,MainActivity2.class);
                startActivity(intent);
            }
        });*/
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("A1", "onStart Activity Main");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("A1", "onResume Activity Main");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("A1", "onPause Activity Main");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("A1", "onStop Activity Main");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("A1", "onDestroy Activity Main");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("A1", "onRestart Activity Main");
    }



    // other on click functions of different buttons
    public void ComposeEmail(View view) {
        Intent intent=new Intent(Intent.ACTION_SENDTO);
        //intent.setType("*/*");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, "sharmeensheri2001@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Hello");
        intent.putExtra(Intent.EXTRA_TEXT, "THIS IS TEXT");
        if (intent.resolveActivity(getPackageManager()) != null){
                startActivity(intent);
        }
    }
    public void f2(View view) {
        Log.d("t1","msg");
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void openWebPage(View view) {
        String url="https://www.google.com";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        //throw new IllegalStateException("Unexpected value: " + view.getId());
       /* Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);*/
    }
}