package br.com.dudadev.questao8;

import br.com.dudadev.questao5a7.model.Funcionario;

public class Gerente extends Funcionario {
    private double comissao = 1500;

    public Gerente(String nome, int codigoFuncional){
        super(nome, codigoFuncional);
    }

    @Override
    public double getRendaTotal() {
        return super.getRendaTotal() + comissao;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
