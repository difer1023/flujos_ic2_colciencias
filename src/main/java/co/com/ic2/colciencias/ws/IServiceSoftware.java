package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceSoftware")
public interface IServiceSoftware {
	public String consultarSoftwares();
	public String insertarSoftware(@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,
			@WebParam(name="numeroRegistroDerechosAutor") int numeroRegistroDerechosAutor,@WebParam(name="ano") int ano,
			@WebParam(name="descripcion") String descripcion, @WebParam(name="codProyectoColciencias") int codProyectoColciencias, @WebParam(name="certificacion") boolean certificacion,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
}

