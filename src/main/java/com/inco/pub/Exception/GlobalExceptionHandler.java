package com.inco.pub.Exception;

import com.inco.pub.entity.ResultT;
import com.inco.pub.entity.StatusEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.xml.transform.Result;
import java.util.logging.Logger;

@ControllerAdvice
public class GlobalExceptionHandler {




    /**
     * 处理空指针的异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =NullPointerException.class)
    @ResponseBody
    public ResultT exceptionHandler(HttpServletRequest req, NullPointerException e){
        System.out.println("cccccccccccccxxxxxxxxx");
        return ResultT.error(StatusEnum.INTERNAL_SERVER_ERROR,null);
    }


    /**
     * 处理其他异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public ResultT exceptionHandler(HttpServletRequest req, Exception e){

        return ResultT.error(StatusEnum.OTHER_ERROR,null);
    }

}
