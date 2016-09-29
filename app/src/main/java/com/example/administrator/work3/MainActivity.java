package com.example.administrator.work3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv1,tv2;
    private int inum1,inum2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1= (TextView) findViewById(R.id.textView1);
        tv2= (TextView) findViewById(R.id.textView2);
        tv1.setText("2");
        tv2.setText("1");
        inum1=0;
        inum2=0;
        Toast.makeText(this,"onCreate",Toast.LENGTH_LONG);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        tv1.setText("触发onRestart,显示view1");
        tv2.setText("触发onCrestart,显示view2");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        inum1++;
        inum2++;
        outState.putString("tv1","onSaveInstanceState 保存的数值"+inum1);
        outState.putString("tv2",String.valueOf(inum2));
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        tv1.setText(savedInstanceState.getString("tv1"));
        tv2.setText("onSaceInstanceState保存的数值为"+savedInstanceState.getString("tv2"));
        inum2=Integer.parseInt(savedInstanceState.getString("tv2"));

    }
}


