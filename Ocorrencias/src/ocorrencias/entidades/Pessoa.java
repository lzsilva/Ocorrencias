package ocorrencias.entidades;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

import ocorrencias.enumerations.TipoPessoa;


public abstract class Pessoa {
	
	private String nome;
	private String apelido;
	private String cpf;
	private LocalDate dataNascimento;
	public TipoPessoa tipo;
	
	public Pessoa(){
		setTipo();
	}
	
	public Pessoa(String nome) {		
		this.nome = nome;
		setTipo();
	}

	public Pessoa(String nome, String apelido) {		
		this.nome = nome;
		this.apelido = apelido;
		setTipo();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Pessoa(String nome, String apelido, String cpf) {		
		this.nome = nome;
		this.apelido = apelido;
		this.cpf = cpf;
	}

	public Pessoa(String nome, String apelido, String cpf, LocalDate dataNascimento) {		
		this.nome = nome;
		this.apelido = apelido;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public abstract void setTipo();

}
