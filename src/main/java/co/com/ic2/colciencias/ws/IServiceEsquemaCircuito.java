package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceEsquemaCiruito")
public interface IServiceEsquemaCircuito {
	public String consultarEsquemasCircuito();
	public String insertarEsquemaCircuito(@WebParam(name="codigo") String codigo,@WebParam(name="numeroRegistro") String numeroRegistro,
			@WebParam(name="tituloRegistro") String tituloRegistro,@WebParam(name="ano") int ano,
			@WebParam(name="paisObtencion") int paisObtencion, @WebParam(name="contrato") boolean contrato,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
}