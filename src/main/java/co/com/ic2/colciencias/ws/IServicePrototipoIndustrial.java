package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="servicePrototipoIndustrial")
public interface IServicePrototipoIndustrial {
	public String consultarPrototiposIndustriales();
	public String insertarPrototipoIndustrial(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,
			@WebParam(name="fecha") String fecha,@WebParam(name="institucionFinanciadora") String institucionFinanciadora,
			@WebParam(name="paisObtencion") int paisObtencion,@WebParam(name="categoria") String categoria,
			@WebParam(name="clasificado") boolean clasificado);
}
