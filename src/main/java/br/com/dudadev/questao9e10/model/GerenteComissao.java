package br.com.dudadev.questao9e10.model;

public class GerenteComissao extends FuncionarioComissao {

    public GerenteComissao(String nome, int codigoFuncional){
        super(nome, codigoFuncional, 1500);
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
