package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceTrabajoGrado")
public interface IServiceTrabajoGrado {
	public String consultarTrabajosGrado();
	public String insertarTrabajoGrado(@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,
			@WebParam(name="autor") String autor,@WebParam(name="institucion") String institucion,@WebParam(name="ano") String ano,
			@WebParam(name="aprobado") boolean aprobado,@WebParam(name="distincion") String distincion,@WebParam(name="tipoTrabajo") String tipoTrabajo,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
}