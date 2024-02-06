package com.angelo.certifacation_nlw.core.controller;

import com.angelo.certifacation_nlw.core.dto.VerificacaoCertificadoDTO;
import com.angelo.certifacation_nlw.core.service.VerificacaoCertificaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/estudante")
public class EstudanteController {
    @Autowired
    VerificacaoCertificaoService verificacaoCertificaoService;
    @RequestMapping(value = "/verificacao-certificado", method = RequestMethod.POST)
    String verificacaoCertificado(@RequestBody VerificacaoCertificadoDTO verificacaoCertificadoDTO) {
        System.out.println(verificacaoCertificadoDTO);
        Boolean result = verificacaoCertificaoService.execute(verificacaoCertificadoDTO);
        if(result) {
            return "usuario pode fazer a prova";
        }else {
            return "usuario não pode fazer a aprova";
        }
    }
}
