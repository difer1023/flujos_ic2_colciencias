package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="serviceLibro")
public interface IServiceLibro {
	public String consultarLibros();
	public String insertarLibro(@WebParam(name="isbn") String isbn,@WebParam(name="titulo") String titulo,
			@WebParam(name="editorial") int editorial,@WebParam(name="paisPublicacion") int paisPublicacion);
	
	public String consultarEditoriales();
	public String insertarEditorial(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre);
	
	public String consultarBCI();
	public String insertarBCI(@WebParam(name="codigo") String codigo,@WebParam(name="isbn") String isbn,
			@WebParam(name="titulo") String titulo);
}
