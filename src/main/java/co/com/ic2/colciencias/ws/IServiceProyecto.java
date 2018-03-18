package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.Proyecto;

@WebService(name = "serviceProyecto")
public interface IServiceProyecto {
	public List<Proyecto> consultarProyectos();

	public List<Proyecto> consultarProyectosGrupo(int codigoGrupo);

	public String insertarProyecto(@WebParam(name = "codigo") String codigo, @WebParam(name = "titulo") String titulo,
			@WebParam(name = "institucion") String institucion,
			@WebParam(name = "entidadFinanciadora") String entidadFinanciadora,
			@WebParam(name = "financiacion") String financiacion, @WebParam(name = "actoAdmin") boolean actoAdmin,
			@WebParam(name = "ano") String ano, @WebParam(name = "numeroContrato") String numeroContrato,
			@WebParam(name = "tipoProyecto") String tipoProyecto, @WebParam(name = "categoria") String categoria,
			@WebParam(name = "clasificado") boolean clasificado);

	public String insertarProyectos(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "proyectos") ArrayList<Proyecto> proyectos);
}
