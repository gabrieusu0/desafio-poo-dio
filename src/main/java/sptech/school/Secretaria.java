package sptech.school;

public class Secretaria extends Funcionario {
    private Double salario;
    private Double extra;

    public Secretaria(Double salario, Double extra) {
        this.salario = salario;
        this.extra = extra;
    }

    public Secretaria() {
    }

    public Secretaria(String cpf, String nome, Double salario, Double extra) {
        super(cpf, nome);
        this.salario = salario;
        this.extra = extra;
    }

    @Override
    public Double getSalario() {
        return salario + extra;
    }

    @Override
    public String toString() {
        return "Secretaria{" +
                "salario=" + salario +
                ", extra=" + extra +
                "} " + super.toString();
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getExtra() {
        return extra;
    }

    public void setExtra(Double extra) {
        this.extra = extra;
    }
}
