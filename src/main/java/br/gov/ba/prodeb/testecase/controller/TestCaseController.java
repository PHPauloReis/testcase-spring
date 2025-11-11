package br.gov.ba.prodeb.testecase.controller;

import br.gov.ba.prodeb.testecase.service.TestCaseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testecase")
public class TestCaseController {

    TestCaseService testCaseService;

    public TestCaseController(TestCaseService testCaseService) {
        this.testCaseService = testCaseService;
    }

    @GetMapping
    public String listAllTestCases(Model model) {
        model.addAttribute("testCase", testCaseService.getAllTestCases());

        return "testecase/view";
    }

    @GetMapping("/1")
    public String viewTestCase(Model model) {
        model.addAttribute("testCase", testCaseService.getFirstTestCase());

        return "testecase/view";
    }

}
