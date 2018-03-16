package co.com.ic2.colciencias.ws;

import java.util.ArrayList;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.AsesoriaProgramaOndas;

@WebService(name="serviceAsesoriaProgramaOndas")
public interface IServiceAsesoriaProgramaOndas {
	public String consultarAsesoriasProgramaOndas ();
	public String insertarAsesoriaProgramaOndas (@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,
			@WebParam(name="registroBD") String registroBD,@WebParam(name="institucion") String institucion,
			@WebParam(name="municipio") String municipio,@WebParam(name="departamento") String departamento,
			@WebParam(name="resultados") boolean resultados,@WebParam(name="reconocido") boolean reconocido,
			@WebParam(name="participacionFerias") boolean participacionFerias,@WebParam(name="categoria") String categoria,
			@WebParam(name="clasificado") boolean clasificado);
	
	public String insertarAsesoriasProgramaOndas (@WebParam(name="codigoGrupo") String codigoGrupo,@WebParam(name="asesoriasOndas") ArrayList<AsesoriaProgramaOndas> asesoriasOndas);
}
