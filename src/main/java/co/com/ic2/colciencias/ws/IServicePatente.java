package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="servicePatente")
public interface IServicePatente {
	public String consultarPatentes ();
	public String insertarPatente (@WebParam(name="codigo") String codigo,@WebParam(name="numeroPatente") String numeroPatente,
			@WebParam(name="certificadoPatente") boolean certificadoPatente,@WebParam(name="anoObtencion") String anoObtencion,
			@WebParam(name="gaceta") String gaceta,@WebParam(name="categoria") String categoria,
			@WebParam(name="clasificado") boolean clasificado,@WebParam(name="viaObtencion") String viaObtencion,
			@WebParam(name="examenPreliminar") boolean examenPreliminar, @WebParam(name="examenFondo") boolean examenFondo);
}

