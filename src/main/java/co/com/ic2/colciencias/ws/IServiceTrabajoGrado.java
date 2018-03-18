package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.TrabajoGrado;

@WebService(name = "serviceTrabajoGrado")
public interface IServiceTrabajoGrado {
	public List<TrabajoGrado> consultarTrabajosGrado();

	public List<TrabajoGrado> consultarTrabajosGradoGrupo(int codigoGrupo);

	public String insertarTrabajoGrado(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "titulo") String titulo, @WebParam(name = "autor") String autor,
			@WebParam(name = "institucion") String institucion, @WebParam(name = "ano") String ano,
			@WebParam(name = "aprobado") boolean aprobado, @WebParam(name = "distincion") String distincion,
			@WebParam(name = "tipoTrabajo") String tipoTrabajo, @WebParam(name = "categoria") String categoria,
			@WebParam(name = "clasificado") boolean clasificado);

	public String insertarTrabajosGrado(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "trabajosGrado") ArrayList<TrabajoGrado> trabajosGrado);
}