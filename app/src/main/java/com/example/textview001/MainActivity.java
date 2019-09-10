package com.example.textview001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //通过id找到TextView控件对象
        TextView item_tv;
        item_tv = findViewById(R.id.helloTextView);
        item_tv.setText("我的一人世界");
        //通过资源id获得字符串对象
        item_tv.setText(this.getText(R.string.hello_world));
        //通过资源名称获取字符串
        Context context=this.getApplicationContext();
        String resName="hello_world";
        int helloWorldID=context.getResources().getIdentifier(resName, "string", context.getPackageName());
        item_tv.setText(this.getString(helloWorldID));

    }
}
