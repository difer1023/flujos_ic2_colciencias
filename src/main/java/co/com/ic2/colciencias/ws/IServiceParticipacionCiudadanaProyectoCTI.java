package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceParticipacionCiudadanaProyectoCTI")
public interface IServiceParticipacionCiudadanaProyectoCTI {
	public String consultarParticipacionesCiudadanasProyectosCTI();
	public String insertarParticipacionCiudadanaProyectoCTI(@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,
			@WebParam(name="fechaInicio") String fechaInicio,@WebParam(name="nombreComunidad") String nombreComunidad,
			@WebParam(name="investigadorPrincipal") String investigadorPrincipal,@WebParam(name="constanciaParticipacion") boolean constanciaParticipacion,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado,
			@WebParam(name="codigoGrupoInvestigacion") boolean codigoGrupoInvestigacion);
}