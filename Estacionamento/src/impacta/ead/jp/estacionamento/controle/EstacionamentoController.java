package impacta.ead.jp.estacionamento.controle;

import impacta.ead.jp.estacionamento.integracao.StatusBean;
import impacta.ead.jp.estacionamento.integracao.TesteBean;
import impacta.ead.jp.estacionamento.negocio.Vaga;
import impacta.ead.jp.estacionamento.persistencia.DAOEstacionamento;

/**
 * Classe controladora que coordena todo o fluxo da informa��o 
 * e eventos do sistema.
 */
public class EstacionamentoController {
	

	/**
	 * Recupera o status das vagas do estacionamento  
	 * 
	 * @return status atual de vagas ocupadas no estaciomento
	 */
	public static int inicializarVagasOcupadas() {
		return new DAOEstacionamento().getVagasOcupadas();
	}

	public StatusBean getStatusDia() {
		StatusBean bean = null;
		
		int livres = Vaga.livres();
		int ocupadas = Vaga.getOcupadas();
		int teste = 33;
		double faturamento = new DAOEstacionamento().getFaturamentoCorrente();
		
		bean = new StatusBean(livres, ocupadas, faturamento, teste);
		
		return bean;
	}
	
	public TesteBean getStatusTeste() {
		
		TesteBean bean = null;
		
		String teste = "TESTE";
		
		bean = new TesteBean(teste);
		
		return bean;
	}



	
}
