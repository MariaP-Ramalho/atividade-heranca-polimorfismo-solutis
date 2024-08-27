package br.com.dudadev.questao5e6;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escolaMedio;

    public FuncionarioEnsinoMedio(){
        super();
        this.escolaMedio = "Não informado";
    }

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaBasico, String escolaMedio){
        super(nome, codigoFuncional, escolaBasico);
        this.escolaMedio = escolaMedio;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    public void setEscolaMedio(String escolaMedio) {
        this.escolaMedio = escolaMedio;
    }

    @Override
    public double rendaTotal() {
        return super.rendaTotal() * (1 + 0.50);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", escola EM: " + escolaMedio;
    }
}
