package impacta.ead.jp.estacionamento.integracao;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import impacta.ead.jp.estacionamento.apresentacao.StatusEstacionamentoService;
import impacta.ead.jp.estacionamento.controle.EstacionamentoController;


@WebService(endpointInterface = "impacta.ead.jp.estacionamento.apresentacao.StatusEstacionamentoService")
public class StatusEstacionamentoServiceImpl implements StatusEstacionamentoService{

	@Override
	public StatusBean getStatus() {
		StatusBean bean = new EstacionamentoController().getStatusDia();
		return bean;
	}
	
	@Override
	public TesteBean getTeste() {
		TesteBean bean = new EstacionamentoController().getStatusTeste();
		return bean;
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/status&teste?WSDL", new StatusEstacionamentoServiceImpl());
	}
	
}
