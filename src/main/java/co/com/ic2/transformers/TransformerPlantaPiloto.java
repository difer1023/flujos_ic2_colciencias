package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.PlantaPiloto;

public class TransformerPlantaPiloto {

	public static List<PlantaPiloto> getPlantasPiloto(String jsonPlantasPiloto) {
		try {
			ArrayList<PlantaPiloto> plantasPiloto=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonPlantasPiloto).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				PlantaPiloto plantaPiloto=new PlantaPiloto();
				plantaPiloto.setCodigo(object.get("k_codigo").getAsInt());
				plantaPiloto.setNombre(object.get("n_nombre").getAsString());
				plantaPiloto.setAno(object.get("f_fecha").getAsInt());
				plantaPiloto.setInstitucion(object.get("i_institucion_financiadora").getAsString());
				plantaPiloto.setCopiaContrato(object.get("b_copia_contrato").getAsBoolean());
				plantaPiloto.setPais(object.get("i_pais_elaboracion").getAsString());
				plantaPiloto.setCategoria(object.get("c_categoria").getAsString());
				plantaPiloto.setClasificado(object.get("b_clasificado").getAsBoolean());
				plantasPiloto.add(plantaPiloto);
				System.out.println("OBJECT "+object.toString());
			}
			return plantasPiloto;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
