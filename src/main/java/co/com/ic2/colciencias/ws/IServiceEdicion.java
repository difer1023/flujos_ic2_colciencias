package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.Edicion;

@WebService(name = "serviceEdicion")
public interface IServiceEdicion {
	public List<Edicion> consultarEdiciones();

	public List<Edicion> consultarEdicionesGrupo(int codigoGrupo);

	public String insertarEdicion(@WebParam(name = "codigo") String codigo, @WebParam(name = "titulo") String titulo,
			@WebParam(name = "isbn") String isbn, @WebParam(name = "issn") String issn,
			@WebParam(name = "editor") String editor, @WebParam(name = "fechaEditor") String fechaEditor,
			@WebParam(name = "ano") String ano, @WebParam(name = "paginaWeb") String paginaWeb,
			@WebParam(name = "categoria") String categoria, @WebParam(name = "clasificado") boolean clasificado,
			@WebParam(name = "codigoGrupoInvestigacion") String codigoGrupoInvestigacion);

	public String insertarEdiciones(@WebParam(name = "codigoGrupo") String codigoGrupo,
			@WebParam(name = "ediciones") ArrayList<Edicion> ediciones);
}
