package com.pm.arch.config;

import com.pm.arch.metadata.WindowTraffic;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.mvc.condition.RequestCondition;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import java.lang.reflect.Method;

public class WindowTrafficRequestMappingHandlerMapping extends RequestMappingHandlerMapping {

    @Override
    protected RequestCondition<?> getCustomTypeCondition(@NonNull Class<?> handlerType) {
        WindowTraffic windowTraffic = AnnotationUtils.findAnnotation(handlerType, WindowTraffic.class);
        return null == windowTraffic ? super.getCustomTypeCondition(handlerType) : new WindowTrafficCondition(windowTraffic.value());
    }


    @Override
    protected RequestCondition<?> getCustomMethodCondition(@NonNull Method method) {
        WindowTraffic windowTraffic = AnnotationUtils.findAnnotation(method, WindowTraffic.class);
        return null == windowTraffic ? super.getCustomMethodCondition(method) : new WindowTrafficCondition(windowTraffic.value());
    }

}
