package prova_pratica;

import prova_pratica.Pessoa;
import prova_pratica.Veiculo;

import java.util.List;

public class VeiculosDeCarga extends Veiculo {
    private double quantidade;

    public VeiculosDeCarga() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public VeiculosDeCarga(String modelo, int anoFabricacao, List<Pessoa> pessoas, double quantidade) {
        super(modelo, anoFabricacao, pessoas);
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
