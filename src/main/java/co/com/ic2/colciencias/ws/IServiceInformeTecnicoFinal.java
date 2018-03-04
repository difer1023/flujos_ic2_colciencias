package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceInformeTecnicoFinal")
public interface IServiceInformeTecnicoFinal {
	public String consultarInformesTecnicosFinales();
	public String insertarInformeTecnicoFinal(@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,
			@WebParam(name="tituloInvestigacion") String tituloInvestigacion,@WebParam(name="fecha") String fecha,
			@WebParam(name="certificacionEntidad") boolean certificacionEntidad,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
}