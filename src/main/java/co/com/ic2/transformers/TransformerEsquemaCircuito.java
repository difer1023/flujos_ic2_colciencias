package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.EsquemaCircuito;

public class TransformerEsquemaCircuito {

	public static List<EsquemaCircuito> getEsquemasCircuito(String jsonEsquemasCircuito) {
		try {
			ArrayList<EsquemaCircuito> esquemasCircuito=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonEsquemasCircuito).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				EsquemaCircuito esquemaCircuito=new EsquemaCircuito();
				esquemaCircuito.setCodigo(object.get("k_codigo").getAsInt());
				esquemaCircuito.setNumeroRegistro(object.get("c_num_registro").getAsString());
				esquemaCircuito.setNombre(object.get("n_titulo_registro").getAsString());
				esquemaCircuito.setAno(object.get("i_ano_obtencion").getAsInt());
				esquemaCircuito.setPais(object.get("i_pais_obtencion").getAsString());
				esquemaCircuito.setContrato(object.get("b_contrato").getAsBoolean());
				esquemaCircuito.setCategoria(object.get("c_categoria").getAsString());
				esquemaCircuito.setClasificado(object.get("b_clasificado").getAsBoolean());
				esquemasCircuito.add(esquemaCircuito);
				System.out.println("OBJECT "+object.toString());
			}
			return esquemasCircuito;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
