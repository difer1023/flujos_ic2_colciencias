package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceEventoCientifico")
public interface IServiceEventoCientifico {
	public String consultarEventosCientificos();
	public String insertarEventoCientifico(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,
			@WebParam(name="fechaInicio") String fechaInicio,@WebParam(name="fechaFin") String fechaFin,
			@WebParam(name="entidadPatrocinadora") String entidadPatrocinadora,@WebParam(name="tipoParticipacion") String tipoParticipacion);
}
