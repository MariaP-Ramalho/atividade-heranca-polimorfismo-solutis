package br.com.dudadev.questao9e10.model;

public class SupervisorComissao extends FuncionarioComissao {

    public SupervisorComissao(String nome, int codigoFuncional){
        super(nome, codigoFuncional, 600);
    }

    @Override
    public double getRendaTotal() {
        return super.getRendaTotal() + getComissao();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}