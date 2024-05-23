package org.example.empresa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssalariadoTest {
    @Test
    void quando_salario_1000_e_diasTrabalhados_10_retorna_100(){
        Assalariado assalariado = new Assalariado(1000.00);
        assalariado.setDiasTrabalhados(10);
        Assertions.assertEquals(100, assalariado.getPagamento());
    }


    @Test
    void quando_construtor_construido_salario_diferente_null(){
        Assalariado assalariado = new Assalariado(1300.00);
        Assertions.assertNotNull(assalariado.getSalario());
    }
    @Test
    void quando_diasTrabalhados_menor_que_0_retorna_exception(){
        Assalariado assalariado = new Assalariado(1300.00);
        Assertions.assertThrows(RuntimeException.class, () -> assalariado.setDiasTrabalhados(-9));
    }
    @Test
    void quando_diasTrabalhados_maior_que_23_retorna_exception(){
        Assalariado assalariado = new Assalariado(1300.00);
        Assertions.assertThrows(RuntimeException.class, () -> assalariado.setDiasTrabalhados(24));
    }
    @Test
    void quando_diastTrabalhados_7_nao_retorna_exception(){
        Assalariado assalariado = new Assalariado(1300.00);
        Assertions.assertDoesNotThrow(() -> assalariado.setDiasTrabalhados(7));
    }
}