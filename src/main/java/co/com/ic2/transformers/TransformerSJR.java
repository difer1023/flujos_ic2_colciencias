package co.com.ic2.transformers;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class TransformerSJR {

	public static Map<String,String> getJCR(String jsonSJR) {
		try {
			Map<String,String> sjr=new HashMap<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonSJR).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				
				sjr.put(object.get("i_categoria").getAsString(),object.get("c_cuartil").getAsString());
				System.out.println("OBJECT "+object.toString());
			}
			return sjr;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new HashMap<>();
		}
	}
}
