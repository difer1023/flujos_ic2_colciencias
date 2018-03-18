package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.LibroInvestigacion;

@WebService(name="serviceLibroInvestigacion")
public interface IServiceLibroInvestigacion {
	public List<LibroInvestigacion> consultarLibrosInvestigacion();
	
	public List<LibroInvestigacion> consultarLibrosInvestigacionGrupo(int codigoGrupo);

	public String insertarLibroInvestigacion(@WebParam(name="codigo") String codigo,@WebParam(name="isbn") String isbn,
			@WebParam(name="fechaPublicacion") String fechaPublicacion,@WebParam(name="validacionInvestigacion") boolean validacionInvestigacion,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado,
			@WebParam(name="certificadoValidacion") boolean certificadoValidacion);
	
	public String insertarLibrosInvestigacion(@WebParam(name="codigoGrupo") String codigo,@WebParam(name="libros") ArrayList<LibroInvestigacion> libros);
}
