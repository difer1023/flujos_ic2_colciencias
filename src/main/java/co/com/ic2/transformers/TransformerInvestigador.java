package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.Investigador;

public class TransformerInvestigador {

	public static List<Investigador> getInvestigadores(String jsonInvestigadores) {
		try {
			ArrayList<Investigador> investigadores=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonInvestigadores).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				Investigador investigador=new Investigador();
				investigador.setNombreCompleto(object.get("n_nombre").getAsString());
				investigador.setCategoria(object.get("n_categoria").getAsString());
				investigador.setLider(object.get("b_lider_grupo").getAsBoolean());
				investigador.setInicioVinculacion(object.get("f_inicio_vinculacion").getAsString());
				investigador.setFinVinculacion(object.get("f_fin_vinculacion").getAsString());
				investigadores.add(investigador);
				System.out.println("OBJECT "+object.toString());
			}
			return investigadores;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
