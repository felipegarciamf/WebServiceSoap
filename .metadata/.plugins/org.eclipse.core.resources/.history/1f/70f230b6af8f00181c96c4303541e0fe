package impacta.ead.jp.estacionamento.apresentacao;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import impacta.ead.jp.estacionamento.integracao.StatusBean;
import impacta.ead.jp.estacionamento.integracao.TesteBean;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface StatusEstacionamentoService {

	@WebMethod
	public StatusBean getStatus();

	@WebMethod
	public TesteBean getTeste();
	
}
