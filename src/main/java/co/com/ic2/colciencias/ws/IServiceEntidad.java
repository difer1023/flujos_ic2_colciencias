package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceEntidad")
public interface IServiceEntidad {
	public String consultarEntidades();
	public String insertarEntidad(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,
			@WebParam(name="institucion") boolean institucion);
}
