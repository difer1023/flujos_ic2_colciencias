package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.DocumentoTrabajo;

@WebService(name = "serviceDocumentoTrabajo")
public interface IServiceDocumentoTrabajo {
	public List<DocumentoTrabajo> consultarDocumentoTrabajo();

	public List<DocumentoTrabajo> consultarDocumentoTrabajoGrupo(int codigoGrupo);

	public String insertarDocumentoTrabajo(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "titulo") String titulo, @WebParam(name = "ano") int ano,
			@WebParam(name = "paginaWeb") String paginaWeb, @WebParam(name = "doi") String doi,
			@WebParam(name = "categoria") String categoria, @WebParam(name = "clasificado") boolean clasificado);

	public String insertarDocumentosTrabajo(@WebParam(name = "codigoGrupo") String codigoGrupo,
			@WebParam(name = "documentosTrabajo") ArrayList<DocumentoTrabajo> documentosTrabajo);
}