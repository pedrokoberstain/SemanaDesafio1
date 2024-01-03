package application;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nomeProduto = sc.nextLine();

        System.out.println("Digite o código do produto:");
        int codProduto = sc.nextInt();

        System.out.println("Digite o preço do produto:");
        double precoProduto = sc.nextDouble();

        System.out.println("Digite a quantidade em estoque do produto:");
        int quantEstoqueProduto = sc.nextInt();

        Produto produto = new Produto(nomeProduto, codProduto, precoProduto, quantEstoqueProduto);

        System.out.println("\nInformações iniciais do produto:");
        produto.exibirInformacoes();

        System.out.println();

        System.out.println("Digite a quantidade vendida do produto: ");
        int quantidadeVendida = sc.nextInt();

        System.out.println("Digite o código da venda: ");
        int codigoVenda = sc.nextInt();

        produto.vender(quantidadeVendida);

        System.out.println("\nInformações finais do produto:");
        produto.exibirInformacoes();

        sc.close();
    }
}