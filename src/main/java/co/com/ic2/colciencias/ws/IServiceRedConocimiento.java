package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.RedConocimiento;

@WebService(name="serviceRedConocimiento")
public interface IServiceRedConocimiento {
	
	public String consultarClasificacionRedesConocimiento(int codigoGrupo);
	
	public List<RedConocimiento> consultarRedesConocimiento();
	
	public List<RedConocimiento> consultarRedesConocimientoGrupo();
	
	public String insertarRedConocimiento(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,@WebParam(name="pais") String pais,
			@WebParam(name="fechaInicio") String fechaInicio,@WebParam(name="investigadorPrincipal") String investigadorPincipal,
			@WebParam(name="nombreComunidad") String nombreComunidad,@WebParam(name="paginaWeb") String paginaWeb,@WebParam(name="liderRed") boolean liderRed,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado, 
			@WebParam(name="codigoGrupoInvestigacion") String codigoGrupoInvestigacion);
	
	public String insertarRedesConocimiento(@WebParam(name="codigoGrupo") String codigo,@WebParam(name="redesConocimiento") ArrayList<RedConocimiento> redesConocimiento);
}