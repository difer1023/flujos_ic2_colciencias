package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.EsquemaCircuito;

public class TransformerEsquemaCircuito {

	public static List<EsquemaCircuito> getEspaciosParticipacionCiudadana(String jsonEspaciosParticipacionCiudadana) {
		try {
			ArrayList<EsquemaCircuito> espaciosParticipacionCiudadana=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonEspaciosParticipacionCiudadana).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				EsquemaCircuito espacioParticipacionCiudadana=new EsquemaCircuito();
				espacioParticipacionCiudadana.setCodigo(object.get("k_codigo").getAsInt());
				espacioParticipacionCiudadana.setNumeroRegistro(object.get("c_num_registro").getAsString());
				espacioParticipacionCiudadana.setNombre(object.get("n_titulo_registro").getAsString());
				espacioParticipacionCiudadana.setAno(object.get("i_ano_obtencion").getAsInt());
				espacioParticipacionCiudadana.setPais(object.get("i_pais_obtencion").getAsString());
				espacioParticipacionCiudadana.setContrato(object.get("b_contrato").getAsBoolean());
				espacioParticipacionCiudadana.setCategoria(object.get("c_categoria").getAsString());
				espacioParticipacionCiudadana.setClasificado(object.get("b_clasificado").getAsBoolean());
				espaciosParticipacionCiudadana.add(espacioParticipacionCiudadana);
				System.out.println("OBJECT "+object.toString());
			}
			return espaciosParticipacionCiudadana;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
