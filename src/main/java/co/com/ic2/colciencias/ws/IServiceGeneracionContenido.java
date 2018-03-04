package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceGeneracionContenido")
public interface IServiceGeneracionContenido {
	public String consultarGeneracionContenidosImpresos ();
	public String insertarGeneracionContenidoImpreso (@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,
			@WebParam(name="fechaPublicacion") int fechaPublicacion,@WebParam(name="medioCirculacion") String medioCirculacion,
			@WebParam(name="ambito") String ambito, @WebParam(name="lugarPublicacion") String lugarPublicacion, 
			@WebParam(name="certificacion") boolean certificacion,@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
	
	public String consultarGeneracionContenidosMultimedia ();
	public String insertarGeneracionContenidoMultimedia (@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,
			@WebParam(name="ambito") String ambito,@WebParam(name="comunidades") String comunidades,@WebParam(name="resumen") String resumen, 
			@WebParam(name="fecha") String fecha, @WebParam(name="medioCirculacion") String medioCirculacion,@WebParam(name="certificacion") boolean certificacion,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
	
	public String consultarGeneracionContenidosVirtuales ();
	public String insertarGeneracionContenidoVirtual (@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,
			@WebParam(name="comunidad") String comunidad,@WebParam(name="resumen") String resumen,@WebParam(name="fecha") String fecha, 
			@WebParam(name="medioCirculacion") String medioCirculacion, @WebParam(name="paginaWeb") String paginaWeb,@WebParam(name="certificacion") boolean certificacion,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
}
