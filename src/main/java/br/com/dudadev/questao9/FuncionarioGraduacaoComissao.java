package br.com.dudadev.questao9;

import br.com.dudadev.questao5a7.model.FuncionarioEnsinoMedio;

public class FuncionarioGraduacaoComissao extends FuncionarioEnsinoMedioComissao {
    private String universidade;

    public FuncionarioGraduacaoComissao(){
        super();
        this.universidade = "Não informado";
    }

    public FuncionarioGraduacaoComissao(String nome, int codigoFuncional, double comissao, String escolaBasico,
                                        String escolaMedio, String universidade){
        super(nome, codigoFuncional, comissao, escolaBasico, escolaMedio);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public double getRendaTotal() {
        return (super.getRendaTotal() * (1 + 1.0)) + getComissao();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Universidade: " + universidade;
    }
}
