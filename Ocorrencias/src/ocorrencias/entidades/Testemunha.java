package ocorrencias.entidades;

import ocorrencias.enumerations.TipoPessoa;

public class Testemunha extends Pessoa {

	@Override
	public void setTipo() {
		// TODO Auto-generated method stub
		tipo = TipoPessoa.TESTEMUNHA;
	}

}
