package ru.itpark.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.app.forms.QueryForm;
import ru.itpark.app.services.QueryService;

@Controller
public class MainController {
    @Autowired
    private QueryService queryService;

    @GetMapping("/main")
    public String getSignUpPage() {
        return "main";
    }

    @PostMapping("/main")
    public String submit(@ModelAttribute QueryForm queryForm, @ModelAttribute("model")ModelMap model) {
       model.put("species", queryService.sendQuery(queryForm));
       return "result";
    }
}