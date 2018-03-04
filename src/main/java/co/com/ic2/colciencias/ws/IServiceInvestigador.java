package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceInvestigador")
public interface IServiceInvestigador {
	public String consultarInvestigadores();
	public String insertarInvestigador(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,@WebParam(name="categoria") String categoria);
}
