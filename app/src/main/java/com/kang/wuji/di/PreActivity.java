package com.kang.wuji.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author created by kangren on 2018/6/14 17:33
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PreActivity {
}
