package prova_pratica;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.List;

import org.junit.Before; 

import java.util.ArrayList;
    
public class VeiculoTest {
	

    
    	
    
        
    @Test
    public void test() {
    	
    	RelatoriosECadastros teste = new RelatoriosECadastros();
    	
    	Rodovia rodoviaTestVazia = new Rodovia();
    	Rodovia rodoviaTest1 = new Rodovia("BR-10", 1);
    	Rodovia rodoviaTest2 = new Rodovia("SC-12", 2);
    	Rodovia rodoviaTest3 = new Rodovia("PR-31", 3);
    	Rodovia rodoviaTest4 = new Rodovia("BR-16", 1);
    	Rodovia rodoviaTest5 = new Rodovia("BR-101", 3);
    	
    	
    	teste.cadastrarRodovias(null, 0);    	
    	teste.cadastrarRodovias("BR-10", 1);
    	teste.cadastrarRodovias("SC-12", 2);
    	teste.cadastrarRodovias("PR-31", 3);
    	teste.cadastrarRodovias("BR-16", 1);
    	teste.cadastrarRodovias("BR-101", 3);
    	
    	teste.rodovias.add(rodoviaTest5);
    	teste.rodovias.add(rodoviaTest4);
    	teste.rodovias.add(rodoviaTest3);
    	teste.rodovias.add(rodoviaTest2);
    	teste.rodovias.add(rodoviaTest1);
    	teste.rodovias.add(rodoviaTestVazia);
    	
    	// essoa(String nome, int idade, char sexo, boolean motorista, boolean embriaguez) 
    	
    	Pessoa pessoaTestVazia = new Pessoa();
    	Pessoa pessoaTest1 = new Pessoa("Vinicius", 21, 'M', true, false);
    	Pessoa pessoaTest2 = new Pessoa("Erika", 30, 'F', false, false);
    	Pessoa pessoaTest3 = new Pessoa("Rafael", 18, 'M', true, true);
    	Pessoa pessoaTest4 = new Pessoa("Gustavo", 80, 'M', true, false);
    	Pessoa pessoaTest5 = new Pessoa("Cristiano", 90, 'M', false, true);
    	Pessoa pessoaTest6 = new Pessoa("Patricia", 41, 'F', true, true);
    	Pessoa pessoaTest7 = new Pessoa("Fernanda", 25, 'F', false, false);
    	
    	
    	List<Pessoa> listaPessoasSemMotorista = new ArrayList<>();
    	List<Pessoa> listaPessoasMotoristaBebado = new ArrayList<>();
    	List<Pessoa> listaPessoasMotoristaBebado2 = new ArrayList<>();
    	List<Pessoa> listaPessoasMotoristaSobrio = new ArrayList<>();
    	List<Pessoa> listaPessoasMotoristaBebadoSozinho = new ArrayList<>();
    	List<Pessoa> listaPessoasMotoristaSobrioSozinho = new ArrayList<>();
    	
    	
    	listaPessoasMotoristaBebado.add(pessoaTest3);
    	listaPessoasMotoristaBebado.add(pessoaTest7);
    	listaPessoasMotoristaBebado.add(pessoaTest5);
    	
    	listaPessoasMotoristaBebado2.add(pessoaTest6);
    	listaPessoasMotoristaBebado2.add(pessoaTest2);
    	
    	listaPessoasSemMotorista.add(pessoaTest2);
    	listaPessoasSemMotorista.add(pessoaTest7);
    	
    	listaPessoasMotoristaSobrio.add(pessoaTest1);
    	listaPessoasMotoristaSobrio.add(pessoaTest2);
    	
    	listaPessoasMotoristaSobrioSozinho.add(pessoaTest4);
    	listaPessoasMotoristaBebadoSozinho.add(pessoaTest3);
    
    	
    	Veiculo veiculoTestVazio = new Veiculo();
    	Veiculo veiculoTest1 = new Veiculo("Vectra", 2002, listaPessoasMotoristaSobrio);
    	Veiculo veiculoTest2 = new Veiculo("Gol", 2020, listaPessoasSemMotorista);
    	Veiculo veiculoTest3 = new Veiculo("Ferrari", 2023, listaPessoasMotoristaBebado);
    	Veiculo veiculoTest4 = new Veiculo("Polo", 2018, listaPessoasMotoristaBebado2);
    	
    	Veiculo bicicletaVazia = new Bicicleta();
    	Veiculo bicicletaSobrio = new Bicicleta("Monark", 2022, listaPessoasMotoristaSobrioSozinho);
    	Veiculo bicicletaBebado = new Bicicleta("Caloi", 2001,listaPessoasMotoristaBebadoSozinho) ;
    	
    	Veiculo cargaVazia = new VeiculosDeCarga();
    	Veiculo cargaSobrio = new VeiculosDeCarga("Willians", 1998, listaPessoasMotoristaSobrioSozinho, 2000.00);
    	Veiculo cargaBebado = new VeiculosDeCarga("Mercedes", 2016,listaPessoasMotoristaBebadoSozinho, 300.00) ;
    	
    	
    	teste.cadastrarVeiculosDeCarga("Willians", 1998, listaPessoasMotoristaSobrioSozinho, 2000.00);
    	teste.cadastrarVeiculosDeCarga("Mercedes", 2016,listaPessoasMotoristaBebadoSozinho, 300.00) ;
    	
    	teste.cadastrarBicicleta("Monark", 2022, listaPessoasMotoristaSobrioSozinho);
    	teste.cadastrarBicicleta("Caloi", 2001,listaPessoasMotoristaBebadoSozinho) ;
    	
    	teste.cadastrarVeiculos("Vectra", 2002, listaPessoasMotoristaSobrio);
    	teste.cadastrarVeiculos("Gol", 2020, listaPessoasSemMotorista);
    	teste.cadastrarVeiculos("Ferrari", 2023, listaPessoasMotoristaBebado);
    	teste.cadastrarVeiculos("Polo", 2018, listaPessoasMotoristaBebado2);
    	
    	List<Veiculo> listaVeiculosAcidenteBicicletaCarro= new ArrayList<>();
    	List<Veiculo> listaVeiculosAcidenteCargaBicicleta= new ArrayList<>();
    	List<Veiculo> listaVeiculosAcidenteCarroCarro= new ArrayList<>();
    	List<Veiculo> listaVeiculosAcidenteCarroCarga= new ArrayList<>();
    	List<Veiculo> listaVeiculosAcidenteCargaCarga= new ArrayList<>();
    	List<Veiculo> listaVeiculosAcidenteBicicletaBicicleta= new ArrayList<>();
    	List<Veiculo> listaVeiculosAcidente3veiculos= new ArrayList<>();
    	
    	teste.veiculos.add(cargaBebado);
    	teste.veiculos.add(bicicletaBebado);
    	teste.veiculos.add(bicicletaSobrio);
    	teste.veiculos.add(bicicletaVazia);
    	teste.veiculos.add(cargaSobrio);
    	teste.veiculos.add(cargaVazia);
    	teste.veiculos.add(veiculoTest1);
    	teste.veiculos.add(veiculoTest2);
    	teste.veiculos.add(veiculoTest3);
    	teste.veiculos.add(veiculoTest4);
    	teste.veiculos.add(veiculoTestVazio);
    	
    	listaVeiculosAcidenteBicicletaCarro.add(veiculoTest1);
    	listaVeiculosAcidenteBicicletaCarro.add(bicicletaSobrio);
    	
    	listaVeiculosAcidenteCargaBicicleta.add(cargaSobrio);
    	listaVeiculosAcidenteCargaBicicleta.add(bicicletaBebado);
    	
    	listaVeiculosAcidenteCarroCarro.add(veiculoTest2);
    	listaVeiculosAcidenteCarroCarro.add(veiculoTest3);
    	
    	listaVeiculosAcidenteCarroCarga.add(veiculoTest4);
    	listaVeiculosAcidenteCarroCarga.add(cargaBebado);
    	
    	listaVeiculosAcidenteCargaCarga.add(cargaBebado);
    	listaVeiculosAcidenteCargaCarga.add(cargaSobrio);
    	
    	listaVeiculosAcidenteBicicletaBicicleta.add(bicicletaSobrio);
    	listaVeiculosAcidenteBicicletaBicicleta.add(bicicletaBebado);
    	
    	listaVeiculosAcidente3veiculos.add(cargaBebado);
    	listaVeiculosAcidente3veiculos.add(bicicletaBebado);
    	listaVeiculosAcidente3veiculos.add(veiculoTest4);
    	
    	
    	
    	//public Acidentes(int vitimasFatais, int vitimasFeridos, int mes, Rodovia rodovia, List<Veiculo> veiculosAcidente) {
    	
    	Acidentes acidenteVazio = new Acidentes();
    	Acidentes acidenteLeve = new Acidentes(0,0,2,rodoviaTest1, listaVeiculosAcidenteCarroCarro);
    	Acidentes acidenteMorte = new Acidentes(1,1,1,rodoviaTest2, listaVeiculosAcidenteCarroCarga);
    	Acidentes acidenteFeridos = new Acidentes(0,2,10,rodoviaTest3, listaVeiculosAcidenteCargaCarga);
    	Acidentes acidenteSobrio = new Acidentes(0,0,6,rodoviaTest4, listaVeiculosAcidenteBicicletaCarro);
    	Acidentes acidenteBebado = new Acidentes(3,1,2,rodoviaTest5, listaVeiculosAcidente3veiculos);
    	
    	
    	teste.cadastrarAcidentes(0, 0, 0, null, null);
    	teste.cadastrarAcidentes(0,0,2,rodoviaTest1, listaVeiculosAcidenteCarroCarro);
    	teste.cadastrarAcidentes(1,1,1,rodoviaTest2, listaVeiculosAcidenteCarroCarga);
    	teste.cadastrarAcidentes(0,2,10,rodoviaTest3, listaVeiculosAcidenteCargaCarga);
    	teste.cadastrarAcidentes(0,0,6,rodoviaTest4, listaVeiculosAcidenteBicicletaCarro);
    	teste.cadastrarAcidentes(3,1,2,rodoviaTest5, listaVeiculosAcidente3veiculos);
    	
    	teste.acidentes.add(acidenteBebado);
    	teste.acidentes.add(acidenteVazio);
    	teste.acidentes.add(acidenteSobrio);
    	teste.acidentes.add(acidenteFeridos);
    	teste.acidentes.add(acidenteMorte);
    	teste.acidentes.add(acidenteLeve);
    	
    	
		teste.cadastrarAcidentes(0, 0, 0, null, null);		
    }
    	// RelatoriosECadastros(List<Rodovia> rodovias, List<Acidentes> acidentes) {
    	void listarPorGrau(){
    		
    		
    	}
}
    