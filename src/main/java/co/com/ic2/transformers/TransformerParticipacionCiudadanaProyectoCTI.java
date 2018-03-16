package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.Investigador;
import co.com.ic2.colciencias.gruplac.productosInvestigacion.ParticipacionCiudadanaProyectoCTI;

public class TransformerParticipacionCiudadanaProyectoCTI {

	public static List<ParticipacionCiudadanaProyectoCTI> getParticipacionesCiudadanasProyectosCTI(String jsonParticipacionesCiudadanasProyectosCTI) {
		try {
			ArrayList<ParticipacionCiudadanaProyectoCTI> participacionesCiudadanasProyectosCTI=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonParticipacionesCiudadanasProyectosCTI).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				ParticipacionCiudadanaProyectoCTI participacionCiudadanaProyectoCTI=new ParticipacionCiudadanaProyectoCTI();
				participacionCiudadanaProyectoCTI.setCodigo(object.get("k_codigo").getAsInt());
				participacionCiudadanaProyectoCTI.setNombre(object.get("n_titulo").getAsString());
				participacionCiudadanaProyectoCTI.setAnoInicio(object.get("f_fecha_inicio").getAsInt());
				Investigador investigador = new Investigador();
				investigador.setNombreCompleto(object.get("i_investigador_principal").getAsString());
				participacionCiudadanaProyectoCTI.setConstanciaParticipacion(object.get("b_constancia_participacion").getAsBoolean());
				participacionCiudadanaProyectoCTI.setCategoria(object.get("c_categoria").getAsString());
				participacionCiudadanaProyectoCTI.setClasificado(object.get("b_clasificado").getAsBoolean());
				participacionesCiudadanasProyectosCTI.add(participacionCiudadanaProyectoCTI);
				System.out.println("OBJECT "+object.toString());
			}
			return participacionesCiudadanasProyectosCTI;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
