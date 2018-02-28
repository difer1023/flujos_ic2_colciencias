package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.GrupoInvestigacion;

public class TransformerGrupoInvestigacion {

	public static List<GrupoInvestigacion> getGrupoInvestigacion(String jsonGrupoInvestigacion) {
		try {
			ArrayList<GrupoInvestigacion> gruposInvestigacion=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonGrupoInvestigacion).getAsJsonArray();
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
	
//	public static List<Pedido> getPedidos(String jsonPedidos) {
//		try {
//			return JsonUtil.getInstance().fromJsonList(jsonPedidos, new TypeToken<ArrayList<Pedido>>() {
//			}.getType());
//		} catch (JsonSyntaxException | NullPointerException e) {
//			e.printStackTrace();
//			return new ArrayList<>();
//		}
//	}
//
//	public static ErrorTransaccion getResTransaccion(String json) {
//		try {
//			return (ErrorTransaccion) JsonUtil.getInstance().fromJson(json.replace("[", "").replace("]", ""), ErrorTransaccion.class);
//		} catch (JsonSyntaxException | NullPointerException e) {
//			e.printStackTrace();
//			return new ErrorTransaccion("-111", "Se ha presentado un error inesperado", new Date().toString());
//		}
//	}

}
