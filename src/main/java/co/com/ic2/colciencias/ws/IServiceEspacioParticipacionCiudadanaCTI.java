package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceEspacioParticipacionCiudadanaCTI")
public interface IServiceEspacioParticipacionCiudadanaCTI {
	public String consultarParticipacionesCiudadanasProyectosCTI();
	public String insertarParticipacionCiudadanaProyectoCTI(@WebParam(name="codigo") String codigo,@WebParam(name="nombreEspacio") String nombreEspacio,
			@WebParam(name="fechaInicio") String fechaInicio,@WebParam(name="nombreComunidad") String nombreComunidad,
			@WebParam(name="constanciaParticipacion") boolean constanciaParticipacion,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
}
