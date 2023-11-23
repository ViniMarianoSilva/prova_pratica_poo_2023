package prova_pratica;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private boolean motorista;
    private boolean embriaguez;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, char sexo, boolean motorista, boolean embriaguez) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.motorista = motorista;
        this.embriaguez = embriaguez;
    }

    @Override
    public String toString() {
        if (motorista == true) {
            return "Nome: " + getNome() + '\'' +
                    "Idade: " + getIdade() +
                    "Sexo: " + getSexo() +
                    "Motorista: " + isMotorista() +
                    "Embriaguez: " + isEmbriaguez();
        }
        else
        return "Nome:" + getNome() + '\'' +
                "Idade:" + getIdade() +
                "Sexo:" + getSexo();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isMotorista() {
        return motorista;
    }

    public void setMotorista(boolean motorista) {
        this.motorista = motorista;
    }

    public boolean isEmbriaguez() {
        return embriaguez;
    }

    public void setEmbriaguez(boolean embriaguez) {
        this.embriaguez = embriaguez;
    }
}
