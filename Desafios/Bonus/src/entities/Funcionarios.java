package entities;

public class Funcionarios {

    private String nome;
    private Double salario;
    private Double descontoBonus;
    private Double salarioLiquido;


    public Funcionarios(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
        calcDescontoBonus();
        calcSalarioLiquido();
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Double getDescontoBonus() {
        return descontoBonus;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    private void  calcDescontoBonus() {
        if (salario <= 1000) {
            descontoBonus = salario * 0.2;
        } else if (salario <=2000) {
            descontoBonus = salario * 0.1;
        } else {
            descontoBonus = -salario * 0.1;
        }
    }

    private void calcSalarioLiquido () {
        salarioLiquido = salario + descontoBonus;
    }
}