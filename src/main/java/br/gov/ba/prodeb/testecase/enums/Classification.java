package br.gov.ba.prodeb.testecase.enums;

import lombok.Getter;

@Getter
public enum Classification {

    AUTENTICATION_TEST("Teste de Autenticação"),
    BUSSINESS_RULE_TEST("Teste de Regra de Negócio"),
    FUNCIONAL_TEST("Teste Funcional"),
    INTEGRATION_TEST("Teste de Integração"),
    UX_TEST("Teste de UX"),
    COMPATIBILITY_TEST("Teste de Compatibilidade"),
    FULL_FLOW_TEST("Teste de Fluxo Completo");

    private final String description;

    Classification(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }

}
