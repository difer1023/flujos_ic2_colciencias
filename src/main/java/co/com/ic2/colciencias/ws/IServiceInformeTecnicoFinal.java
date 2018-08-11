package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.InformeTecnicoFinal;

@WebService(name = "serviceInformeTecnicoFinal")
public interface IServiceInformeTecnicoFinal {
	
	public String consultarClasificacionInformesTecnicosFinales(int codigoGrupo);
	
	public List<InformeTecnicoFinal> consultarInformesTecnicosFinales();

	public List<InformeTecnicoFinal> consultarInformesTecnicosFinalesGrupo(int codigoGrupo);

	public String insertarInformeTecnicoFinal(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "titulo") String titulo,
			@WebParam(name = "tituloInvestigacion") String tituloInvestigacion, @WebParam(name = "fecha") String fecha,
			@WebParam(name = "certificacionEntidad") boolean certificacionEntidad,
			@WebParam(name = "categoria") String categoria, @WebParam(name = "clasificado") boolean clasificado);

	public String insertarInformesTecnicosFinales(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "informesTecnicos") ArrayList<InformeTecnicoFinal> informesTecnicos);
}