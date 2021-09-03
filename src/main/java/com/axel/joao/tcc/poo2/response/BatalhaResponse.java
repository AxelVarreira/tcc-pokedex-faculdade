package com.axel.joao.tcc.poo2.response;

/*
* Obejto de retorno do servico de batalha
* */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BatalhaResponse {
    private boolean isVencedor;
    private String nomeAdversario;
}
