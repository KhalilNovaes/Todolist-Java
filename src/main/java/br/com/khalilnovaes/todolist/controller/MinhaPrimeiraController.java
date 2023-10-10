package br.com.khalilnovaes.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/primeiraRota")


public class MinhaPrimeiraController {
    
    @GetMapping("/")
    public String primeiraMensagem(){
        return "Funcionou";
    }
}
