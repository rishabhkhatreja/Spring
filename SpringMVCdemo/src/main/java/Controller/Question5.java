
/*
Create one more action which sends Model HelloWorld to the jsp file.
 */



package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ResponseBody
@RequestMapping("/Home")
public class Question5 {
    @ResponseBody
    @RequestMapping("/Index")
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("Index");
        modelAndView.addObject("msg", "HelloWorld");
        return modelAndView;
    }
}
