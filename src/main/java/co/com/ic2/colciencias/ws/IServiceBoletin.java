package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceBoletin")
public interface IServiceBoletin {
	public String consultarClasificacionBoletines(int codigoGrupo);
	public String consultarBoletines();
	public String insertarBoletin(@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,
			@WebParam(name="fechaElaboracion") String fechaElaboracion,@WebParam(name="editor") String editor,
			@WebParam(name="institucion") String institucion,@WebParam(name="categoria") String categoria,
			@WebParam(name="clasificado") boolean clasificado);
}
