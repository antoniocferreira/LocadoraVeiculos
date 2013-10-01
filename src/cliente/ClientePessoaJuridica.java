package cliente;

import java.util.Date;

import basicas.Endereco;
import basicas.Pessoa;

/*razao social
cnpf
IE
Fundacao*/

public class ClientePessoaJuridica extends Pessoa{
	private String razaoSocial;
	private String cnpj;
	private String iE;
	private String fundacao;
	
	
	public ClientePessoaJuridica() {
	}


	public ClientePessoaJuridica(String nome, String cpf, String rg,
			String emissor, Date nascimento, Endereco endereco,
			String telefone, String celular, String email, String razaoSocial, String cnpj, String iE,
			String fundacao) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.iE = iE;
		this.fundacao = fundacao;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getiE() {
		return iE;
	}


	public void setiE(String iE) {
		this.iE = iE;
	}


	public String getFundacao() {
		return fundacao;
	}


	public void setFundacao(String fundacao) {
		this.fundacao = fundacao;
	}



	
	
	
	

}
