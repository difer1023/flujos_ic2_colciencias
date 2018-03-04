package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceProyecto")
public interface IServiceProyectoExtensionCTI {
	public String consultarProyectosExtensionCTI();
	public String insertarProyectoExtensionCTI(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,
			@WebParam(name="fechaInicio") String fechaInicio,@WebParam(name="fechaFin") String fechaFin,
			@WebParam(name="nombreComunidad") String financiacion,@WebParam(name="resumenCtel") String resumenCtel,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
}