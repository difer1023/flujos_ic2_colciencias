package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.EspacioParticipacionCiudadana;

public class TransformerEspacioParticipacionCiudadanaCTI {

	public static List<EspacioParticipacionCiudadana> getEspaciosParticipacionCiudadana(String jsonEspaciosParticipacionCiudadana) {
		try {
			ArrayList<EspacioParticipacionCiudadana> espaciosParticipacionCiudadana=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonEspaciosParticipacionCiudadana).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				EspacioParticipacionCiudadana espacioParticipacionCiudadana=new EspacioParticipacionCiudadana();
				espacioParticipacionCiudadana.setCodigo(object.get("k_codigo").getAsInt());
				espacioParticipacionCiudadana.setNombre(object.get("n_nombre_espacio").getAsString());
				espacioParticipacionCiudadana.setAnoInicio(object.get("f_fecha_inicio").getAsInt());
				espacioParticipacionCiudadana.setNombreComunidad(object.get("n_nombre_comunidad").getAsString());
				espacioParticipacionCiudadana.setConstanciaParticipacion(object.get("n_constancia_participacion").getAsBoolean());
				espacioParticipacionCiudadana.setCategoria(object.get("c_categoria").getAsString());
				espacioParticipacionCiudadana.setClasificado(object.get("b_clasificado").getAsBoolean());
				espaciosParticipacionCiudadana.add(espacioParticipacionCiudadana);
				System.out.println("OBJECT "+object.toString());
			}
			return espaciosParticipacionCiudadana;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
