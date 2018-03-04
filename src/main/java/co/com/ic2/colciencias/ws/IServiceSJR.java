package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceSJR")
public interface IServiceSJR {
	public String consultarClasificacionesSJR();
	public String insertarClasificacionSJR(@WebParam(name="issn") int issn,@WebParam(name="ano") int ano,
			@WebParam(name="cuartil") String cuartil,@WebParam(name="categoria") int categoria);
	
	public String consultarCategoriasSJR();
	public String insertarCategoriaSJR(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre);
}
