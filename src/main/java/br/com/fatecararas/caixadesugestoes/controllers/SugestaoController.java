package br.com.fatecararas.caixadesugestoes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fatecararas.caixadesugestoes.model.Sugestao;

@RequestMapping("/sugestoes")
@Controller
public class SugestaoController {

    @GetMapping("/adicionar")
    public String adicionar(Sugestao sugestao) {
        return "/sugestoes/adicionar";
    }
}
