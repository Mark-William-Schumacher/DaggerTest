package com.markshoe.testproject;

import android.util.Log;

import com.markshoe.testproject.DependancyObjects.A1;
import com.markshoe.testproject.DependancyObjects.A3;
import com.markshoe.testproject.DependancyObjects.B1;

import javax.inject.Inject;

/**
 * Created by shoe on 16-04-19.
 */
public class A3_A1_B1_Class {

    private static final String TAG = "A3_A1_B1_Class";
    
    @Inject
    public A3_A1_B1_Class(A3 a3, A1 a1, B1 b1){
        Log.d(TAG, "A3_A1_B1_Class() called with: " + "a3 = [" + a3 + "], a1 = [" + a1 + "], b1 = [" + b1 + "]");
    }
}
