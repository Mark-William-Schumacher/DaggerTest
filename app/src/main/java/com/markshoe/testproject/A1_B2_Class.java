package com.markshoe.testproject;

import android.util.Log;

import com.markshoe.testproject.DependancyObjects.A1;
import com.markshoe.testproject.DependancyObjects.B2;

import javax.inject.Inject;

/**
 * Created by shoe on 16-04-19.
 */
public class A1_B2_Class {
    private static final String TAG = "A1_B2_Class";

    @Inject A3_A1_B1_Class a3_a1_b1_class;

    @Inject
    public A1_B2_Class(A1 a1, B2 b2){
        Log.d(TAG, "A1_B2_Class() called with: " + "a1 = [" + a1 + "], b2 = [" + b2 + "]");
    }

}
