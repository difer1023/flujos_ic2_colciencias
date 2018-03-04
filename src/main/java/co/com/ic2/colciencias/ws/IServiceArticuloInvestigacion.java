package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceArticuloInvestigacion")
public interface IServiceArticuloInvestigacion {
	public String consultarArticulosInvestigacion();
	public String insertarArticuloInvestigacion(@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,@WebParam(name="ano") int ano,@WebParam(name="mes") int mes,
			@WebParam(name="volumen") int volumen, @WebParam(name="paginaInicial") int paginaInicial, @WebParam(name="paginaFinal") int paginaFinal,@WebParam(name="issnRevista") int issnRevista,@WebParam(name="paginaWeb") String PaginaWeb,
			@WebParam(name="doi") String doi, @WebParam(name="paisPublicacion") String paisPublicacion,@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
}
