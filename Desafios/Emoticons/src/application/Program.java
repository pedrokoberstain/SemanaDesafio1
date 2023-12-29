package application;

import entities.Emoticons;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma mensagem:");
        String mensagem = sc.nextLine();

        int felizes = Emoticons.contarEmot(mensagem, ":-)");
        int tristes = Emoticons.contarEmot(mensagem, ":-(");

        Emoticons.contarSent(felizes, tristes);

        sc.close();
    }
}