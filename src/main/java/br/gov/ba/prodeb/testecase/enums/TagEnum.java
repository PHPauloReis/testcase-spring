package br.gov.ba.prodeb.testecase.enums;

import lombok.Getter;

@Getter
public enum TagEnum {
    TC_AGD_001("TC-AGD-001", "blue"),
    FUNCIONAL("FUNCIONAL", "green"),
    AGENDAMENTO("AGENDAMENTO", "purple"),
    PORTAL("PORTAL", "orange");

    private final String description;
    private final String color;

    TagEnum(String description, String color) {
        this.description = description;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.description;
    }

}
