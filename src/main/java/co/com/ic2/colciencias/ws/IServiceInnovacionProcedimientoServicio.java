package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceInnovacionProcedimientoServicio")
public interface IServiceInnovacionProcedimientoServicio {
	public String consultarLibrosInvestigacion();
	public String insertarLibroInvestigacion(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,
			@WebParam(name="fecha") String fecha,@WebParam(name="nombreEmpresa") String nombreEmpresa,@WebParam(name="nit") String nit,
			@WebParam(name="certificadoImplementacionP") boolean certificadoImplementacionP,@WebParam(name="certificadoImplementacionM") boolean certificadoImplementacionM,
			@WebParam(name="certificadoImplementacionG") boolean certificadoImplementacionG,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
}
