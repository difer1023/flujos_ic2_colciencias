package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceJCR")
public interface IServiceJCR {
	public String consultarClasificacionesJCR();
	public String insertarClasificacionJCR(@WebParam(name="issn") int issn,@WebParam(name="ano") int ano,
			@WebParam(name="cuartil") String cuartil,@WebParam(name="categoria") int categoria);
	
	public String consultarCategoriasJCR();
	public String insertarCategoriaSJCR(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre);
}
