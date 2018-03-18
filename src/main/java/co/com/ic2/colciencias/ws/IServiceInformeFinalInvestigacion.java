package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.InformeFinalInvestigacion;

@WebService(name = "serviceInformeFinalInvestigacion")
public interface IServiceInformeFinalInvestigacion {
	public List<InformeFinalInvestigacion> consultarInformesFinalesInvestigacion();

	public List<InformeFinalInvestigacion> consultarInformesFinalesInvestigacionGrupo(int codigoGrupo);

	public String insertarInformeFinalInvestigacion(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "titulo") String titulo, @WebParam(name = "nombreProyecto") String nombreProyecto,
			@WebParam(name = "fechaElaboracion") String fechaElaboracion,
			@WebParam(name = "categoria") String categoria, @WebParam(name = "clasificado") boolean clasificado);

	public String insertarInformesFinalesInvestigacion(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "informesFinales") ArrayList<InformeFinalInvestigacion> informesFinales);
}
