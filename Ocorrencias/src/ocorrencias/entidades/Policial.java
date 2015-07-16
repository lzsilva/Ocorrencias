package ocorrencias.entidades;

import ocorrencias.enumerations.TipoPessoa;

public class Policial extends Pessoa {
	
	private Patente patente;	

	@Override
	public void setTipo() {
		// TODO Auto-generated method stub
		tipo = TipoPessoa.POLICIAL;
	}
	
}

