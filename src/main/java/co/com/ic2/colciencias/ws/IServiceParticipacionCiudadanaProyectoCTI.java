package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.ParticipacionCiudadanaProyectoCTI;

@WebService(name = "serviceParticipacionCiudadanaProyectoCTI")
public interface IServiceParticipacionCiudadanaProyectoCTI {
	public List<ParticipacionCiudadanaProyectoCTI> consultarParticipacionesCiudadanasProyectosCTI();

	public List<ParticipacionCiudadanaProyectoCTI> consultarParticipacionesCiudadanasProyectosCTIGrupo(int codigoGrupo);

	public String insertarParticipacionCiudadanaProyectoCTI(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "titulo") String titulo, @WebParam(name = "fechaInicio") String fechaInicio,
			@WebParam(name = "nombreComunidad") String nombreComunidad,
			@WebParam(name = "investigadorPrincipal") String investigadorPrincipal,
			@WebParam(name = "constanciaParticipacion") boolean constanciaParticipacion,
			@WebParam(name = "categoria") String categoria, @WebParam(name = "clasificado") boolean clasificado,
			@WebParam(name = "codigoGrupoInvestigacion") boolean codigoGrupoInvestigacion);

	public String insertarParticipacionesCiudadanasProyectosCTI(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "participacionesCti") ArrayList<ParticipacionCiudadanaProyectoCTI> participacionesCti);
}