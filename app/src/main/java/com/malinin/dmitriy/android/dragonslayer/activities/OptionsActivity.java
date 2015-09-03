package com.malinin.dmitriy.android.dragonslayer.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.malinin.dmitriy.android.dragonslayer.R;

/**
 * Created by malinin-d on 31.08.2015.
 */
public class OptionsActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_layout);
    }

    // TODO: 01.09.2015 разобраться с intent (плодятся куча actvities), нужно чтобы при переходе на следующее предыдущее закрывалось
    public void onBack(View view)
    {
        onBackPressed();
    }

    public void onAbout(View view)
    {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    public void onPlayer(View view)
    {
        Intent intent = new Intent(this,PlayerActivity.class);
        startActivity(intent);
    }
}
