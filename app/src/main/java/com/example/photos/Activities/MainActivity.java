package com.example.photos.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;

import com.example.photos.Adapters.FragmentAdapter;
import com.example.photos.R;

public class MainActivity extends AppCompatActivity {

    String TAG = "MainActivity";
    ViewPager2 viewPager2;
    FragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* viewPager2 = findViewById(R.id.frame);
        adapter = new FragmentAdapter(getSupportFragmentManager(),getLifecycle());
        Log.d(TAG, "onCreate: AdapterSet");
        viewPager2.setAdapter(adapter);
*/
    }
}