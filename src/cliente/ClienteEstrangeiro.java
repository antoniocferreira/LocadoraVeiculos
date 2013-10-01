package cliente;

import java.util.Collection;
import java.util.Date;

import basicas.CartaoCredito;
import basicas.Endereco;
import basicas.EnderecoEstadia;
import basicas.Habilitacao;

public class ClienteEstrangeiro {
	private String nome;
	private String numeroPassaporte;
	private String validade;
	private Date nascimento;
	private Endereco endereco;
	private EnderecoEstadia endEstadia;
	private String telefone;
	private String celular;
	private String email;
	private String observacao;
	private Habilitacao habilitacao;
	private Collection <CartaoCredito> cataoCredito;
	
	//Construtor
	public ClienteEstrangeiro() {

	}

	public ClienteEstrangeiro(String nome, String numeroPassaporte,
			String validade, Date nascimento, Endereco endereco,
			EnderecoEstadia endEstadia, String telefone, String celular,
			String email, String observacao, Habilitacao habilitacao,
			Collection<CartaoCredito> cataoCredito) {
		super();
		this.nome = nome;
		this.numeroPassaporte = numeroPassaporte;
		this.validade = validade;
		this.nascimento = nascimento;
		this.endereco = endereco;
		this.endEstadia = endEstadia;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.observacao = observacao;
		this.habilitacao = habilitacao;
		this.cataoCredito = cataoCredito;
	}
	
	//Gets e Sets

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroPassaporte() {
		return numeroPassaporte;
	}

	public void setNumeroPassaporte(String numeroPassaporte) {
		this.numeroPassaporte = numeroPassaporte;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
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

	public EnderecoEstadia getEndEstadia() {
		return endEstadia;
	}

	public void setEndEstadia(EnderecoEstadia endEstadia) {
		this.endEstadia = endEstadia;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Habilitacao getHabilitacao() {
		return habilitacao;
	}

	public void setHabilitacao(Habilitacao habilitacao) {
		this.habilitacao = habilitacao;
	}

	public Collection<CartaoCredito> getCataoCredito() {
		return cataoCredito;
	}

	public void setCataoCredito(Collection<CartaoCredito> cataoCredito) {
		this.cataoCredito = cataoCredito;
	}
	
	
	
	

}
