package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceProyecto")
public interface IServiceProyecto {
	public String consultarProyectos();
	public String insertarProyecto(@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,
			@WebParam(name="institucion") String institucion,@WebParam(name="entidadFinanciadora") String entidadFinanciadora,
			@WebParam(name="financiacion") String financiacion,@WebParam(name="actoAdmin") boolean actoAdmin,
			@WebParam(name="ano") String ano,@WebParam(name="numeroContrato") String numeroContrato,
			@WebParam(name="tipoProyecto") String tipoProyecto,@WebParam(name="categoria") String categoria,
			@WebParam(name="clasificado") boolean clasificado);
}

