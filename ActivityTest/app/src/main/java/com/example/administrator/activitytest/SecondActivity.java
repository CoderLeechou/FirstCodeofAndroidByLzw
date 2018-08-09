package com.example.administrator.activitytest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

    public static void actionStart(Context context, String data1, String data2) {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra("param1", data1);
        intent.putExtra("param2", data2);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Log.d("SecondActivity",this.toString());
        Log.d("SecondActivity","Task id is "+getTaskId());
        setContentView(R.layout.second_layout);
        //接收上一个活动传递的数据
        //Intent intent=getIntent();
        //String data=intent.getStringExtra("extra_data");
        //Log.d("SecondActivity",data);

        Button button2=(Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //返回数据给上一个活动
                //Intent intent=new Intent();
                //intent.putExtra("data_return","Hello FirstActivity!");
                //setResult(RESULT_OK,intent);  //专门用于向上一个活动返回数据
                //finish();

                Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent();
        intent.putExtra("data_return","Hello FirstActivity");
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity","onDestroy");
    }
}
