package com.stguigu.java1;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * @author shkstart
 * @create 2022-12-14 21:25
 */
@Inherited
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotations {
    MyAnnotation[] value();

}
