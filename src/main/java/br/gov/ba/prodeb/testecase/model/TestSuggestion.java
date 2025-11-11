package br.gov.ba.prodeb.testecase.model;

import br.gov.ba.prodeb.testecase.enums.ClassificationEnum;
import br.gov.ba.prodeb.testecase.enums.TestSuggestionTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestSuggestion {

    private String suggestion;
    private TestSuggestionTypeEnum type;
    private String description;
    private List<String> steps;
    private ClassificationEnum classification;
    private String icon;

}
