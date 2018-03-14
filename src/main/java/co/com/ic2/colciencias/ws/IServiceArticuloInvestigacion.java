package co.com.ic2.colciencias.ws;

import java.util.ArrayList;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.ArticuloInvestigacion;

@WebService(name="serviceArticuloInvestigacion")
public interface IServiceArticuloInvestigacion {
	public String consultarArticulosInvestigacion();
	public String insertarArticuloInvestigacion(@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,@WebParam(name="ano") int ano,@WebParam(name="mes") int mes,
			@WebParam(name="volumen") int volumen, @WebParam(name="paginaInicial") int paginaInicial, @WebParam(name="paginaFinal") int paginaFinal,@WebParam(name="issnRevista") int issnRevista,@WebParam(name="paginaWeb") String PaginaWeb,
			@WebParam(name="doi") String doi, @WebParam(name="paisPublicacion") String paisPublicacion,@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
	
	public String insertarArticulosInvestigacion(@WebParam(name="codigoGrupo") String codigo,@WebParam(name="articulos") ArrayList<ArticuloInvestigacion> articulos);
}
