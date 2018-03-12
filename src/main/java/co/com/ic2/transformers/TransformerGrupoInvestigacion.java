package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.GrupoInvestigacion;

public class TransformerGrupoInvestigacion {

	public static List<GrupoInvestigacion> getGruposInvestigacion(String jsonGruposInvestigacion) {
		try {
			ArrayList<GrupoInvestigacion> gruposInvestigacion=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonGruposInvestigacion).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				GrupoInvestigacion grupoInvestigacion=new GrupoInvestigacion();
				grupoInvestigacion.setCodigo(object.get("k_codigo").getAsInt());
				grupoInvestigacion.setNombre(object.get("n_nombre").getAsString());
				gruposInvestigacion.add(grupoInvestigacion);
				System.out.println("OBJECT "+object.toString());
			}
			return gruposInvestigacion;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	public static GrupoInvestigacion getGrupoInvestigacion(String jsonGrupoInvestigacion){
		try {
			GrupoInvestigacion grupoInvestigacion=new GrupoInvestigacion();
			JsonParser parser=new JsonParser();
			System.out.println("OBJECT A "+jsonGrupoInvestigacion);
			JsonArray objectArray=parser.parse(jsonGrupoInvestigacion).getAsJsonArray();
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				grupoInvestigacion.setCodigo(object.get("k_codigo").getAsInt());
				grupoInvestigacion.setNombre(object.get("n_nombre").getAsString());
				System.out.println("OBJECT "+object.toString());
			}
			return grupoInvestigacion;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new GrupoInvestigacion();
		}		
	}

	public static int getCodigoGrupoInvestigacion(String jsonCodigoGrupoInvestigacion){
		try {
			JsonParser parser=new JsonParser();
			System.out.println("OBJECT A "+jsonCodigoGrupoInvestigacion);
			JsonArray objectArray=parser.parse(jsonCodigoGrupoInvestigacion).getAsJsonArray();
			JsonObject object=parser.parse(objectArray.get(0).toString()).getAsJsonObject();
			
			return object.get("GENERATED_KEY").getAsInt();
			
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return 0;
		}		
	}
}
