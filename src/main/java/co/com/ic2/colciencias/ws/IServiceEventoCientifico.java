package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.EventoCientifico;

@WebService(name = "serviceEventoCientifico")
public interface IServiceEventoCientifico {
	
	public String consultarClasificacionEventosCientificos(int codigoGrupo);
	
	public List<EventoCientifico> consultarEventosCientificos();

	public List<EventoCientifico> consultarEventosCientificosGrupo(int codigoGrupo);

	public String insertarEventoCientifico(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "nombre") String nombre, @WebParam(name = "fechaInicio") String fechaInicio,
			@WebParam(name = "fechaFin") String fechaFin,
			@WebParam(name = "entidadPatrocinadora") String entidadPatrocinadora,
			@WebParam(name = "tipoParticipacion") String tipoParticipacion);

	public String insertarEventosCientificos(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "eventosCientificos") ArrayList<EventoCientifico> eventosCientificos);
}
