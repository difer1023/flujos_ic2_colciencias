package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.DisenoIndustrial;

@WebService(name="serviceDisenoIndustrial")
public interface IServiceDisenoIndustrial {
	public List<DisenoIndustrial> consultarDisenosIndustriales();
	
	public List<DisenoIndustrial> consultarDisenosIndustrialesGrupo(int codigoGrupo);
	
	public String insertarDisenoIndustrial(@WebParam(name="codigo") String codigo,@WebParam(name="numeroRegistro") String numeroRegistro,
			@WebParam(name="tituloRegistro") int tituloRegistro,@WebParam(name="ano") int ano,
			@WebParam(name="gaceta") int gaceta, @WebParam(name="paisObtencion") int paisObtencion, @WebParam(name="contrato") int contrato,
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
	
	public String insertarDisenosIndustriales(@WebParam(name="codigoGrupo") String codigoGrupo,@WebParam(name="disenosIndustriales") ArrayList<DisenoIndustrial> disenosIndustriales);
}
