package com.pm.arch.metadata;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.Mapping;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface WindowTraffic {

    @AliasFor("name")
    String value() default "";

    @AliasFor("value")
    String name() default "";

}
