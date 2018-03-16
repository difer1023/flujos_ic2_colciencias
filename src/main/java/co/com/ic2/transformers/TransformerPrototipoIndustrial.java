package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.PrototipoIndustrial;

public class TransformerPrototipoIndustrial {

	public static List<PrototipoIndustrial> getPrototiposIndustriales(String jsonPrototiposIndustriales) {
		try {
			ArrayList<PrototipoIndustrial> prototiposIndustriales=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonPrototiposIndustriales).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				PrototipoIndustrial prototipoIndustrial=new PrototipoIndustrial();
				prototipoIndustrial.setCodigo(object.get("k_codigo").getAsInt());
				prototipoIndustrial.setNombre(object.get("n_nombre").getAsString());
				prototipoIndustrial.setAno(object.get("f_fecha").getAsInt());
				prototipoIndustrial.setInstitucion(object.get("i_institucion_financiadora").getAsString());
				prototipoIndustrial.setCopiaContrato(object.get("b_copia_contrato").getAsBoolean());
				prototipoIndustrial.setPais(object.get("i_pais_elaboracion").getAsString());
				prototipoIndustrial.setCategoria(object.get("c_categoria").getAsString());
				prototipoIndustrial.setClasificado(object.get("b_clasificado").getAsBoolean());
				prototiposIndustriales.add(prototipoIndustrial);
				System.out.println("OBJECT "+object.toString());
			}
			return prototiposIndustriales;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
