package br.gov.ba.prodeb.testecase.enums;

import lombok.Getter;

@Getter
public enum TestSuggestionTypeEnum {

    ACCESS_VALIDATION("Validação de Acesso"),
    BUSSINESS_RULE("Regra de Negócio"),
    FUNCTIONALITY("Funcionalidade"),
    INTEGRATION("Integração"),
    VALIDATION("Validação"),
    COMPATIBILITY("Compatibilidade"),
    COMPLETE_FUNCTIONALITY("Funcionalidade Completa");

    private final String description;

    TestSuggestionTypeEnum(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }

}
