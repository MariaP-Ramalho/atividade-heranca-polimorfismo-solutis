package br.com.dudadev.questao5;

public class FuncionarioEnsinoMedio extends Funcionario {
    private String escolaMedio;

    public FuncionarioEnsinoMedio(){
        super();
        this.escolaMedio = "Não informado";
    }

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaMedio){
        super(nome, codigoFuncional);
        this.escolaMedio = escolaMedio;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    public void setEscolaMedio(String escolaMedio) {
        this.escolaMedio = escolaMedio;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", escola EM: " + escolaMedio;
    }
}
