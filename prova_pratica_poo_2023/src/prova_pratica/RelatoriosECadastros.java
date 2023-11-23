package prova_pratica;

import prova_pratica.Acidentes;
import prova_pratica.Bicicleta;
import prova_pratica.Pessoa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RelatoriosECadastros {
    List<Rodovia> rodovias = new ArrayList<>();
    List<Acidentes> acidentes = new ArrayList<>();
    List<Veiculo> veiculos = new ArrayList<>();
    
    public RelatoriosECadastros() {
        
    }

    public RelatoriosECadastros(List<Rodovia> rodovias, List<Acidentes> acidentes) {
        this.rodovias = rodovias;
        this.acidentes = acidentes;
    }

    public List<Rodovia> getRodovias() {
        return rodovias;
    }

    public void cadastrarVeiculos(String modelo, int anoFabricacao, List<Pessoa> pessoas) {
        Veiculo veiculo = new Veiculo(modelo, anoFabricacao, pessoas);
        veiculos.add(veiculo);
        Veiculo bicicleta = new Bicicleta(modelo, anoFabricacao, pessoas);
        veiculos.add(bicicleta);
    }
    
    public void cadastrarBicicleta(String modelo, int anoFabricacao, List<Pessoa> pessoas) {
    	Veiculo bicicleta = new Bicicleta(modelo, anoFabricacao, pessoas);
        veiculos.add(bicicleta);
    }
    public void cadastrarVeiculosDeCarga(String modelo, int anoFabricacao, List<Pessoa> pessoas, double carga) {
    	VeiculosDeCarga veiculoCarga = new VeiculosDeCarga(modelo, anoFabricacao, pessoas, carga);
    	veiculos.add(veiculoCarga);
    }

    public void cadastrarAcidentes(int vitimasFatais, int vitimasFeridos, int mes, Rodovia rodovia, List<Veiculo> veiculosAcidente) {
        Acidentes batida = new Acidentes(vitimasFatais, vitimasFeridos, mes, rodovia, veiculosAcidente);
        acidentes.add(batida);
    }

    public void cadastrarRodovias(String sigla, int grauPericulosidade) {
        Rodovia estradas = new Rodovia(sigla, grauPericulosidade);
        rodovias.add(estradas);
    }

    public void listarEmbreaguez() {
        List<Acidentes> acidentesBebados = new ArrayList<>();
        for (Acidentes batida : acidentes) {
            for (Veiculo veiculo : batida.getVeiculosAcidente()) {
                for (Pessoa pessoa : veiculo.pessoas) {
                    if (pessoa.isMotorista() == true) {
                        if (pessoa.isEmbriaguez() == true) {
                            acidentesBebados.add(batida);
                        }
                    }
                }
            }
        }
        for (int i = 0; i <= acidentesBebados.size(); i++) {
            acidentesBebados.get(i);
        }
    }

    public void listarPorGrau() {
        int contGrau1 = 0;
        int contGrau2 = 0;
        int contGrau3 = 0;
        for (Acidentes batida : acidentes) {
            for (Rodovia estradas : rodovias) {
                for (Rodovia rodovia : rodovias) {
                    int grau = rodovia.getGrauPericulosidade();
                    if (grau == 1) {
                        contGrau1++;
                    } else if (grau == 2) {
                        contGrau2++;
                    } else if (grau == 3) {
                        contGrau3++;
                    }
                }
            }
        }
        System.out.println("As rodovias estão dividas em: \nGrau 1: " + contGrau1 + "\nGrau 2: " + contGrau2 + "\nGrau 3: " + contGrau3);
    }

    public void listarVeiculosDeCarga() {
        List<Veiculo> veiculosCarga = new ArrayList<>();
        for (Acidentes batida : acidentes) {
            for (Veiculo veiculo : batida.getVeiculosAcidente()) {
                if (veiculo instanceof VeiculosDeCarga) {
                    veiculosCarga.add(veiculo);
                }
            }
        }
        for (int i = 0; i <= veiculosCarga.size(); i++) {
            veiculosCarga.get(i);
        }
    }

    public void listarRodoviasAcidentesBicicletas() {
        int[] contagemAcidentes = new int[rodovias.size()];

        for (Acidentes batida : acidentes) {
            Rodovia rodovia = batida.getRodovia();
            if (batida.getVeiculosAcidente() instanceof Bicicleta) {
                int indice = rodovias.indexOf(rodovia);
                contagemAcidentes[indice]++;
            }
        }

        int maxAcidentes = 0;
        List<Integer> indicesRodoviasMaisAcidentes = new ArrayList<>();

        for (int i = 0; i < contagemAcidentes.length; i++) {
            if (contagemAcidentes[i] > maxAcidentes) {
                maxAcidentes = contagemAcidentes[i];
                indicesRodoviasMaisAcidentes.clear(); // Limpa a lista, pois encontramos uma contagem maior
                indicesRodoviasMaisAcidentes.add(i);
            } else if (contagemAcidentes[i] == maxAcidentes) {
                // Se a contagem é igual ao máximo, adiciona o índice à lista
                indicesRodoviasMaisAcidentes.add(i);
            }
        }

        if (!indicesRodoviasMaisAcidentes.isEmpty()) {
            System.out.println("Rodovias com mais acidentes com bicicletas");
            for (int index : indicesRodoviasMaisAcidentes) {
                System.out.println(" - " + rodovias.get(index).getSigla() + " - " + maxAcidentes + " acidentes");
            }
        } else {
            System.out.println("Nenhuma rodovia com acidentes com bicicletas encontrada.");
        }

    }

    public void listarRodoviasAcidentesFatais() {
        int[] contagemAcidentes = new int[rodovias.size()];

        for (Acidentes batida : acidentes) {
            Rodovia rodovia = batida.getRodovia();
            if (batida.getVitimasFatais() > 0) {
                int indice = rodovias.indexOf(rodovia);
                contagemAcidentes[indice]++;
            }
        }

        int maxAcidentes = 0;
        List<Integer> indicesRodoviasMaisAcidentes = new ArrayList<>();

        for (int i = 0; i < contagemAcidentes.length; i++) {
            if (contagemAcidentes[i] > maxAcidentes) {
                maxAcidentes = contagemAcidentes[i];
                indicesRodoviasMaisAcidentes.clear(); // Limpa a lista, pois encontramos uma contagem maior
                indicesRodoviasMaisAcidentes.add(i);
            } else if (contagemAcidentes[i] == maxAcidentes) {
                // Se a contagem é igual ao máximo, adiciona o índice à lista
                indicesRodoviasMaisAcidentes.add(i);
            }
        }

        if (!indicesRodoviasMaisAcidentes.isEmpty()) {
            System.out.println("Rodovias com mais acidentes com fatais");
            for (int index : indicesRodoviasMaisAcidentes) {
                System.out.println(" - " + rodovias.get(index).getSigla() + " - " + maxAcidentes + " acidentes");
            }
        } else {
            System.out.println("Nenhuma rodovia com acidentes fatais.");
        }

    }

    public void listarAcidentesAutoNovos() {
        // Set e Hash Set não deixam acontecer a duplicação do acidente
        Set<Acidentes> acidentesContados = new HashSet<>();
        int contAcidentesAutoNovos = 0;

        for (Acidentes batida : acidentes) {
            // Verifica se o acidente já foi contado
            if (!acidentesContados.contains(batida)) {
                boolean contabilizarAcidente = false;

                for (Veiculo veiculo : batida.getVeiculosAcidente()) {
                    if (veiculo.getAnoFabricacao() >= 2013) {
                        contabilizarAcidente = true;
                        break; // Se encontrar um veículo do ano desejado, não é necessário verificar os outros
                    }
                }

                if (contabilizarAcidente) {
                    contAcidentesAutoNovos++;
                    acidentesContados.add(batida);
                }
            }
        }

        System.out.println("Foram contabilizados " + contAcidentesAutoNovos + " acidentes com no minimo 1(um) veículo" +
                " com ano de fabricação a partir de 2013");
    }

    public void listarAcidentesCarnaval() {
        Set<Rodovia> rodoviasAcidentes = new HashSet<>();
        List<Rodovia> rodoviasAcidentesMostra = new ArrayList<>();

        for (Acidentes batida : acidentes) {
            if (batida.getMes() == 2) {
                Rodovia rodovia = batida.getRodovia();

                // Verifica se a rodovia já foi contada
                if (!rodoviasAcidentes.contains(rodovia)) {
                    rodoviasAcidentesMostra.add(rodovia);
                    rodoviasAcidentes.add(rodovia);
                }
            }
        }

        // Mostrar a variável sigla de cada rodovia
        for (Rodovia rodovia : rodoviasAcidentesMostra) {
            System.out.println("prova_pratica.Rodovia: " + rodovia.getSigla());
        }
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void setRodovias(List<Rodovia> rodovias) {
        this.rodovias = rodovias;
    }

    public List<Acidentes> getAcidentes() {
        return acidentes;
    }

    public void setAcidentes(List<Acidentes> acidentes) {
        this.acidentes = acidentes;
    }

}
