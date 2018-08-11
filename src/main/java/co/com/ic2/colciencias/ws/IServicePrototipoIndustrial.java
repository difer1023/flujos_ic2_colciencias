package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.PrototipoIndustrial;

@WebService(name="servicePrototipoIndustrial")
public interface IServicePrototipoIndustrial {Object clone() throws CloneNotSupportedException;

	public String consultarClasificacionPrototiposIndustriales(int codigoGrupo);

	public List<PrototipoIndustrial> consultarPrototiposIndustriales();
	
	public List<PrototipoIndustrial> consultarPrototiposIndustrialesGrupo(int codigoGrupo);
	
	public String insertarPrototipoIndustrial(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,
			@WebParam(name="fecha") String fecha,@WebParam(name="institucionFinanciadora") String institucionFinanciadora,
			@WebParam(name="paisObtencion") int paisObtencion,@WebParam(name="categoria") String categoria,
			@WebParam(name="clasificado") boolean clasificado);
	
	public String insertarPrototiposIndustriales(@WebParam(name="codigoGrupo") String codigo,@WebParam(name="prototiposIndustriales") ArrayList<PrototipoIndustrial> prototiposIdustriales);
}
