package com.dl.expandlistview.Helper;

import android.support.v4.app.FragmentManager;

import com.dl.expandlistview.Interface.NavigationManager;
import com.dl.expandlistview.MainActivity;

public class FragmentNavigationManager implements NavigationManager {
    private static FragmentNavigationManager mInstance;
    private FragmentManager mfragmentManager;
    private MainActivity mainActivity;
    public static FragmentNavigationManager getmInstance(MainActivity mainActivity){
        if(mInstance == null)
            mInstance = new FragmentNavigationManager();
        mInstance.configure(mainActivity);
        return mInstance;
    }
    private void configure(MainActivity mainActivity){
        mainActivity = mainActivity;
        mfragmentManager = mainActivity.getSupportFragmentManager();

    }
    @Override
    public void showFragment(String title) {

    }
}
