package com.example.elimamis.gorder;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

/**
 * Created by elimamis on 22/06/2015.
 */
public class MenuListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);

        DisplayMetrics displayMetrics= new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        getWindow().setLayout((int) (displayMetrics.widthPixels * 0.9), (int) (displayMetrics.heightPixels * 0.7));



    }


}
