package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceRedConocimiento")
public interface IServiceRedConocimiento {
	public String consultarRedesConocimiento();
	public String insertarRedConocimiento(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,@WebParam(name="pais") String pais,
			@WebParam(name="fechaInicio") String fechaInicio,@WebParam(name="investigadorPrincipal") String investigadorPincipal,
			@WebParam(name="nombreComunidad") String nombreComunidad,@WebParam(name="paginaWeb") String paginaWeb,@WebParam(name="liderRed") boolean liderRed,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado, 
			@WebParam(name="codigoGrupoInvestigacion") String codigoGrupoInvestigacion);
}