package com.smallbn.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.smallbn.web.comm.JsonResult;

import javax.servlet.http.HttpServletRequest;

@Controller
public abstract class CtlBase
{
    protected HttpServletRequest getRequest()
    {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    protected JsonResult rspExc(String msg)
    {
        JsonResult result = new JsonResult();
        result.setCode(HttpStatus.BAD_REQUEST);
        result.setMessage(msg);
        return result;
    }

    protected JsonResult rspError(HttpStatus status, String msg)
    {
        JsonResult result = new JsonResult();
        result.setCode(status);
        result.setMessage(msg);
        return result;
    }

    protected JsonResult rspSuccess(Object obj)
    {
        JsonResult result = new JsonResult();
        result.setCode(HttpStatus.OK);
        result.setData(obj);
        return result;
    }

    protected JsonResult rspSuccess()
    {
        JsonResult result = new JsonResult();
        result.setCode(HttpStatus.OK);
        result.setMessage("操作成功");
        return result;
    }
}
