package com.angelo.certifacation_nlw.core.service;

import com.angelo.certifacation_nlw.core.dto.VerificacaoCertificadoDTO;
import org.springframework.stereotype.Service;

@Service
public class VerificacaoCertificaoService {
    public boolean execute(VerificacaoCertificadoDTO verificacaoCertificadoDTO) {
        if(verificacaoCertificadoDTO.email().equals("ronicley@angelo.com") && verificacaoCertificadoDTO.tecnologia().equals("java")) {
            return true;
        }
        return false;
    }
}
