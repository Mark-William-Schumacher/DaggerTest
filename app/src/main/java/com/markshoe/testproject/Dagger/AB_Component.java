package com.markshoe.testproject.Dagger;

import com.markshoe.testproject.DependancyObjects.A1;
import com.markshoe.testproject.DependancyObjects.A2;
import com.markshoe.testproject.DependancyObjects.A3;
import com.markshoe.testproject.DependancyObjects.B1;
import com.markshoe.testproject.DependancyObjects.B2;
import com.markshoe.testproject.MainActivity;

import dagger.Component;

/**
 * Created by shoe on 16-04-19.
 */
@ApplicationScope
@Component(modules = {AModule.class, BModule.class})
public interface AB_Component {
    void inject(MainActivity activity);
    A1 aldfskjfaslk();
    A2 aldfssadfasdkjfaslk();
    A3 aldfasfd3skjfaslk();
    B1 aldfskasdfasdfjfaslk();
    B2 aldfasfdlasjfldkskjfaslk();
}
