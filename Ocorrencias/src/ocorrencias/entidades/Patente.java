package ocorrencias.entidades;

public class Patente {
	
	private String descricao;
	
	private String sigla;
	
	public Patente(){}
	
	public Patente(String descricao, String sigla){
		this.descricao = descricao;
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}	

}
