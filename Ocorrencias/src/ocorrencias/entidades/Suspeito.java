package ocorrencias.entidades;

import ocorrencias.enumerations.TipoPessoa;

public class Suspeito extends Pessoa {

	@Override
	public void setTipo() {
		// TODO Auto-generated method stub
		tipo = TipoPessoa.SUSPEITO;
	}

}
