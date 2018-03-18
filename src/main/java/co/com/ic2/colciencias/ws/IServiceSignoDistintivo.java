package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.SignoDistintivo;

@WebService(name = "serviceSignoDistintivo")
public interface IServiceSignoDistintivo {
	public List<SignoDistintivo> consultarSignosDistintivos();

	public List<SignoDistintivo> consultarSignosDistintivosGrupo(int codigoGrupo);

	public String insertarSignoDistintivo(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "numeroRegistro") String numeroRegistro, @WebParam(name = "titulo") String titulo,
			@WebParam(name = "ano") int ano, @WebParam(name = "mes") int mes,
			@WebParam(name = "certificadoRegistro") boolean certificadoRegistro,
			@WebParam(name = "condicionesUso") String condicionesUso,
			@WebParam(name = "paisObtencion") int paisObtencion, @WebParam(name = "categoria") String categoria,
			@WebParam(name = "clasificado") boolean clasificado);

	public String insertarSignoDistintivos(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "signosDistintivos") ArrayList<SignoDistintivo> signoDistintivo);
}