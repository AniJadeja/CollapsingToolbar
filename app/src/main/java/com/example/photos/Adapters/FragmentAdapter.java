package com.example.photos.Adapters;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;


import com.example.photos.Fragments.AllPhotos;
import com.example.photos.Fragments.AllVideos;

public class FragmentAdapter extends FragmentStateAdapter {


    private static final String TAG = "FragmentAdapter ";

    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        if (position == 1) {
            Log.d(TAG, "createFragment: AllVideos() returned...");
            return new AllVideos();
        }
        Log.d(TAG, "createFragment: AllPhotos() returned...");
        return new AllPhotos();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
