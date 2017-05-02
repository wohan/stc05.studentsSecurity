package main.controllers;

import main.services.StudentService;
import main.util.InterceptorUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.interceptor.Interceptors;

/**
 * Created by Olesya on 27.04.2017.
 */
@Controller
@RequestMapping(value = "/list")
//@Interceptors(InterceptorUser studentService)

public class ListController {


    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public String showList(Model model) {
        model.addAttribute("list", studentService.getAllStudents());
        return "list";
    }
}
