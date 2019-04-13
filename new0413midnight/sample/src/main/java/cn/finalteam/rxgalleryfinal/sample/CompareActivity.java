package cn.finalteam.rxgalleryfinal.sample;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;

import cn.finalteam.rxgalleryfinal.RxGalleryFinalApi;

public class CompareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button = null;
        ImageView search_pic = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);
        button = (Button)findViewById(R.id.btn_search_pic);
        search_pic = (ImageView) findViewById(R.id.search_Image);
        Bitmap bitmap = BitmapFactory.decodeFile(RxGalleryFinalApi.getModelPath());
        search_pic.setImageBitmap(bitmap);
        //search_pic.setImageUri(Uri.fromFile(RxGalleryFinalApi.cropImagePath));
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
