package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.TrabajoGrado;

public class TransformerTrabajoGrado {

	public static List<TrabajoGrado> getTrabajosGrado(String jsonTrabajosGrado) {
		try {
			ArrayList<TrabajoGrado> trabajosGrado=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonTrabajosGrado).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				TrabajoGrado trabajoGrado=new TrabajoGrado();
				trabajoGrado.setCodigo(object.get("k_codigo").getAsInt());
				trabajoGrado.setNombre(object.get("n_titulo").getAsString());
				trabajoGrado.setAutorTrabajo(object.get("n_autor").getAsString());
				trabajoGrado.setInstitucion(object.get("i_institucion").getAsString());
				trabajoGrado.setAnoFin(object.get("i_ano").getAsInt());
				trabajoGrado.setValoracion(object.get("i_distincion").getAsString());
				trabajoGrado.setTipo(object.get("i_tipo_trabajo").getAsString());
				trabajoGrado.setCategoria(object.get("c_categoria").getAsString());
				trabajoGrado.setClasificado(object.get("b_clasificado").getAsBoolean());
				trabajosGrado.add(trabajoGrado);
				System.out.println("OBJECT "+object.toString());
			}
			return trabajosGrado;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
