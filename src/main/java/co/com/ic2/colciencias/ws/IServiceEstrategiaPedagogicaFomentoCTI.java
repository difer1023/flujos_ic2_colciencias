package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.EstrategiaPedagogicaFomentoCTI;

@WebService(name = "serviceEstrategiaPedagogicaFomentoCTI")
public interface IServiceEstrategiaPedagogicaFomentoCTI {
	public List<EstrategiaPedagogicaFomentoCTI> consultarEstrategiasPedagogicasFomentoCTI();

	public List<EstrategiaPedagogicaFomentoCTI> consultarEstrategiasPedagogicasFomentoCTIGrupo(int codigoGrupo);

	public String insertarEstrategiaPedagogicaFomentoCTI(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "nombre") String nombre, @WebParam(name = "fechaInicio") String fechaInicio,
			@WebParam(name = "investigadorPrincipal") String investigadorPrincipal,
			@WebParam(name = "certificado") boolean certificado, @WebParam(name = "categoria") String categoria,
			@WebParam(name = "clasificado") boolean clasificado,
			@WebParam(name = "codigoGrupoInvestigacion") boolean codigoGrupoInvestigacion);

	public String insertarEstrategiasPedagogicasFomentoCTI(@WebParam(name = "codigoGrupo") String codigo,
			@WebParam(name = "estrategiasPedagogicas") ArrayList<EstrategiaPedagogicaFomentoCTI> estrategiasPedagogicas);
}
