package org.example.empresa;

public class Assalariado extends Empregado {
    private Double salario;
    private Integer diasTrabalhados;
    public Assalariado(Double salario) { //salario sendo definido na construção
        this.salario = salario;
    }
    public void setDiasTrabalhados(Integer diasTrabalhados) {
        if(diasTrabalhados < 0 || diasTrabalhados > 23) {
            throw new RuntimeException("Os dias trabalhados devem ser entre 0 e 23.");
        }else{
            this.diasTrabalhados = diasTrabalhados;
        }

    }

    public Double getSalario() {
        return salario;
    }

    @Override
    public double getPagamento(){
        return salario / diasTrabalhados; //Por salário proporcional aos dias eu entendo que seria o quanto recebeu por cada dia
    }
}
