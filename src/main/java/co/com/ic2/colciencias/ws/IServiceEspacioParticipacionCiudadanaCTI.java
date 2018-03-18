package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.EspacioParticipacionCiudadanaCTI;

@WebService(name="serviceEspacioParticipacionCiudadanaCTI")
public interface IServiceEspacioParticipacionCiudadanaCTI {
	public List<EspacioParticipacionCiudadanaCTI> consultarParticipacionesCiudadanasProyectosCTI();
	
	public List<EspacioParticipacionCiudadanaCTI> consultarParticipacionesCiudadanasProyectosCTIGrupo(int codigoGrupo);
	
	public String insertarParticipacionCiudadanaProyectoCTI(@WebParam(name="codigo") String codigo,@WebParam(name="nombreEspacio") String nombreEspacio,
			@WebParam(name="fechaInicio") String fechaInicio,@WebParam(name="nombreComunidad") String nombreComunidad,
			@WebParam(name="constanciaParticipacion") boolean constanciaParticipacion,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
	
	public String insertarParticipacionesCiudadanasProyectosCTI(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "participaciones") ArrayList<EspacioParticipacionCiudadanaCTI> participaciones);
}
