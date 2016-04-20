package com.markshoe.testproject.Dagger;

import com.markshoe.testproject.DependancyObjects.A1;
import com.markshoe.testproject.DependancyObjects.A2;
import com.markshoe.testproject.DependancyObjects.A3;

import dagger.Module;
import dagger.Provides;

/**
 * Created by shoe on 16-04-19.
 */

@Module
public class AModule {

    @ApplicationScope
    @Provides
    protected A1 providesA1(){
        return new A1();
    }

    @ApplicationScope
    @Provides
         protected A2 providesA2(){
        return new A2();
    }

    @ApplicationScope
    @Provides
    protected A3 providesA3(){
        return new A3();
    }

}
