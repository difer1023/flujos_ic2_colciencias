package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.EsquemaCircuito;

@WebService(name = "serviceEsquemaCircuito")
public interface IServiceEsquemaCircuito {
	
	public String consultarClasificacionEsquemasCircuito(int codigoGrupo);
	
	public List<EsquemaCircuito> consultarEsquemasCircuito();

	public List<EsquemaCircuito> consultarEsquemasCircuitoGrupo(int codigoGrupo);

	public String insertarEsquemaCircuito(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "numeroRegistro") String numeroRegistro,
			@WebParam(name = "tituloRegistro") String tituloRegistro, @WebParam(name = "ano") int ano,
			@WebParam(name = "paisObtencion") int paisObtencion, @WebParam(name = "contrato") boolean contrato,
			@WebParam(name = "categoria") String categoria, @WebParam(name = "clasificado") boolean clasificado);

	public String insertarEsquemasCircuito(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "esquemas") ArrayList<EsquemaCircuito> esquemas);
}