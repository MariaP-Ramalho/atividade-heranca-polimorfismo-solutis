package br.com.dudadev.questao5e6;

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
    public double rendaTotal() {
        return super.rendaTotal() * (1 + 0.10);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Escola EF: " + escolaBasico +
                ", Renda Total: " + rendaTotal();
    }
}
