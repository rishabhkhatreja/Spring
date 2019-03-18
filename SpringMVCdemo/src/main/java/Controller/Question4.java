/*
Use annotation in StudentController to define a default action index which renders a jsp page.
 */

package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Question4 {
    @RequestMapping("/")
    @ResponseBody
    String index()
    {
        return "For Question1 : /Question1 "+"<br>"+"For Question2 : /question2/dummy and /question2/dummy2"
                +"<br>"+"For Question3 : /dummy/demoAction"+"<br>"+ "For Question4 : It is just the first page"+
                "<br>"+ "For Question5 : /Home/Index"+"<br>"+ "For Question6 : /Demo/FirstName/rishabh/LastName/khatreja"
                +"<br>"+ "For Question7 : /Question7/countryAndState/India/Delhi"+"<br>"+ "For Question8 : /dummy/Test"
                +"<br>"+ "For Question9 : /Question9/UserRegistration"+"<br>"+ "For Question10 : /dummy/index";



    }

}
