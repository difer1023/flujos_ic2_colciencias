package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.EstrategiaComunicacionConocimiento;

public class TransformerEstrategiaComunicacionConocimiento {

	public static List<EstrategiaComunicacionConocimiento> getEstrategiasComunicacionConocimiento(String jsonEstrategiasComunicacionConocimiento) {
		try {
			ArrayList<EstrategiaComunicacionConocimiento> estrategiasComunicacionConocimiento=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonEstrategiasComunicacionConocimiento).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				EstrategiaComunicacionConocimiento estrategiaComunicacionConocimiento=new EstrategiaComunicacionConocimiento();
				estrategiaComunicacionConocimiento.setCodigo(object.get("k_codigo").getAsInt());
				estrategiaComunicacionConocimiento.setNombre(object.get("n_nombre").getAsString());
				estrategiaComunicacionConocimiento.setAnoInicio(object.get("f_fecha_inicio").getAsInt());
				estrategiaComunicacionConocimiento.setLider(object.get("i_lider").getAsString());
				estrategiaComunicacionConocimiento.setNombreComunidad(object.get("n_nombre_comunidad").getAsString());
				estrategiaComunicacionConocimiento.setCertificacion(object.get("b_certificacion").getAsBoolean());
				estrategiaComunicacionConocimiento.setCategoria(object.get("c_categoria").getAsString());
				estrategiaComunicacionConocimiento.setClasificado(object.get("b_clasificado").getAsBoolean());
				estrategiasComunicacionConocimiento.add(estrategiaComunicacionConocimiento);
				System.out.println("OBJECT "+object.toString());
			}
			return estrategiasComunicacionConocimiento;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
