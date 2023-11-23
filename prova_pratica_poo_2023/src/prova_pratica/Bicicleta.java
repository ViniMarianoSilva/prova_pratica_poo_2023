package prova_pratica;

import java.util.List;

public class Bicicleta extends Veiculo {
    public Bicicleta() {
    }

    public Bicicleta(String modelo, int anoFabricacao, List<Pessoa> pessoas) {
        super(modelo, anoFabricacao, pessoas);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
