package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceConsultoria")
public interface IServiceConsultoria {
	public String consultarConsultorias();
	public String insertarConsultoria(@WebParam(name="codigo") String codigo,@WebParam(name="titulo") String titulo,
			@WebParam(name="numeroContrato") String numeroContrato,@WebParam(name="fecha") String fecha,
			@WebParam(name="certificacionEmpresa") boolean certificacionEmpresa,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
}