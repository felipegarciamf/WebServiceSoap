package impacta.ead.jp.estacionamento.integracao;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StatusBean {
	
	@XmlElement
	private int vagasLivres;
	
	@XmlElement
	private int vagasOcupadas;
	
	@XmlElement
	private double faturamentoDia;


	@XmlElement
	private int teste;
	
	
	public StatusBean() {}
	
	public StatusBean(int livres, int ocupadas, double faturamento, int teste) {
		this.vagasLivres = livres;
		this.vagasOcupadas = ocupadas;
		this.faturamentoDia = faturamento;
		this.teste = teste;
	}
	
	public int getVagasLivres() {
		return vagasLivres;
	}

	public int getVagasOcupadas() {
		return vagasOcupadas;
	}

	public double getFaturamentoDia() {
		return faturamentoDia;
	}
	
	public int getTeste() {
		return teste;
	}


	
	
}
