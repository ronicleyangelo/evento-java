package com.angelo.certifacation_nlw.core.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CerticacaoEstudante {
    private UUID id;
    @JsonProperty("estudante_id")
    private UUID estudanteID;
    private String tecnologia;
    private int nota;
    @JsonProperty("reposta_certificacao")
    private List<RespostaCertificacao> respostaCertificacaos;

}
