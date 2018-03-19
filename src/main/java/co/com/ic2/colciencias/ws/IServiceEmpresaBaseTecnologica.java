package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.EmpresaBaseTecnologica;

@WebService(name = "serviceEmpresabaseTecnologica")
public interface IServiceEmpresaBaseTecnologica {
	public List<EmpresaBaseTecnologica> consultarEmpresasBaseTecnologica();

	public List<EmpresaBaseTecnologica> consultarEmpresasBaseTecnologicaGrupo(int codigoGrupo);

	public String insertarEmpresaBaseTecnologica(@WebParam(name = "codigo") String codigo,
			@WebParam(name = "nombre") String nombre, @WebParam(name = "certificadoCamara") boolean certificadoCamara,
			@WebParam(name = "numeroTributario") String numeroTributario,
			@WebParam(name = "certificacionInstitucional") boolean certificacionInstitucional,
			@WebParam(name = "tipoIdentificacion") int tipoIdentificacion,
			@WebParam(name = "tipoEmpresa") int tipoEmpresa, @WebParam(name = "categoria") String categoria,
			@WebParam(name = "clasificado") boolean clasificado);

	public String insertarEmpresasBaseTecnologica(@WebParam(name = "codigoGrupo") String codigoGrupo,
			@WebParam(name = "empresasBaseTecnologica") ArrayList<EmpresaBaseTecnologica> empresasBaseTecnologica);
}
