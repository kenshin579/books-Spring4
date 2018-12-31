package sample.customer.web.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import sample.customer.biz.service.DataNotFoundException;

@Component
@ControllerAdvice("sample.customer.web.controller")
public class CustomerControllerAdvice {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class,
                new StringTrimmerEditor(true));
    }

    @ExceptionHandler(DataNotFoundException.class)
    public String handleException() {
        return "customer/notfound";
    }

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        e.printStackTrace();

        return "error";
    }

//    @ExceptionHandler(RuntimeException.class)
//    public String handleException(RuntimeException e) {
//        e.printStackTrace();
//
//        return "error/runtime";
//    }
}
