package com.auto.autoslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageSlider imageSlider;


        imageSlider =findViewById(R.id.img_slid);

        ArrayList<SlideModel> imageList = new ArrayList<>();


        imageList.add(new SlideModel(R.drawable.one, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.three,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.three,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.four,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.five,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.six,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.seven,ScaleTypes.CENTER_CROP));

        imageSlider.setImageList(imageList);
    }
}