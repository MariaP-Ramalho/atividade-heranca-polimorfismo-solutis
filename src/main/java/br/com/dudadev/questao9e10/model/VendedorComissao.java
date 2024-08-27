package br.com.dudadev.questao9e10.model;

public class VendedorComissao extends FuncionarioComissao {

    public VendedorComissao(String nome, int codigoFuncional){
        super(nome, codigoFuncional, 250);
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
