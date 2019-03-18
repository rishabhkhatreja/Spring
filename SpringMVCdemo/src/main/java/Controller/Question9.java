package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/Question9")
public class Question9 {

    @ModelAttribute
    void addingObject(Model model){
        model.addAttribute("heading","This is spring mvc");
    }

    @RequestMapping(value = "/UserRegistration", method = RequestMethod.GET)
    ModelAndView userRegistration() {
        ModelAndView modelAndView = new ModelAndView("UserRegistration");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @RequestMapping(value = "/submitForm", method = RequestMethod.POST)
    ModelAndView submitForm(@ModelAttribute("user") User user) {
        ModelAndView modelAndView = new ModelAndView("UserDetails");
        modelAndView.addObject("firstName",user.getFirstName());
        modelAndView.addObject("lastName",user.getLastName());
        return modelAndView;
    }
}
