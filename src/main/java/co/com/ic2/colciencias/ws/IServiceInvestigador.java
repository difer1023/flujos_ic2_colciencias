package co.com.ic2.colciencias.ws;

import java.util.ArrayList;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.Investigador;

@WebService(name="serviceInvestigador")
public interface IServiceInvestigador {
	public String consultarInvestigadores();
	public String insertarInvestigador(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,@WebParam(name="categoria") String categoria);
	
	public String insertarInvestigadores(@WebParam(name="codigoGrupo") String codigoGrupo,@WebParam(name="investigadores") ArrayList<Investigador> investigadores);
}
