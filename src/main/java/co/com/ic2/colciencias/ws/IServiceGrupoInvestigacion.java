package co.com.ic2.colciencias.ws;

import java.util.ArrayList;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.ClasificacionGrupo;
import co.com.ic2.colciencias.gruplac.GrupoInvestigacion;


@WebService(name="serviceGrupoInvestigacion")
public interface IServiceGrupoInvestigacion {
	
	public ClasificacionGrupo consultarClasificacionesGrupoInvestigacion(int codigoGrupo,int anoFinVentanaObservacion);
	public String consultarTiposProductosInvestigacion();
	public ClasificacionGrupo clasificarGrupoInvestigacion(@WebParam(name="jsonProductosGrupo") String jsonProductosGrupo,
			@WebParam(name="jsonPerfilesColaboracion") String jsonPerfilesColaboracion,
			@WebParam(name="anoFormacion") String anoFormacion);
	public ArrayList<GrupoInvestigacion> consultarGruposInvestigacion();
	public GrupoInvestigacion consultarGrupoInvestigacion(@WebParam(name="codigo") int codigo);
	public int insertarGrupoInvestigacion(@WebParam(name="grupoInvestigacion") GrupoInvestigacion grupoInvestigacio);
}
