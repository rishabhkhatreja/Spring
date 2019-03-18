package Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.ref.Reference;

@Controller
@RequestMapping("/Demo")
public class Question6 {
    @RequestMapping("/FirstName/{FirstName}/LastName/{LastName}")
    @ResponseBody
    String returnCountryAndState(@PathVariable String FirstName,@PathVariable String LastName) {
        return "FirstName ="+FirstName+"LastName ="+LastName;
    }

}
