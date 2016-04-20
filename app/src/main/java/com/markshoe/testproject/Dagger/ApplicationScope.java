package com.markshoe.testproject.Dagger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by shoe on 16-04-19.
 */
@Retention(RetentionPolicy.RUNTIME)
@Scope
public @interface ApplicationScope {
}