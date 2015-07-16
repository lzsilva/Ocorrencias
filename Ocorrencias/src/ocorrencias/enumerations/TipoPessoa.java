package ocorrencias.enumerations;

public enum TipoPessoa {
	
	POLICIAL(1),
	SUSPEITO(2),
	VITIMA(3),
	TESTEMUNHA(4);
	
	private final int valor;
	
	TipoPessoa(int valor){
		this.valor = valor;
	}
	
	public int getValor(){
		return valor;
	}

}
