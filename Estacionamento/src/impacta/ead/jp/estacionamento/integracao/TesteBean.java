package impacta.ead.jp.estacionamento.integracao;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TesteBean {
	
	public TesteBean() {
		
	}
	
	public TesteBean(String teste) {
		this.Teste = teste;
	}

	@XmlElement
	private String Teste;
	
	
	public String getTeste() {
		return Teste;
	}

}
