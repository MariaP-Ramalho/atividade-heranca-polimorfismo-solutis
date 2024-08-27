package br.com.dudadev.questao9;

import br.com.dudadev.questao5a7.model.FuncionarioEnsinoBasico;

public class FuncionarioEnsinoMedioComissao extends FuncionarioEnsinoBasicoComissao {
    private String escolaMedio;

    public FuncionarioEnsinoMedioComissao(){
        super();
        this.escolaMedio = "Não informado";
    }

    public FuncionarioEnsinoMedioComissao(String nome, int codigoFuncional, double comissao, String escolaBasico, String escolaMedio){
        super(nome, codigoFuncional, comissao, escolaBasico);
        this.escolaMedio = escolaMedio;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    public void setEscolaMedio(String escolaMedio) {
        this.escolaMedio = escolaMedio;
    }

    @Override
    public double getRendaTotal() {
        return (super.getRendaTotal() * (1 + 0.50)) + getComissao();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", escola EM: " + escolaMedio;
    }
}
