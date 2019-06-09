package com.hugang.base.eums;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;


public enum LogOperationTypeEum {


    ADD(1,"新增"),
    UPDATE(2,"修改"),
    DELETE(3,"删除");

    private Integer operationtype;
    private String operationName;

    LogOperationTypeEum(Integer operationtype, String operationName) {
        this.operationtype = operationtype;
        this.operationName = operationName;
    }

    public static String getMessage(int operateCode){
        LogOperationTypeEum[] values = LogOperationTypeEum.values();
        for (LogOperationTypeEum logOperateTypeEnum : values) {
            if (logOperateTypeEnum.operationtype.equals(operateCode)){
                return logOperateTypeEnum.operationName;
            }
        }
        return null;
    }

    public Integer getOperationtype() {
        return operationtype;
    }

    public void setOperationtype(Integer operationtype) {
        this.operationtype = operationtype;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }
}
