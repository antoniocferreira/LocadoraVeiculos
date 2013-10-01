package basicas;

import java.util.Date;


public class Habilitacao {
	
	private String registroCNH;
	private String categoriaCNH;
	private Date espedicaoCNH;
	private Date validadeCNH;
	
	//Construtores
	public Habilitacao(){
	}

	public Habilitacao(String registroCNH, String categoriaCNH,
			Date espedicaoCNH, Date validadeCNH) {
		super();
		this.registroCNH = registroCNH;
		this.categoriaCNH = categoriaCNH;
		this.espedicaoCNH = espedicaoCNH;
		this.validadeCNH = validadeCNH;
	}

	//gets e sets
	public String getRegistroCNH() {
		return registroCNH;
	}

	public void setRegistroCNH(String registroCNH) {
		this.registroCNH = registroCNH;
	}

	public String getCategoriaCNH() {
		return categoriaCNH;
	}

	public void setCategoriaCNH(String categoriaCNH) {
		this.categoriaCNH = categoriaCNH;
	}

	public Date getEspedicaoCNH() {
		return espedicaoCNH;
	}

	public void setEspedicaoCNH(Date espedicaoCNH) {
		this.espedicaoCNH = espedicaoCNH;
	}

	public Date getValidadeCNH() {
		return validadeCNH;
	}

	public void setValidadeCNH(Date validadeCNH) {
		this.validadeCNH = validadeCNH;
	}
	
	
	
	

}
