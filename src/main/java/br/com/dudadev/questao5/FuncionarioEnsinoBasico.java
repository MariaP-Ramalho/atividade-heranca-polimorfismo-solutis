package br.com.dudadev.questao5;

public class FuncionarioEnsinoBasico extends Funcionario{
    private String escolaBasico;

    public FuncionarioEnsinoBasico(){
        super();
        this.escolaBasico = "Não informado";
    }

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaBasico){
        super(nome, codigoFuncional);
        this.escolaBasico = escolaBasico;
    }

    public String getEscolaBasico() {
        return escolaBasico;
    }

    public void setEscolaBasico(String escolaBasico) {
        this.escolaBasico = escolaBasico;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Escola EF: " + escolaBasico;
    }
}
