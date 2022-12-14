package com.stguigu.java1;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * @author shkstart
 * @create 2022-12-14 20:50
 */
@Inherited
@Repeatable(MyAnnotations.class)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE,TYPE_PARAMETER,TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "hi";
}
