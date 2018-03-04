package co.com.ic2.colciencias.ws;

import java.util.ArrayList;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.GrupoInvestigacion;


@WebService(name="serviceGrupoInvestigacion")
public interface IServiceGrupoInvestigacion {
	public ArrayList<GrupoInvestigacion> consultarGruposInvestigacion();
	public String insertarGrupoInvestigacion(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre);
}
