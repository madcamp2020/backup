package com.example.madcamp2020;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DrawBigImage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.draw_big_image);

        Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        int width = (int) (display.getWidth()*2);
        int height = (int) (display.getHeight()*2);
        getWindow().getAttributes().width = width;
        getWindow().getAttributes().height = height;

        Intent intent = getIntent();
        ImageView imageView = (ImageView) findViewById(R.id.big_image);

        String path = intent.getStringExtra("path");
        imageView.setImageURI(Uri.parse(path));
        Glide.with(this).load(path).placeholder(R.drawable.ic_launcher_foreground).into(imageView);
    }
}
