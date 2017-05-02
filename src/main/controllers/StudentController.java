package main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by admin on 27.04.2017.
 */
@Controller
public class StudentController {

    @RequestMapping(value = "/student/", method = RequestMethod.GET)
    public String showFormAddStudent() {
        return "student";
    }

}
