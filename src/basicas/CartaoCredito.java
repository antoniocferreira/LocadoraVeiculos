package basicas;

import java.util.Date;

public class CartaoCredito {
	
	private String numeroCartao;
	private String codCartao;
	private Date validade;
	
	public CartaoCredito() {
	
	}

	public CartaoCredito(String numeroCartao, String codCartao, Date validade) {
		super();
		this.numeroCartao = numeroCartao;
		this.codCartao = codCartao;
		this.validade = validade;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getCodCartao() {
		return codCartao;
	}

	public void setCodCartao(String codCartao) {
		this.codCartao = codCartao;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	
	

}
