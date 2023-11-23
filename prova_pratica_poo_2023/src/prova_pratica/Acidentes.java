package prova_pratica;

import javax.swing.*;
import java.util.List;

public class Acidentes {
    private int vitimasFatais;
    private int vitimasFeridos;
    private int mes;
    private Rodovia rodovia;
    private List<Veiculo> veiculosAcidente;

    public Acidentes() {
    }

    public Acidentes(int vitimasFatais, int vitimasFeridos, int mes, Rodovia rodovia, List<Veiculo> veiculosAcidente) {
        this.vitimasFatais = vitimasFatais;
        this.vitimasFeridos = vitimasFeridos;
        this.mes = mes;
        this.rodovia = rodovia;
        this.veiculosAcidente = veiculosAcidente;
    }


    @Override
    public String toString() {
        return
                "prova_pratica.Rodovia=" + rodovia +
                "vitimasFatais=" + vitimasFatais +
                ", vitimasFeridos=" + vitimasFeridos +
                ", mes='" + mes + '\'' +
                ", veiculosAcidente=" + veiculosAcidente
                ;
    }

    public int getVitimasFatais() {
        return vitimasFatais;
    }

    public void setVitimasFatais(int vitimasFatais) {
        this.vitimasFatais = vitimasFatais;
    }

    public int getVitimasFeridos() {
        return vitimasFeridos;
    }

    public void setVitimasFeridos(int vitimasFeridos) {
        this.vitimasFeridos = vitimasFeridos;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public Rodovia getRodovia() {
        return rodovia;
    }

    public void setRodovia(Rodovia rodovia) {
        this.rodovia = rodovia;
    }

    public List<Veiculo> getVeiculosAcidente() {
        return veiculosAcidente;
    }

    public void setVeiculosAcidente(List<Veiculo> veiculosAcidente) {
        this.veiculosAcidente = veiculosAcidente;
    }
}
