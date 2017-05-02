package main.controllers;

import main.model.entity.User;
import main.services.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Olesya on 27.04.2017.
 */
@Controller
@SessionAttributes("login")

public class HelloController {
    private static final Logger LOGGER = Logger.getLogger(StudentServlet.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello() {
        LOGGER.debug("LOGINNNN");
        return "login";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView login(@RequestParam(value = "login", required = true) String login,
                              @RequestParam(value = "password", required = true) String password) {
        ModelAndView mav = new ModelAndView();
        User user = null;
//        if ((user = userService.auth(login, password)) != null) {
//            mav.addObject("login", login);
//            LOGGER.debug("login: " + login);
            mav.setViewName("redirect:list");
//        }else{
//            mav.setViewName("redirect:/");
//        }
        return mav;
    }

}
