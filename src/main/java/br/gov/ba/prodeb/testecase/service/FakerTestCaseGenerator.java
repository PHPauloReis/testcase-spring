package br.gov.ba.prodeb.testecase.service;

import br.gov.ba.prodeb.testecase.enums.ClassificationEnum;
import br.gov.ba.prodeb.testecase.enums.TagEnum;
import br.gov.ba.prodeb.testecase.enums.TestSuggestionTypeEnum;
import br.gov.ba.prodeb.testecase.model.TestCase;
import br.gov.ba.prodeb.testecase.model.TestSuggestion;
import br.gov.ba.prodeb.testecase.model.User;

import java.util.List;

public class FakerTestCaseGenerator {

    public static TestCase generateTestCase() {
        return TestCase
                .builder()
                .title("Agendamento de serviço")
                .preCondition("O cidadão deve estar logado na plataforma ba.gov.br")
                .testSteps(generateTestSteps())
                .expectedResult("O sistema deve confirmar o agendamento e enviar SMS e E-mail para o cidadão")
                .author(new User("João da Silva", "joaozinho@prodeb.ba.gov.br"))
                .testSuggestions(generateTestSuggestions())
                .tags(generateTags())
                .createdAt(new java.util.Date())
                .updatedAt(new java.util.Date())
                .build();
    }

    public static List<TestSuggestion> generateTestSuggestions() {
        TestSuggestion testSuggestion1 = TestSuggestion
                .builder()
                .suggestion("Agendamento sem Login")
                .type(TestSuggestionTypeEnum.ACCESS_VALIDATION)
                .description("Permitir que o cidadão possa reagendar um serviço já agendado")
                .steps(List.of(
                        "Sistema deve redirecionar para tela de login",
                        "Após login, deve retornar ao fluxo de agendamento",
                        "Dados preenchidos devem ser mantidos"
                ))
                .classification(ClassificationEnum.AUTHENTICATION_TEST)
                .icon("🔄")
                .build();

        TestSuggestion testSuggestion2 = TestSuggestion
                .builder()
                .suggestion("Agendamento sem Login")
                .type(TestSuggestionTypeEnum.ACCESS_VALIDATION)
                .description("Permitir que o cidadão possa reagendar um serviço já agendado")
                .steps(List.of(
                        "Sistema deve redirecionar para tela de login",
                        "Após login, deve retornar ao fluxo de agendamento",
                        "Dados preenchidos devem ser mantidos"
                ))
                .classification(ClassificationEnum.AUTHENTICATION_TEST)
                .icon("🔄")
                .build();

        return List.of(testSuggestion1, testSuggestion2);
    }

    public static List<String> generateTestSteps() {
        return List.of(
                "Acessar portal ba.gov.br e escolher um dos serviços disponíveis",
                "Na tela de \"Solicitar Serviço\", clicar em \"Agendar\"",
                "No modal que será apresentado com o histórico de agendamento do cidadão para aquele serviço, marcar o checkbox com o label \"Li os documentos necessários ao atendimento\" e clicar na opção \"Posto\"",
                "O sistema apresentará a tela com postos disponíveis para agendamento. Escolher o posto e clicar no botão \"Próximo\"",
                "O sistema apresentará a tela com datas disponíveis para agendamento. Escolher a data e clicar no botão \"Próximo\"",
                "O sistema apresentará a tela com horários disponíveis para agendamento. Escolher o horário e clicar no botão \"Próximo\"",
                "O sistema apresentará a tela de confirmação com os dados selecionados pelo cidadão. Clicar em \"Agendar\"",
                "O sistema apresentará um Modal com os dados do agendamento, confirmando o agendamento.",
                "O sistema disparará um E-mail e uma mensagem SMS para o cidadão",
                "Clicar no botão \"Fechar\""
        );
    }

    public static List <TagEnum> generateTags() {
        return List.of(
                TagEnum.TC_AGD_001,
                TagEnum.FUNCIONAL,
                TagEnum.AGENDAMENTO,
                TagEnum.PORTAL
        );
    }

}
