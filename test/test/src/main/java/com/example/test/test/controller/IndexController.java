package com.example.test.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test.test.model.Person;

@Controller
@RequestMapping("/")
public class IndexController {
    
    @GetMapping("/")
    public String index(Model model){

        List<Person> persons = new ArrayList<>();
        persons.add(Person.builder().firstname("Rosel").lastname("Racoma").build());
        persons.add(new Person("Miguel", "Arante"));

        model.addAttribute("persons", persons);
        return "index.html";
    }
}
