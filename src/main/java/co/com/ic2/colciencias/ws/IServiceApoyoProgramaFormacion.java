package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.ApoyoProgramaFormacion;

@WebService(name = "serviceApoyoProgramaFormacion")
public interface IServiceApoyoProgramaFormacion {
	public List<ApoyoProgramaFormacion> consultarApoyoProgramasFormacion();

	public List<ApoyoProgramaFormacion> consultarApoyoProgramasFormacionGrupo(int codigoGrupo);

	public String insertarApoyoProgramaFormacion(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "nombre") String nombre, @WebParam(name = "institucion") String institucion,
			@WebParam(name = "facultad") String facultad, @WebParam(name = "departamento") String departamento,
			@WebParam(name = "idActoAdministrativo") String idActoAdmin,
			@WebParam(name = "numeroActoAdministrativo") String numeroActoAdministrativo,
			@WebParam(name = "fecha") String fecha, @WebParam(name = "tipoApoyo") String tipoApoyo,
			@WebParam(name = "categoria") String categoria, @WebParam(name = "clasificado") boolean clasificado);

	public String insertarApoyosProgramaFormacion(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "apoyosProgramaFormacion") ArrayList<ApoyoProgramaFormacion> apoyosProgramaFormacion);

}
