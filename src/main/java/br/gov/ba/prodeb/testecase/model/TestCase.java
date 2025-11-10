package br.gov.ba.prodeb.testecase.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestCase {

    private String preCondition;
    private List<String> testSteps;
    private String expectedResult;

}
