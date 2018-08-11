package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.Consultoria;

@WebService(name="serviceConsultoria")
public interface IServiceConsultoria {
	
	public String consultarClasificacionConsultorias(int codigoGrupo);
	
	public List<Consultoria> consultarConsultorias();
	
	public List<Consultoria> consultarConsultoriasGrupo(int codigoGrupo);
	
	public String insertarConsultoria(@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,
			@WebParam(name="numeroContrato") String numeroContrato,@WebParam(name="fecha") String fecha,
			@WebParam(name="certificacionEmpresa") boolean certificacionEmpresa,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
	
	public String insertarConsultorias(@WebParam(name="codigoGrupo") String codigoGrupo,@WebParam(name="consultorias") ArrayList<Consultoria> consultorias);
}