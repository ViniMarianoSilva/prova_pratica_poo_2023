package prova_pratica;

import prova_pratica.Pessoa;

import java.util.List;

public class Veiculo {
    private int anoFabricacao;
    private String modelo;
    List<Pessoa> pessoas;

    public Veiculo() {
    }

    public Veiculo(String modelo, int anoFabricacao, List<Pessoa> pessoas) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        boolean peloMenosUmMotorista = false;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.isMotorista()) {
                peloMenosUmMotorista = true;
                break;
            }
        }

        if (!peloMenosUmMotorista && !pessoas.isEmpty()) {
            pessoas.get(0).setMotorista(true);
        }

        this.pessoas = pessoas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo +
                "Ano: " + anoFabricacao +
                "Pessoas no carro:" + pessoas
                ;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

}
