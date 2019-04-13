package cn.finalteam.rxgalleryfinal.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class CompareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);
        button = (Button)findViewById(R.id.btn_search_pic);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(CompareActivity.this,FlowersActivity.class);
                startActivity(intent);
            }
        });
    }
}
