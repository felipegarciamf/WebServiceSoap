package impacta.ead.jp.estacionamento.negocio;

import impacta.ead.jp.estacionamento.controle.EstacionamentoController;

/**
 * Representa o conceito de vaga do estacionamento.
 * 
 * As vagas do estacionamento n�o s�o identificadas, sendo, em teoria, semelhantes entre si.
 * 
 * Esta classe possui a informa��o de total de vagas do estacionamento, bem como a 
 * quantidade de vagas ocupadas at� o momento presente.
 * 
 */
public class Vaga {
	
	public static int TOTAL_VAGAS = 100;
	private static int vagasOcupadas = inicializaVagasOcupadas();
	
	private static int inicializaVagasOcupadas(){
		int ocupadas = EstacionamentoController.inicializarVagasOcupadas();
		return ocupadas;
	}

	/**
	 * Informa quantidade de vagas ocupadas 
	 * @return n�mero de vagas ocupadas
	 */
	public static int getOcupadas() {
		return vagasOcupadas;
	}

	/**
	 * Informa a quantidade de vagas livres no estacionamento
	 * @return quantidade de vagas livres
	 */
	public static int livres() {
		return (TOTAL_VAGAS - vagasOcupadas);
	}

}
