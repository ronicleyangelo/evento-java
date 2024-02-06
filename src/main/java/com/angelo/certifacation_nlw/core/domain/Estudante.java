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
public class Estudante {
    private UUID id;
    private String email;
    @JsonProperty("certificacao_estudantes")
    private List<CerticacaoEstudante> certicacaoEstudantes;
}
