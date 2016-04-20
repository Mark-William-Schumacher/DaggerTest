package com.markshoe.testproject.Dagger;

import com.markshoe.testproject.DependancyObjects.B1;
import com.markshoe.testproject.DependancyObjects.B2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by shoe on 16-04-19.
 */

@Module
public class BModule {

    @ApplicationScope
    @Provides
    protected B1 providesB1(){
        return new B1();
    }

    @ApplicationScope
    @Provides
    protected B2 providesB2(){
        return new B2();
    }


}
