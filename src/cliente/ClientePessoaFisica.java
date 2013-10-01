package cliente;

import java.util.Collection;
import java.util.Date;

import basicas.CartaoCredito;
import basicas.Endereco;
import basicas.Habilitacao;
import basicas.Pessoa;

public class ClientePessoaFisica extends Pessoa {
	private String observacao;
	private Habilitacao habilitacao;
	private Collection <CartaoCredito> cataoCredito;
	private long limiteAprovado;
	
	public ClientePessoaFisica(){
		
	}

	public ClientePessoaFisica(String nome, String cpf, String rg, String emissor,
			Date nascimento, Endereco endereco, String telefone, String celular,
			String email, String observacao, Habilitacao habilitacao,
			Collection<CartaoCredito> cataoCredito, long limiteAprovado) {
		super();
		this.observacao=observacao;
		this.habilitacao = habilitacao;
		this.cataoCredito = cataoCredito;
		this.limiteAprovado=limiteAprovado;
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

	public long getLimiteAprovado() {
		return limiteAprovado;
	}

	public void setLimiteAprovado(long limiteAprovado) {
		this.limiteAprovado = limiteAprovado;
	}

	
	
	
	

}
