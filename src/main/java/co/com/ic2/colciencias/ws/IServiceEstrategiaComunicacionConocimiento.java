package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceEstrategiaComunicacionConocimiento")
public interface IServiceEstrategiaComunicacionConocimiento {
	public String consultarEstrategiasComunicacionConocimiento();
	public String insertarEstrategiaComunicacionConocimiento(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,
			@WebParam(name="fechaInicio") String fechaInicio,@WebParam(name="lider") String lider,@WebParam(name="nombreComunidad") String nombreComunidad,
			@WebParam(name="certificacion") boolean certificacion,@WebParam(name="categoria") String categoria,
			@WebParam(name="clasificado") boolean clasificado);
}
