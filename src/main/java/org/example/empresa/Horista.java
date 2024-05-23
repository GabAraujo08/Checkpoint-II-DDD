package org.example.empresa;

public class Horista extends Empregado{
    private Integer horasTrabalhadas;
    private Double valorHora;

    public Horista(Double valorHora) { //valorHora sendo definido na construção
        this.valorHora = valorHora;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        if (horasTrabalhadas < 0 || horasTrabalhadas > 528){
            throw new RuntimeException("Horas trabalhadas deve ser um número entre 0 e 528.");
        }else{
            this.horasTrabalhadas = horasTrabalhadas;
        }

    }

    @Override
    public double getPagamento(){
        return horasTrabalhadas * valorHora;
    }
}
