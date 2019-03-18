package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dummy")
public class Question8
{

        @RequestMapping(value = "/Test", method = RequestMethod.GET)
        ModelAndView index() {
            ModelAndView modelAndView = new ModelAndView("Test");
            return modelAndView;
        }

        @RequestMapping(value = "/Dummy", method = RequestMethod.POST)
        @ResponseBody
        String submitForm(@RequestParam("firstname") String firstname,
                          @RequestParam("lastname") String lastname) {
            return "Firstname " + firstname + " Lastname " + lastname;
        }
}
