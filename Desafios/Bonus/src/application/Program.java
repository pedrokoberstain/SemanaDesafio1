package application;

import entities.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionários seram cadastrados ? ");
        int quanFunci = sc.nextInt();
        sc.nextLine();

        List<Funcionarios> funcionarios = new ArrayList<>();

        for (int i = 0; i < quanFunci; i++) {
            System.out.print("Nome do funcionário: ");
            String nome = sc.nextLine();

            System.out.print("Salário do funcionário: ");
            double salario = sc.nextDouble();
            sc.nextLine();

            funcionarios.add(new Funcionarios(nome, salario));
        }

        System.out.println();
        // Utilizando o método forEach para iterar sobre cada funcionário na lista funcionarios
        funcionarios.forEach(funcionario -> {
            System.out.println("Funcionário " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println((funcionario.getDescontoBonus() >= 0 ? "Bônus: " : "Desconto: ") +
                    Math.abs(funcionario.getDescontoBonus()));
            System.out.println("Salário Líquido: " + funcionario.getSalarioLiquido() + "\n");
        });

        sc.close();
    }
}
