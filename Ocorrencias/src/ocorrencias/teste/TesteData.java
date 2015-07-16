package ocorrencias.teste;

import ocorrencias.enumerations.*;
import java.time.LocalDate;


import ocorrencias.entidades.*;

public class TesteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa  = new Vitima();
		pessoa.setDataNascimento(LocalDate.of(2015, 2, 15));
		
		System.out.println(pessoa.getDataNascimento());	
		int i = 1;
		System.out.println(pessoa.tipo);

	}

}
