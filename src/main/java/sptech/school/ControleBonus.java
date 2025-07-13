package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<Bonus> lista;

    public ControleBonus(List<Bonus> lista) {
        this.lista = lista;
    }

    public ControleBonus() {
        lista = new ArrayList<>();
    }

    public void adiciona(Bonus b){
        lista.add(b);
    }

    public List<Bonus> exibir(){
        return lista;
    }

    public Double calculaTotal(){
        Double total = 0.0;
        for (Bonus f : lista){
            total += f.getValorBonus();
        }
        return total;
    }
}

