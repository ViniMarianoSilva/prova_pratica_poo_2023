package prova_pratica;

public class Rodovia {
    private String sigla;
    private int grauPericulosidade;

    public Rodovia() {
    }

    @Override
    public String toString() {
        if (getGrauPericulosidade() == 1) {
            return sigla + '\'' +
                    "Periculosidade baixa";
        } else if (getGrauPericulosidade() == 2) {
            return sigla + '\'' +
                    "Periculosidade média";
        } else return sigla + '\'' +
                "Periculosidade alta";
    }

    public Rodovia(String sigla, int grauPericulosidade) {
        this.sigla = sigla;
        this.grauPericulosidade = grauPericulosidade;
    }

    public String getSigla() {
        return sigla;
    }

    public boolean setSigla(String sigla) {
        if (validarSigla(sigla)) {
            this.sigla = sigla;
            return true;
        } else {
            System.out.println("Erro: A sigla deve seguir o padrão 'aa-11'.");
            return false;
        }
    }

    public int getGrauPericulosidade() {
        return grauPericulosidade;
    }

    public void setGrauPericulosidade(int grauPericulosidade) {
        if (grauPericulosidade == 1 || grauPericulosidade == 2 || grauPericulosidade == 3) {
            this.grauPericulosidade = grauPericulosidade;
        }
    }

    private boolean validarSigla(String sigla) {
        // Verifica se a sigla está no padrão "aa-11"
        return sigla.matches("[a-zA-Z]{2}-\\d{2}");
    }
}

