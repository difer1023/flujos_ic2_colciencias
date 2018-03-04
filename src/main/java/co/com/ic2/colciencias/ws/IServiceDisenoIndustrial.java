package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceDisenoIndustrial")
public interface IServiceDisenoIndustrial {
	public String consultarDisenosIndustriales();
	public String insertarDisenoIndustrial(@WebParam(name="codigo") String codigo,@WebParam(name="numeroRegistro") String numeroRegistro,
			@WebParam(name="tituloRegistro") int tituloRegistro,@WebParam(name="ano") int ano,
			@WebParam(name="gaceta") int gaceta, @WebParam(name="paisObtencion") int paisObtencion, @WebParam(name="contrato") int contrato,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
}
