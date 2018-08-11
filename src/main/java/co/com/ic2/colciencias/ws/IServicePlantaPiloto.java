package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.PlantaPiloto;

@WebService(name="servicePlantaPiloto")
public interface IServicePlantaPiloto {
	
	public String consultarClasificacionPlantasPiloto(int codigoGrupo);
	
	public List<PlantaPiloto> consultarPlantasPiloto();
	
	public List<PlantaPiloto> consultarPlantasPilotoGrupo(int codigoGrupo);

	public String insertarPlantaPiloto(@WebParam(name="codigo") String codigo,@WebParam(name="nombre") String nombre,
			@WebParam(name="fecha") String fecha,@WebParam(name="institucionFinanciadora") String institucionFinanciadora,
			@WebParam(name="copiaContrato") boolean copiaContrato, @WebParam(name="paisElaboracion") int paisElaboracion, 
			@WebParam(name="categoria") String categoria,@WebParam(name="clasificado") boolean clasificado);
	
	public String insertarPlantasPilotos(@WebParam(name="codigoGrupo") String codigo,@WebParam(name="plantasPiloto") ArrayList<PlantaPiloto> plantasPiloto);
}
