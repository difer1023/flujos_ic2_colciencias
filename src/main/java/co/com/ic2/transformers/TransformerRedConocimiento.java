package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.RedConocimiento;

public class TransformerRedConocimiento {

	public static List<RedConocimiento> getRedesConocimiento(String jsonRedesConocimiento) {
		try {
			ArrayList<RedConocimiento> redesConocimiento=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonRedesConocimiento).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				RedConocimiento redConocimiento=new RedConocimiento();
				redConocimiento.setCodigo(object.get("k_codigo").getAsInt());
				redConocimiento.setNombre(object.get("n_nombre").getAsString());
				redConocimiento.setLugar(object.get("i_pais").getAsString());
				redConocimiento.setAno(object.get("f_fecha_inicio").getAsInt());
				redConocimiento.setInvestigador(object.get("i_investigador_principal").getAsString());
				redConocimiento.setNombreComunidad(object.get("n_nombre_comunidad").getAsString());
				redConocimiento.setPagWeb(object.get("n_pag_web").getAsString());
				redConocimiento.setLiderRed(object.get("b_lider_red").getAsBoolean());
				redConocimiento.setCategoria(object.get("c_categoria").getAsString());
				redConocimiento.setClasificado(object.get("b_clasificado").getAsBoolean());
				redesConocimiento.add(redConocimiento);
				System.out.println("OBJECT "+object.toString());
			}
			return redesConocimiento;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
