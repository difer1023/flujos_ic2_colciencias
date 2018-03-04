package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceInformeFinalInvestigacion")
public interface IServiceInformeFinalInvestigacion {
	public String consultarInformesFinalesInvestigacion();
	public String insertarInformeFinalInvestigacion(@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,
			@WebParam(name="nombreProyecto") String nombreProyecto,@WebParam(name="fechaElaboracion") String fechaElaboracion,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
}
