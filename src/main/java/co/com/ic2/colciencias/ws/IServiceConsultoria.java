package co.com.ic2.colciencias.ws;

import java.util.ArrayList;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.Consultoria;

@WebService(name="serviceConsultoria")
public interface IServiceConsultoria {
	public String consultarConsultorias();
	public String insertarConsultoria(@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,
			@WebParam(name="numeroContrato") String numeroContrato,@WebParam(name="fecha") String fecha,
			@WebParam(name="certificacionEmpresa") boolean certificacionEmpresa,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
	
	public String insertarConsultorias(@WebParam(name="codigoGrupo") String codigoGrupo,@WebParam(name="consultorias") ArrayList<Consultoria> consultorias);
}