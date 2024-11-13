package com.example.demopermise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String inicio() {
        return "index"; // Carga la vista "index.html" de la carpeta "templates"
    }

    @GetMapping("/register")
    public String register(){
        return "register"; // Carga la vista "register.html" de la carpeta "templates"
    }

    @GetMapping("/home")
    public String home(){
        return "home"; // Carga la vista "index.html" de la carpeta "templates"
    }

    @GetMapping("/login")
    public String login(){
        return "login"; // Carga la vista "login.html" de la carpeta "templates"
    }

    @GetMapping("/marketing")
    public String marketing() {
        return "marketing"; // Carga la vista "marketing.html" de la carpeta "templates"
    }

    @GetMapping("/ventas")
    public String ventas() {
        return "ventas"; // Carga la vista "ventas.html" de la carpeta "templates"
    }

    @GetMapping("/usuarios")
    public String usuarios() {
        return "usuarios"; // Carga la vista "usuarios.html" de la carpeta "templates"
    }

    @GetMapping("/help")
    public String help() {
        return "help"; // Carga la vista "help.html" de la carpeta "templates"
    }

}
