package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloProjetoFinal {
    @GetMapping("/{nome}")
    public String ola(@PathVariable("nome") String nome, Model model) {
        model.addAttribute("nome", nome);
        return "index";
    }
}
