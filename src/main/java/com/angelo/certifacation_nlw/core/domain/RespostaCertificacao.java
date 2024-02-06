package com.angelo.certifacation_nlw.core.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespostaCertificacao {
    private UUID id;
    @JsonProperty("ceritificacao_id")
    private UUID certificacaoID;
    @JsonProperty("estudante_id")
    private UUID estudanteID;
    @JsonProperty("questao_id")
    private UUID questaoID;
    @JsonProperty("resposta_id")
    private UUID respostaID;
    private boolean resposta;
}
