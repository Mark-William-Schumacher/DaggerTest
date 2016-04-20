package com.markshoe.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.markshoe.testproject.Dagger.AB_Component;
import com.markshoe.testproject.Dagger.AModule;
import com.markshoe.testproject.Dagger.BModule;
import com.markshoe.testproject.Dagger.DaggerAB_Component;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject A1_B2_Class a1_b2_class;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerAB_Component
                .builder()
                .aModule(new AModule())
                .bModule(new BModule())
                .build()
                .inject(this);

    }
}
