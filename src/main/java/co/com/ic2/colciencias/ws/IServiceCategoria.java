package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceCategoria")
public interface IServiceCategoria {
	public String consultarCategorias();
	public String insertarCategoria(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre);
}
