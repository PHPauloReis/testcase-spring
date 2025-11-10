package br.gov.ba.prodeb.testecase.model;

import br.gov.ba.prodeb.testecase.enums.Classification;
import br.gov.ba.prodeb.testecase.enums.TestSuggestionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestSuggestion {

    private String suggestion;
    private TestSuggestionType type;
    private String description;
    private List<String> steps;
    private Classification classification;
    private String icon;

}
