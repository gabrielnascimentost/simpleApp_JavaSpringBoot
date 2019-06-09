package dev.spring.boot.simple.config;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * ConfiguracaoSpringMVC
 */

@Controller
public class ConfiguracaoSpringMVC{

    @RequestMapping({"", "/", "index.html"})
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        return mv;
    }


    
}