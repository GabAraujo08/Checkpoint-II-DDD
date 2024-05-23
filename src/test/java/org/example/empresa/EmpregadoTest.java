package org.example.empresa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {
   @Test
    void quando_getPagamento_chamado_retorna_pagamento(){
        Empregado empregado = new Empregado();
        Assertions.assertEquals(0.0, empregado.getPagamento());
    }


}