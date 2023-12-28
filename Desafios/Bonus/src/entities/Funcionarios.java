package entities;

public class Funcionarios {

    private String nome;
    private Double salario;
    private Double descontoBonus;
    private Double salarioLiquido;


    public Funcionarios(String nome, Double salario, Double descontoBonus, Double salarioLiquido) {
        this.nome = nome;
        this.salario = salario;
        this.descontoBonus = descontoBonus;
        this.salarioLiquido = salarioLiquido;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getDescontoBonus() {
        return descontoBonus;
    }

    public void setDescontoBonus(Double descontoBonus) {
        this.descontoBonus = descontoBonus;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

}
