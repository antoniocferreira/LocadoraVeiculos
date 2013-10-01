package basicas;

import java.util.Collection;
import java.util.Date;

import comum.ObjetoGeral;

public class Pessoa extends ObjetoGeral{
	
	
	private String nome;
	private String cpf;
	private String rg;
	private String emissor;
	private Date nascimento;
	private Endereco endereco;
	private Collection<String> telefones;
	private String email;
	
	//construtores
	public Pessoa(){
	}

	public Pessoa(String nome, String cpf, String rg, String emissor,
			Date nascimento, Endereco endereco, Collection<String> telefones,
			String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.emissor = emissor;
		this.nascimento = nascimento;
		this.endereco = endereco;
		this.telefones = telefones;
		this.email = email;
	}


	//Gets e Sets

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Collection<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(Collection<String> telefones) {
		this.telefones = telefones;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
