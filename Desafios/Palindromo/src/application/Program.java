package application;

import entities.Palindromo;

import java.util.Scanner;

import static entities.Palindromo.simPalindromo;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String palavra = sc.nextLine();

        if (simPalindromo(palavra)) {
            System.out.println("É um Palíndromo!");
        } else {
            System.out.println("Não é um Palíndromo!");
        }
    }
}
