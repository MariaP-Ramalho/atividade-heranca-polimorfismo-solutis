package br.com.dudadev.questao9;

import br.com.dudadev.questao5a7.model.Funcionario;

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
