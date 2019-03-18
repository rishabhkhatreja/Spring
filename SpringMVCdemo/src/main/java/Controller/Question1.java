/*
Implement AbstractController in Question1. create a mapping index.html for it and render index.jsp
view from it which displays messages "Hello from index.gsp"
 */


package Controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Question1 extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("rishabh");
        ModelAndView modelAndView=new ModelAndView("Student");
        return modelAndView;
    }
}
