package br.gov.ba.prodeb.testecase.enums;

import lombok.Getter;

@Getter
public enum TestSuggestionType {

    VALIDATION_ACCESS("Validação de Acesso"),
    BUSSINESS_RULE("Regra de Negócio"),
    FUNCTIONALITY("Funcionalidade"),
    INTEGRATION("Integração"),
    VALIDATION("Validação"),
    COMPATIBILITY("Compatibilidade"),
    COMPLETO_FUNCTIONALITY("Funcionalidade Completa");

    private final String description;

    TestSuggestionType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }

}
