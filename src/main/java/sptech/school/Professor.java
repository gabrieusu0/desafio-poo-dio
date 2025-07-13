package sptech.school;

public class Professor extends Funcionario implements Bonus {

    private Integer quantidadeAula;
    private Double valorHora;

    public Professor(Integer quantidadeAula, Double valorHora) {
        this.quantidadeAula = quantidadeAula;
        this.valorHora = valorHora;
    }

    public Professor(String cpf, String nome, Integer quantidadeAula, Double valorHora) {
        super(cpf, nome);
        this.quantidadeAula = quantidadeAula;
        this.valorHora = valorHora;
    }

    public Professor() {
    }

    @Override
    public Double getSalario() {
        return (quantidadeAula * valorHora) * 4.5;
    }

    @Override
    public Double getValorBonus() {
        return getSalario() * 0.20;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "quantidadeAula=" + quantidadeAula +
                ", valorHora=" + valorHora +
                "} " + super.toString();
    }

    public Integer getQuantidadeAula() {
        return quantidadeAula;
    }

    public void setQuantidadeAula(Integer quantidadeAula) {
        this.quantidadeAula = quantidadeAula;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}
