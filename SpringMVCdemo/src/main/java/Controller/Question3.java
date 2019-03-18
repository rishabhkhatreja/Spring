/*
Create one more annotation based action
hello inside the StudentController which and use @ResponseBody annotation from it to display Hello world.
 */



package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dummy")
public class Question3 {


        @ResponseBody
        @RequestMapping("/demoAction")
        String demoAction() {
            return "HELLO WORLD";
        }
}
