package co.com.ic2.colciencias.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="servicePlantaPiloto")
public interface IServicePlantaPiloto {
	public String consultarPlantasPiloto();
	public String insertarPlantaPiloto(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,
			@WebParam(name="fecha") String fecha,@WebParam(name="institucionFinanciadora") String institucionFinanciadora,
			@WebParam(name="copiaContrato") boolean copiaContrato, @WebParam(name="paisElaboracion") int paisElaboracion, 
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
}
