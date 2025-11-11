package br.gov.ba.prodeb.testecase.model;

import br.gov.ba.prodeb.testecase.enums.TagEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestCase {

    private String title;
    private String preCondition;
    private List<String> testSteps;
    private String expectedResult;
    private List<TestSuggestion> testSuggestions;
    private User author;
    private Date createdAt;
    private Date updatedAt;
    private List<TagEnum> tags;

}
