package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.Software;

@WebService(name = "serviceSoftware")
public interface IServiceSoftware {
	
	public String consultarClasificacionSoftwares(int codigoGrupo);
	
	public List<Software> consultarSoftwares();

	public List<Software> consultarSoftwaresGrupo(int codigoGrupo);

	public String insertarSoftware(@WebParam(name = "codigo") String codigo, @WebParam(name = "titulo") String titulo,
			@WebParam(name = "numeroRegistroDerechosAutor") int numeroRegistroDerechosAutor,
			@WebParam(name = "ano") int ano, @WebParam(name = "descripcion") String descripcion,
			@WebParam(name = "codProyectoColciencias") int codProyectoColciencias,
			@WebParam(name = "certificacion") boolean certificacion, @WebParam(name = "categoria") String categoria,
			@WebParam(name = "clasificado") boolean clasificado);

	public String insertarSoftwares(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "softwares") ArrayList<Software> softwares);
}
