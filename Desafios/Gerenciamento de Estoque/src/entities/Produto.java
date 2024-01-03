package entities;

import java.util.Locale;

public class Produto {

    private String name;
    private Integer codigo;
    private Double preco;
    private Integer quantidadeEstoque;

    public Produto(String name, Integer codigo, Double preco, Integer quantidadeEstoque) {
        this.name = name;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void comprar(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            this.quantidadeEstoque += quantidadeComprada;
            System.out.println(quantidadeComprada + " unidades de " + name + " compradas. Novo estoque: " + quantidadeEstoque);
        } else {
            System.out.println("Quantidade inválida para compra.");
        }
    }
    public void vender(int quantidadeVendida) {
        if (quantidadeVendida > 0 && quantidadeVendida <= quantidadeEstoque) {
            this.quantidadeEstoque -= quantidadeVendida;
            System.out.println(quantidadeVendida + " unidades de " + name + " vendidas. Novo estoque: " + quantidadeEstoque);
        } else {
            System.out.println("Quantidade inválida para venda ou estoque insuficiente.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + name);
        System.out.println("Código: " + codigo);
        System.out.printf(Locale.US, "Preço: R$%.2f%n", preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

}

