package com.example.swap_function;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.ScaleGestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener//flinging and scrolling,
GestureDetector.OnDoubleTapListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
