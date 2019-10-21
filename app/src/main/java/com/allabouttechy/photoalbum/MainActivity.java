package com.allabouttechy.photoalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    int[] image={R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4};
    int currentImage=0;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=(Button) findViewById(R.id.btn1);
        b2=(Button) findViewById(R.id.btn2);
        imageView =(ImageView) findViewById(R.id.img1);
        imageView.setImageResource(image[currentImage]);
        b1.setOnClickListener(clickOnPrevious);
        b2.setOnClickListener(clickOnNext);
    }

    View.OnClickListener clickOnNext =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            currentImage++;
            currentImage = currentImage % image.length;
            imageView.setImageResource(image[currentImage]);

        }
    };

    View.OnClickListener clickOnPrevious = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            currentImage--;
            if(currentImage<0){
                currentImage=3;
            }
            currentImage = currentImage % image.length;
            imageView.setImageResource(image[currentImage]);
        }
    };

}
