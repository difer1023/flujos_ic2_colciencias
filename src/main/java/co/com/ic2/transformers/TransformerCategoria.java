package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class TransformerCategoria {

	public static List<String> getCategorias(String jsonCategorias) {
		try {
			ArrayList<String> categorias = new ArrayList<>();
			JsonParser parser = new JsonParser();
			JsonArray objectArray = parser.parse(jsonCategorias).getAsJsonArray();
			System.out.println("OBJECT A " + objectArray.toString());
			for (int i = 0; i < objectArray.size(); i++) {
				JsonObject object = parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				String categoria = object.get("k_codigo").getAsString();
				categorias.add(categoria);
				System.out.println("OBJECT " + object.toString());
			}
			return categorias;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
