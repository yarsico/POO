package POO;

public class Altomovel {

	
	//declaração dos atributos da classe
    private String nomeProprietario;
    private String modelo;
    private String placa;
    private int ano;
	public Altomovel(String nomeProprietario, String modelo, String placa, int ano) {
		super();
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	  public void visualizar() {
		  
		  System.out.println("\nO nome do proprietário " +nomeProprietario+ " possui um altomovel " +modelo+ " com a placa "+placa+ " do ano "+ano);
	  }

    
        
    }

  

