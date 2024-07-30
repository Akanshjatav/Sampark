package com.Akansh.Sampark.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

@RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView home(){
    ModelAndView model = new ModelAndView();
    model.setViewName("Home");
    return model;
}






}
