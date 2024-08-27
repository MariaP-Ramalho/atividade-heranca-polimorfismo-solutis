package br.com.dudadev.questao9e10;

import br.com.dudadev.questao9e10.model.*;

public class Empresa2 {

    private static final int TOTAL_FUNCIONARIOS = 10;
    private static final int FUNCIONARIOS_GERENTE = 1;
    private static final int FUNCIONARIOS_SUPERVISORES = 2;

    public static void main(String[] args) {
        FuncionarioComissao[] funcionarios = new FuncionarioComissao[TOTAL_FUNCIONARIOS];

        preencherFuncionarios(funcionarios);
        calcularCustos(funcionarios);
    }

    private static void preencherFuncionarios(FuncionarioComissao[] funcionarios) {
        for (int i = 0; i < FUNCIONARIOS_GERENTE; i++) {
            funcionarios[i] = new GerenteComissao("Gerente", 90);
        }

        for (int i = FUNCIONARIOS_GERENTE; i < FUNCIONARIOS_GERENTE + FUNCIONARIOS_SUPERVISORES; i++) {
            funcionarios[i] = new SupervisorComissao("Supervisor", 60);
        }

        for(int i = FUNCIONARIOS_GERENTE + FUNCIONARIOS_SUPERVISORES; i < TOTAL_FUNCIONARIOS; i++) {
            funcionarios[i] = new VendedorComissao("vendedor", 50);
        }
    }

    private static void calcularCustos(FuncionarioComissao[] funcionarios) {
        double custoTotal = 0.0;
        double custoVendedor = 0.0;
        double custoSupervisor = 0.0;
        double custoGerente = 0.0;

        for (FuncionarioComissao funcionario : funcionarios) {
            double salario = funcionario.getRendaTotal();
            custoTotal += salario;

            if (funcionario instanceof GerenteComissao) {
                custoGerente += salario;
            } else if (funcionario instanceof SupervisorComissao) {
                custoSupervisor += salario;
            } else if (funcionario instanceof VendedorComissao) {
                custoVendedor += salario;
            }
        }

        imprimirCustos(custoTotal, custoVendedor, custoSupervisor, custoGerente);
    }

    private static void imprimirCustos(double custoTotal, double custoVendedor, double custoSupervisor, double custoGerente) {
        System.out.println("Custo total com salários: R$ " + custoTotal);
        System.out.println("Custo com Gerentes: R$ " + custoGerente);
        System.out.println("Custo com Supervisores: R$ " + custoSupervisor);
        System.out.println("Custo com Vendedores: R$ " + custoVendedor);
    }
}