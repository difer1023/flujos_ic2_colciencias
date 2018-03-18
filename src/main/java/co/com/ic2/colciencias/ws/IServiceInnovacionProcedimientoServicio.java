package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.InnovacionProcedimientoServicio;

@WebService(name = "serviceInnovacionProcedimientoServicio")
public interface IServiceInnovacionProcedimientoServicio {
	public List<InnovacionProcedimientoServicio> consultarInnovacionesProcedimientosServicios();

	public List<InnovacionProcedimientoServicio> consultarInnovacionesProcedimientosServiciosGrupo(int codigoGrupo);

	public String insertarInnovacionProcedimientoServicio(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "nombre") String nombre, @WebParam(name = "fecha") String fecha,
			@WebParam(name = "nombreEmpresa") String nombreEmpresa, @WebParam(name = "nit") String nit,
			@WebParam(name = "certificadoImplementacionP") boolean certificadoImplementacionP,
			@WebParam(name = "certificadoImplementacionM") boolean certificadoImplementacionM,
			@WebParam(name = "certificadoImplementacionG") boolean certificadoImplementacionG,
			@WebParam(name = "categoria") String categoria, @WebParam(name = "clasificado") boolean clasificado);

	public String insertarInnovacionesProcedimientosServicios(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "innovaciones") ArrayList<InnovacionProcedimientoServicio> innovaciones);
}
