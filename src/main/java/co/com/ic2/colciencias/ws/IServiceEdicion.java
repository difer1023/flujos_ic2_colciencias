package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceEdicion")
public interface IServiceEdicion {
	public String consultarEdiciones();
	public String insertarEdicion(@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,
			@WebParam(name="isbn") String isbn,@WebParam(name="issn") String issn,@WebParam(name="editor") String editor,
			@WebParam(name="fechaEditor") String fechaEditor,@WebParam(name="ano") String ano,@WebParam(name="paginaWeb") String paginaWeb,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado,@WebParam(name="codigoGrupoInvestigacion") String codigoGrupoInvestigacion);
}

