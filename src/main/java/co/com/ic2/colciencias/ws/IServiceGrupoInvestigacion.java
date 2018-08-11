package co.com.ic2.colciencias.ws;

import java.util.ArrayList;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.GrupoInvestigacion;


@WebService(name="serviceGrupoInvestigacion")
public interface IServiceGrupoInvestigacion {
	
	public String consultarClasificacionesGrupoInvestigacion(int codigoGrupo,int anoFinVentanaObservacion);
	
	public ArrayList<GrupoInvestigacion> consultarGruposInvestigacion();
	public GrupoInvestigacion consultarGrupoInvestigacion(@WebParam(name="codigo") int codigo);
	public int insertarGrupoInvestigacion(@WebParam(name="nombre") String nombre);
}
