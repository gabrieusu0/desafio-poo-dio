package sptech.school;

public class Coordenador extends Funcionario implements Bonus{

    private Integer quantidadeHora;
    private Integer quantidadeCursos;
    private Double valorHora;

    public Coordenador(Integer quantidadeHora, Integer quantidadeCursos, Double valorHora) {
        this.quantidadeHora = quantidadeHora;
        this.quantidadeCursos = quantidadeCursos;
        this.valorHora = valorHora;
    }

    public Coordenador(String cpf, String nome, Integer quantidadeHora, Integer quantidadeCursos, Double valorHora) {
        super(cpf, nome);
        this.quantidadeHora = quantidadeHora;
        this.quantidadeCursos = quantidadeCursos;
        this.valorHora = valorHora;
    }

    public Coordenador() {
    }

    @Override
    public Double getValorBonus() {
        return getSalario() * 0.20;
    }

    @Override
    public Double getSalario() {
        return ((quantidadeHora * valorHora) * 4.5) + quantidadeCursos * 500;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "quantidadeHora=" + quantidadeHora +
                ", quantidadeCursos=" + quantidadeCursos +
                ", valorHora=" + valorHora +
                "} " + super.toString();
    }

    public Integer getQuantidadeHora() {
        return quantidadeHora;
    }

    public void setQuantidadeHora(Integer quantidadeHora) {
        this.quantidadeHora = quantidadeHora;
    }

    public Integer getQuantidadeCursos() {
        return quantidadeCursos;
    }

    public void setQuantidadeCursos(Integer quantidadeCursos) {
        this.quantidadeCursos = quantidadeCursos;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}
