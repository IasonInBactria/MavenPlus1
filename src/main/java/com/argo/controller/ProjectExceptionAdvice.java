package com.argo.controller;


import com.argo.exception.BussinessException;
import com.argo.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员
        System.out.println("发生异常！");
        return new Result(e.getExceptionCode(), null, "系统异常！");
    }

    @ExceptionHandler(BussinessException.class)
    public Result doBusinessException(BussinessException e){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员
        System.out.println("发生异常！");
        return new Result(e.getExceptionCode(), null, "发生业务异常！");
    }
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        System.out.println("发生异常！");
        return new Result(666, null, "发生异常！");
    }
}
