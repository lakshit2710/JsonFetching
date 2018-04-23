package com.example.lakshit.jsonfetching;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn;
public static TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      btn=findViewById(R.id.button);
      tv=findViewById(R.id.textView);
      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
         fetchData process =new fetchData();
         process.execute();
          }
      });
    }
}
