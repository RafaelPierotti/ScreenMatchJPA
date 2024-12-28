package br.com.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {

    public static String obterTraducao(String texto){
        OpenAiService service = new OpenAiService("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");

        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7) // modificação que vai ter de uma tradução a outra
                .build();

        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}
