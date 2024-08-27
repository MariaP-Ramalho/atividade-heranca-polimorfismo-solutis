package br.com.dudadev.questao5e6;

public class Funcionario {

    private double rendaBasica;
    private String nome;

    private int codigoFuncional;

    public Funcionario() {
        this.nome = "Não informado";
        this.codigoFuncional = 0;
    }

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double rendaTotal() {
        return rendaBasica;
    }


    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Codigo Funcional: " + codigoFuncional;
    }
}
