package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceSignoDistintivo")
public interface IServiceSignoDistintivo {
	public String consultarSignosDistintivos();
	public String insertarSignoDistintivo(@WebParam(name="codigo") String codigo,@WebParam(name="numeroRegistro") String numeroRegistro,
			@WebParam(name="titulo") String titulo,@WebParam(name="ano") int ano,@WebParam(name="mes") int mes,
			@WebParam(name="certificadoRegistro") boolean certificadoRegistro,@WebParam(name="condicionesUso") String condicionesUso,
			@WebParam(name="paisObtencion") int paisObtencion, 
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
}