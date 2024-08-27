package br.com.dudadev.questao9;

public class FuncionarioComissao {

    private double rendaBasica = 1000;
    private String nome;

    private double comissao;

    private int codigoFuncional;

    public FuncionarioComissao() {
        this.nome = "Não informado";
        this.codigoFuncional = 0;
        this.comissao = 0.0;
    }

    public FuncionarioComissao(String nome, int codigoFuncional, double comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
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

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    public double getRendaTotal() {
        return rendaBasica + comissao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Codigo Funcional: " + codigoFuncional +
                ", Renda Total: " + getRendaTotal();
    }
}
