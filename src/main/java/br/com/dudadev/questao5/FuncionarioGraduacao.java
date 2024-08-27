package br.com.dudadev.questao5;

public class FuncionarioGraduacao extends Funcionario{
    private String universidade;

    public FuncionarioGraduacao(){
        super();
        this.universidade = "Não informado";
    }

    public FuncionarioGraduacao(String nome, int codigoFuncional, String universidade){
        super(nome, codigoFuncional);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Universidade: " + universidade;
    }
}
