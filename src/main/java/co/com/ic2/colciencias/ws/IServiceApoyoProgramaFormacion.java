package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceApoyoProgramaFormacion")
public interface IServiceApoyoProgramaFormacion {
	public String consultarApoyoProgramasFormacion ();
	public String insertarApoyoProgramaFormacion (@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,
			@WebParam(name="institucion") String institucion,@WebParam(name="facultad") String facultad,
			@WebParam(name="departamento") String departamento,@WebParam(name="idActoAdministrativo") String idActoAdmin,
			@WebParam(name="numeroActoAdministrativo") String numeroActoAdministrativo,@WebParam(name="fecha") String fecha,
			@WebParam(name="tipoApoyo") String tipoApoyo,@WebParam(name="categoria") String categoria,
			@WebParam(name="clasificado") boolean clasificado);
}
