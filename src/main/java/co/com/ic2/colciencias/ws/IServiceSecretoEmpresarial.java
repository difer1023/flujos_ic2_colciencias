package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceSecretoEmpresarial")
public interface IServiceSecretoEmpresarial {
	
	public String consultarClasificacionSecretosEmpresariales(int codigoGrupo);
	
	public String consultarSecretosEmpresariales();
	public String insertarSecretoEmpresarial(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,
			@WebParam(name="valorContrato") String valorContrato,@WebParam(name="certificacion") boolean certificacion,
			@WebParam(name="numeroContrato") String numeroContrato,@WebParam(name="categoria") String categoria,
			@WebParam(name="clasificado") boolean clasificado);
}
