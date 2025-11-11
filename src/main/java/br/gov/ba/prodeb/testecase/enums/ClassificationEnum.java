package br.gov.ba.prodeb.testecase.enums;

import lombok.Getter;

@Getter
public enum ClassificationEnum {

    AUTHENTICATION_TEST("Teste de Autenticação", "#1d4ed8"),
    BUSSINESS_RULE_TEST("Teste de Regra de Negócio", "#ffedd5"),
    FUNCIONAL_TEST("Teste Funcional", "#f3e8ff"),
    INTEGRATION_TEST("Teste de Integração", "#dcfce7"),
    UX_TEST("Teste de UX", "#fce7f3"),
    COMPATIBILITY_TEST("Teste de Compatibilidade", "#e0e7ff"),
    FULL_FLOW_TEST("Teste de Fluxo Completo", "#fee2e2");

    private final String description;
    private final String color;

    ClassificationEnum(String description, String color) {
        this.description = description;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.description;
    }

}
