package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.GeneracionContenidoImpreso;
import co.com.ic2.colciencias.gruplac.productosInvestigacion.GeneracionContenidoMultimedia;
import co.com.ic2.colciencias.gruplac.productosInvestigacion.GeneracionContenidoVirtual;

@WebService(name = "serviceGeneracionContenido")
public interface IServiceGeneracionContenido {
	public List<GeneracionContenidoImpreso> consultarGeneracionContenidosImpresos();

	public List<GeneracionContenidoImpreso> consultarGeneracionContenidosImpresosGrupo(int codigoGrupo);

	public String insertarGeneracionContenidoImpreso(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "titulo") String titulo, @WebParam(name = "fechaPublicacion") int fechaPublicacion,
			@WebParam(name = "medioCirculacion") String medioCirculacion, @WebParam(name = "ambito") String ambito,
			@WebParam(name = "lugarPublicacion") String lugarPublicacion,
			@WebParam(name = "certificacion") boolean certificacion, @WebParam(name = "categoria") String categoria,
			@WebParam(name = "clasificado") boolean clasificado);

	public String insertarGeneracionContenidosImpresos(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "contenidosImpresos") ArrayList<GeneracionContenidoImpreso> contenidosImpresos);

	public List<GeneracionContenidoMultimedia> consultarGeneracionContenidosMultimedia();

	public List<GeneracionContenidoMultimedia> consultarGeneracionContenidosMultimediaGrupo(int codigoGrupo);

	public String insertarGeneracionContenidoMultimedia(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "titulo") String titulo, @WebParam(name = "ambito") String ambito,
			@WebParam(name = "comunidades") String comunidades, @WebParam(name = "resumen") String resumen,
			@WebParam(name = "fecha") String fecha, @WebParam(name = "medioCirculacion") String medioCirculacion,
			@WebParam(name = "certificacion") boolean certificacion, @WebParam(name = "categoria") String categoria,
			@WebParam(name = "clasificado") boolean clasificado);

	public String insertarGeneracionContenidosMultimedia(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "contenidosMultimedia") ArrayList<GeneracionContenidoMultimedia> contenidosMultimedia);

	public List<GeneracionContenidoVirtual> consultarGeneracionContenidosVirtuales();

	public List<GeneracionContenidoVirtual> consultarGeneracionContenidosVirtualesGrupo(int codigoGrupo);

	public String insertarGeneracionContenidoVirtual(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "titulo") String titulo, @WebParam(name = "comunidad") String comunidad,
			@WebParam(name = "resumen") String resumen, @WebParam(name = "fecha") String fecha,
			@WebParam(name = "medioCirculacion") String medioCirculacion,
			@WebParam(name = "paginaWeb") String paginaWeb, @WebParam(name = "certificacion") boolean certificacion,
			@WebParam(name = "categoria") String categoria, @WebParam(name = "clasificado") boolean clasificado);

	public String insertarGeneracionContenidosVirtuales(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "contenidosVirtuales") ArrayList<GeneracionContenidoVirtual> contenidosVirtuales);
}
