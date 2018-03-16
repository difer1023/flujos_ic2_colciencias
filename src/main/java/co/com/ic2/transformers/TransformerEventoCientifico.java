package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.EventoCientifico;

public class TransformerEventoCientifico {

	public static List<EventoCientifico> getEventosCientificos(String jsonEventosCientificos) {
		try {
			ArrayList<EventoCientifico> eventosCientificos=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonEventosCientificos).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				EventoCientifico eventoCientifico=new EventoCientifico();
				eventoCientifico.setCodigo(object.get("k_codigo").getAsInt());
				eventoCientifico.setNombre(object.get("n_nombre").getAsString());
				eventoCientifico.setFechaInicio(object.get("f_fecha_inicio").getAsString());
				eventoCientifico.setFechaFin(object.get("f_fecha_fin").getAsString());
				eventosCientificos.add(eventoCientifico);
				System.out.println("OBJECT "+object.toString());
			}
			return eventosCientificos;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
