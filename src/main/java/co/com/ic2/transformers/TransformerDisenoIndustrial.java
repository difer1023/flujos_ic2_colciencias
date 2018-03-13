package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.DisenoIndustrial;

public class TransformerDisenoIndustrial {

	public static List<DisenoIndustrial> getDisenosIndustriales(String jsonDisenosIndustriales) {
		try {
			ArrayList<DisenoIndustrial> disenosIndustriales=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonDisenosIndustriales).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				DisenoIndustrial disenoIndustrial=new DisenoIndustrial();
				disenoIndustrial.setCodigo(object.get("k_codigo").getAsInt());
				disenoIndustrial.setNumeroRegistro(object.get("c_numero_reg").getAsString());
				disenoIndustrial.setNombre(object.get("c_titulo_reg").getAsString());
				disenoIndustrial.setAno(object.get("i_ano_obtencion").getAsInt());
				disenoIndustrial.setGaceta(object.get("b_gaceta").getAsString());
				disenoIndustrial.setPais(object.get("i_pais_obtencion").getAsString());
				disenoIndustrial.setContrato(object.get("b_contrato").getAsBoolean());
				disenoIndustrial.setCategoria(object.get("c_categoria").getAsString());
				disenoIndustrial.setClasificado(object.get("b_clasificado").getAsBoolean());
				disenosIndustriales.add(disenoIndustrial);
				System.out.println("OBJECT "+object.toString());
			}
			return disenosIndustriales;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
