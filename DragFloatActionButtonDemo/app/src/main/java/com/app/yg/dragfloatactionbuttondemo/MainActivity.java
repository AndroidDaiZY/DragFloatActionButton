package com.app.yg.dragfloatactionbuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //和正常图片一样正常使用
    private DragFloatActionButton dragFloatActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dragFloatActionButton= (DragFloatActionButton) findViewById(R.id.move_btn);
        dragFloatActionButton.setImageDrawable(getResources().getDrawable(R.mipmap.ic_launcher));
        dragFloatActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Finished  ,have fun",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
