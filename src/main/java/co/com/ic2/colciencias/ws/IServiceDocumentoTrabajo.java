package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceDocumentoTrabajo")
public interface IServiceDocumentoTrabajo {
	public String consultarDocumentoTrabajo();
	public String insertarDocumentoTrabajo(@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,
			@WebParam(name="ano") int ano,@WebParam(name="paginaWeb") String paginaWeb,@WebParam(name="doi") String doi,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
}