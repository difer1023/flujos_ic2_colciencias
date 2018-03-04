package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceRevista")
public interface IServiceRevista {
	public String consultarRevistas();
	public String insertarRevista(@WebParam(name="issn") String issn,@WebParam(name="nombre") String nombre);
}
