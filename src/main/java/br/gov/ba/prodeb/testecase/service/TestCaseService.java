package br.gov.ba.prodeb.testecase.service;

import br.gov.ba.prodeb.testecase.model.TestCase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestCaseService {

    List<TestCase> testCases;

    public TestCaseService() {
        TestCase testCase = FakerTestCaseGenerator.generateTestCase();
        testCases = List.of(testCase);
    }

    public List<TestCase> getAllTestCases() {
        return testCases;
    }

    public TestCase getFirstTestCase() {
        return testCases.stream()
                .findFirst()
                .orElse(null);
    }

}
