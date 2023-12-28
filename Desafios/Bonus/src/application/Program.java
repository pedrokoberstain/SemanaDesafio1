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

        List<Funcionarios> funcionarios = new ArrayList<>();

        for (int i = 0; i < quanFunci; i++) {
            System.out.println("Nome do funcionário" + (i + 1) + ": ");
            String nomeFunci = sc.nextLine();

            System.out.println("Salário do funcionário" + (i + 1) + ": ");
            Double salarioFunci = sc.nextDouble();



        }

    }
}
