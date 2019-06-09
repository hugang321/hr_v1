package com.hugang.base.annotation;

import com.hugang.base.eums.LogOperationTypeEum;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAnnotation {


    /**
     * 操作类型(enum):添加,删除,修改
     */
    LogOperationTypeEum operationType() ;

    //操作内容(content)
    String operateContent();
}
