package br.com.dudadev.questao5a7;

import br.com.dudadev.questao5a7.model.Funcionario;
import br.com.dudadev.questao5a7.model.FuncionarioEnsinoBasico;
import br.com.dudadev.questao5a7.model.FuncionarioEnsinoMedio;
import br.com.dudadev.questao5a7.model.FuncionarioGraduacao;

public class Empresa {

    private static final int TOTAL_FUNCIONARIOS = 10;
    private static final int FUNCIONARIOS_BASICO = 4;
    private static final int FUNCIONARIOS_MEDIO = 4;

    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[TOTAL_FUNCIONARIOS];

        preencherFuncionarios(funcionarios);
        calcularCustos(funcionarios);
    }

    private static void preencherFuncionarios(Funcionario[] funcionarios) {
        for (int i = 0; i < FUNCIONARIOS_BASICO; i++) {
            funcionarios[i] = new FuncionarioEnsinoBasico();
        }

        for (int i = FUNCIONARIOS_BASICO; i < FUNCIONARIOS_BASICO + FUNCIONARIOS_MEDIO; i++) {
            funcionarios[i] = new FuncionarioEnsinoMedio();
        }

        for(int i = FUNCIONARIOS_BASICO + FUNCIONARIOS_MEDIO; i < TOTAL_FUNCIONARIOS; i++) {
            funcionarios[i] = new FuncionarioGraduacao();
        }
    }

    private static void calcularCustos(Funcionario[] funcionarios) {
        double custoTotal = 0.0;
        double custoBasico = 0.0;
        double custoMedio = 0.0;
        double custoGraduacao = 0.0;

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.getRendaTotal();
            custoTotal += salario;

            if (funcionario instanceof FuncionarioGraduacao) {
                custoGraduacao += salario;
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                custoMedio += salario;
            } else if (funcionario instanceof FuncionarioEnsinoBasico) {
                custoBasico += salario;
            }
        }

        imprimirCustos(custoTotal, custoBasico, custoMedio, custoGraduacao);
    }

    private static void imprimirCustos(double custoTotal, double custoBasico, double custoMedio, double custoGraduacao) {
        System.out.println("Custo total com salários: R$ " + custoTotal);
        System.out.println("Custo com funcionários de Ensino Básico: R$ " + custoBasico);
        System.out.println("Custo com funcionários de Ensino Médio: R$ " + custoMedio);
        System.out.println("Custo com funcionários de Graduação: R$ " + custoGraduacao);
    }
}

