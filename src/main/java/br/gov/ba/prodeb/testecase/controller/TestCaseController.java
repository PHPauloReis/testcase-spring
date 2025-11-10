package br.gov.ba.prodeb.testecase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testecase")
public class TestCaseController {

    @GetMapping
    public String visualizarCasoDeTest() {
        return "testecase/view";
    }

}
