package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceLibroInvestigacion")
public interface IServiceLibroInvestigacion {
	public String consultarLibrosInvestigacion();
	public String insertarLibroInvestigacion(@WebParam(name="codigo") String codigo,@WebParam(name="isbn") String isbn,
			@WebParam(name="fechaPublicacion") String fechaPublicacion,@WebParam(name="validacionInvestigacion") boolean validacionInvestigacion,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado,
			@WebParam(name="certificadoValidacion") boolean certificadoValidacion);
}
