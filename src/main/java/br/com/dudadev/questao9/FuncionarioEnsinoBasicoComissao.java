package br.com.dudadev.questao9;

public class FuncionarioEnsinoBasicoComissao extends FuncionarioComissao {
    private String escolaBasico;

    public FuncionarioEnsinoBasicoComissao(){
        super();
        this.escolaBasico = "Não informado";
    }

    public FuncionarioEnsinoBasicoComissao(String nome, int codigoFuncional, double comissao, String escolaBasico){
        super(nome, codigoFuncional, comissao);
        this.escolaBasico = escolaBasico;
    }

    public String getEscolaBasico() {
        return escolaBasico;
    }

    public void setEscolaBasico(String escolaBasico) {
        this.escolaBasico = escolaBasico;
    }

    @Override
    public double getRendaTotal() {
        return (super.getRendaTotal() * (1 + 0.10)) + getComissao();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Escola EF: " + escolaBasico;
    }
}
