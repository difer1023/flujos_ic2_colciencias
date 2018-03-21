package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.ProyectoExtensionCTI;

@WebService(name = "serviceProyectoExtensionCTI")
public interface IServiceProyectoExtensionCTI {
	public List<ProyectoExtensionCTI> consultarProyectosExtensionCTI();

	public List<ProyectoExtensionCTI> consultarProyectosExtensionCTIGrupo(int codigoGrupo);

	public String insertarProyectoExtensionCTI(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "nombre") String nombre, @WebParam(name = "fechaInicio") String fechaInicio,
			@WebParam(name = "fechaFin") String fechaFin, @WebParam(name = "nombreComunidad") String financiacion,
			@WebParam(name = "resumenCtel") String resumenCtel, @WebParam(name = "categoria") String categoria,
			@WebParam(name = "clasificado") boolean clasificado);

	public String insertarProyectosExtensionCTI(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "proyectosExtension") ArrayList<ProyectoExtensionCTI> proyectosExtension);
}