package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.InformeFinalInvestigacion;

public class TransformerInformeFinalInvestigacion {

	public static List<InformeFinalInvestigacion> getInformesFinalesInvestigacion(String jsonInformesFinalesInvestigacion) {
		try {
			ArrayList<InformeFinalInvestigacion> informesFinalesInvestigacion=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonInformesFinalesInvestigacion).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				InformeFinalInvestigacion informeFinalInvestigacion=new InformeFinalInvestigacion();
				informeFinalInvestigacion.setCodigo(object.get("k_codigo").getAsInt());
				informeFinalInvestigacion.setNombre(object.get("n_titulo").getAsString());
				informeFinalInvestigacion.setProyecto(object.get("n_nombre_proyecto").getAsString());
				informeFinalInvestigacion.setAno(object.get("f_fecha_elaboracion").getAsInt());
				informeFinalInvestigacion.setCategoria(object.get("c_categoria").getAsString());
				informeFinalInvestigacion.setClasificado(object.get("b_clasificado").getAsBoolean());
				informesFinalesInvestigacion.add(informeFinalInvestigacion);
				System.out.println("OBJECT "+object.toString());
			}
			return informesFinalesInvestigacion;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
