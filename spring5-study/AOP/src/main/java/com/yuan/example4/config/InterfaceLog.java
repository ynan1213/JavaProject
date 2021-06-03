package com.epichust.example4.config;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface InterfaceLog
{
    public String code() default "";

    public String name() default "";
}
