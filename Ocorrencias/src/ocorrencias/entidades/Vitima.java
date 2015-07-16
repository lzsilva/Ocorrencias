package ocorrencias.entidades;

import ocorrencias.enumerations.TipoPessoa;

public class Vitima extends Pessoa {

	@Override
	public void setTipo() {
		// TODO Auto-generated method stub
		tipo = TipoPessoa.VITIMA;
	}

}
