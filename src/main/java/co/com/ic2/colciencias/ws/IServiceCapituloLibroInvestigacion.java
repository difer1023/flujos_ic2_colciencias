package co.com.ic2.colciencias.ws;

import java.util.ArrayList;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.CapituloLibroPublicado;

@WebService(name="serviceCapituloLibroInvestigacion")
public interface IServiceCapituloLibroInvestigacion {
	public String consultarCapitulosLibrosInvestigacion();
	public String insertarCapituloLibroInvestigacion(@WebParam(name="codigo") String codigo,@WebParam(name="isbnLibro") String isbnLibro,
			@WebParam(name="tituloCapitulo") String tituloCapitulo,@WebParam(name="fechaPublicacion") String fechaPublicacion,
			@WebParam(name="validacionInvestigacion") boolean validacionInvestigacion,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado,
			@WebParam(name="certificadoValidacion") boolean certificadoValidacion);
	
	public String insertarCapitulosLibroInvestigacion(@WebParam(name="codigoGrupo") String codigoGrupo,@WebParam(name="capitulosLibro") ArrayList<CapituloLibroPublicado> capitulosLibro);
}