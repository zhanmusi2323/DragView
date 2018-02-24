package com.example.draggridview;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.framework.DragView;

public class SecondActivity extends Activity {
    private DragView vTestView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        intiView();
    }

    private void intiView() {
        vTestView = (DragView) findViewById(R.id.testView);
        vTestView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("TAG","5555555555555555555");
            }
        });
        vTestView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.e("TAG","66666666666666666");
                return false;
            }
        });
    }
}
