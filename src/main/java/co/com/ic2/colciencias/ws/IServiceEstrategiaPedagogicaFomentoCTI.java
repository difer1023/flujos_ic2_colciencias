package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceEstrategiaPedagogicaFomentoCTI")
public interface IServiceEstrategiaPedagogicaFomentoCTI {
	public String consultarEstrategiasPedagogicasFomentoCTI();
	public String insertarEstrategiaPedagogicaFomentoCTI(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,
			@WebParam(name="fechaInicio") String fechaInicio,@WebParam(name="investigadorPrincipal") String investigadorPrincipal,
			@WebParam(name="certificado") boolean certificado,@WebParam(name="categoria") String categoria,
			@WebParam(name="clasificado") boolean clasificado,@WebParam(name="codigoGrupoInvestigacion") boolean codigoGrupoInvestigacion);
}
