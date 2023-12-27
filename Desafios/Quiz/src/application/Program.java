package application;

import entities.Perguntas;
import entities.Respostas;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Perguntas [] perguntas = {
                new Perguntas("Qual é a linguagem de programação mais popular?"),
                new Perguntas("Quem é considerado o pai da computação ?"),
                new Perguntas("O que é um Array ?"),
                new Perguntas("O que significa CPU ?")
        };

        Respostas [] respostas = {
                new Respostas("Javascript"),
                new Respostas("Alan Turing"),
                new Respostas("Coleção"),
                new Respostas("Central Processing Unit"),
        };

        System.out.println("Qual o seu nome ?");
        String nomeUsuario = sc.nextLine();

        int erros = 0;
        int acertos = 0;

        for (int i=0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            System.out.print("Resposta: ");
            String respostaUsuario = sc.nextLine();

            if (respostaUsuario.equalsIgnoreCase(String.valueOf(respostas[i]))) {
                System.out.println("Você acertou!");
                acertos++;
            } else {
                System.out.println("A resposta está errada !");
                System.out.println("A resposta certa é :" + respostas[i]);
                erros++;
            }
        }
            System.out.println();
            System.out.println("Resultado finail :");
            System.out.println("Usuário: " + nomeUsuario);
            System.out.println("Acertos: " + acertos);
            System.out.println("Erros: " + erros);

        sc.close();

    }
}

