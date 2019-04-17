package cn.finalteam.rxgalleryfinal.sample;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

import cn.finalteam.rxgalleryfinal.RxGalleryFinalApi;

public class CompareActivity extends AppCompatActivity {
    public static Intent newIntent(Context packageContext, String context){
        Intent intent=new Intent(packageContext,CompareActivity.class);
        intent.putExtra("CONTEXT",context);
        return intent;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button = null;
        ImageView search_pic = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);
        button = (Button)findViewById(R.id.btn_search_pic);
        search_pic = (ImageView) findViewById(R.id.search_Image);
 //       TextView text = (TextView)findViewById(R.id.SearchPath);
        String context=getIntent().getStringExtra("CONTEXT");

 //      text.setText("路径"+context);

        File file = new File(""+context);
        Bitmap bitmap = BitmapFactory.decodeFile(""+context);
        search_pic.setImageBitmap(bitmap);
        //search_pic.setImageUri(MainActivity.Image_path);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                int type = (int)(Math.random()*(5-0+1));
                switch (type){
                    case 0:intent.setClass(CompareActivity.this,FlowersActivity.class);break;
                    case 1:intent.setClass(CompareActivity.this,Flowers2Activity.class);break;
                    case 2:intent.setClass(CompareActivity.this,Flowers3Activity.class);break;
                    case 3:intent.setClass(CompareActivity.this,Flowers4Activity.class);break;
                    case 4:intent.setClass(CompareActivity.this,Flowers5Activity.class);break;
                    case 5:intent.setClass(CompareActivity.this,Flowers6Activity.class);break;
                }
                //intent.setClass(CompareActivity.this,Flowers2Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
