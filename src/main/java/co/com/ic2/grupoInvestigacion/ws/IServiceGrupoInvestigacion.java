package co.com.ic2.grupoInvestigacion.ws;

import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(name="serviceGrupoInvestigacion")
public interface IServiceGrupoInvestigacion {
	public String consultarGruposInvestigacion();
	public String insertarGrupoInvestigacion(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre);
}
