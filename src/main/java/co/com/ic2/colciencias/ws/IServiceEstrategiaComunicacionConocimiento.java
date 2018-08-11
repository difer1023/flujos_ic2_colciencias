package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.EstrategiaComunicacionConocimiento;

@WebService(name = "serviceEstrategiaComunicacionConocimiento")
public interface IServiceEstrategiaComunicacionConocimiento {
	
	public String consultarClasificacionEstrategiasComunicacionConocimiento(int codigoGrupo);
	
	public List<EstrategiaComunicacionConocimiento> consultarEstrategiasComunicacionConocimiento();

	public List<EstrategiaComunicacionConocimiento> consultarEstrategiasComunicacionConocimientoGrupo(int codigoGrupo);

	public String insertarEstrategiaComunicacionConocimiento(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "nombre") String nombre, @WebParam(name = "fechaInicio") String fechaInicio,
			@WebParam(name = "lider") String lider, @WebParam(name = "nombreComunidad") String nombreComunidad,
			@WebParam(name = "certificacion") boolean certificacion, @WebParam(name = "categoria") String categoria,
			@WebParam(name = "clasificado") boolean clasificado);

	public String insertarEstrategiasComunicacionConocimiento(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "estrategiasComunicacion") ArrayList<EstrategiaComunicacionConocimiento> estrategiasComunicacion);
}
