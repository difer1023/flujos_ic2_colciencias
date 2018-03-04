package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceEmpresabaseTecnologica")
public interface IServiceEmpresaBaseTecnologica {
	public String consultarEmpresasBaseTecnologica();
	public String insertarEmpresaBaseTecnologica(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,
			@WebParam(name="certificadoCamara") boolean certificadoCamara,@WebParam(name="numeroTributario") String numeroTributario,
			@WebParam(name="certificacionInstitucional") boolean certificacionInstitucional,@WebParam(name="tipoIdentificacion") int tipoIdentificacion,
			@WebParam(name="tipoEmpresa") int tipoEmpresa,@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
}
