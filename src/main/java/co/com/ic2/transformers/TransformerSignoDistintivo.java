package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.SignoDistintivo;

public class TransformerSignoDistintivo {

	public static List<SignoDistintivo> getSignosDistintivos(String jsonSignosDistintivos) {
		try {
			ArrayList<SignoDistintivo> signosDistintivos=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonSignosDistintivos).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				SignoDistintivo signoDistintivo=new SignoDistintivo();
				signoDistintivo.setCodigo(object.get("k_codigo").getAsInt());
				signoDistintivo.setNumRegistro(object.get("c_numero_reg").getAsString());
				signoDistintivo.setNombre(object.get("n_titulo").getAsString());
				signoDistintivo.setAno(object.get("i_ano").getAsInt());
				signoDistintivo.setMes(object.get("i_mes").getAsString());
				signoDistintivo.setCertificado(object.get("b_certificado_reg").getAsBoolean());
				signoDistintivo.setCondicionesUso(object.get("n_condiciones_uso").getAsString());
				signoDistintivo.setPais(object.get("i_pais_obtencion").getAsString());
				signoDistintivo.setCategoria(object.get("c_categoria").getAsString());
				signoDistintivo.setClasificado(object.get("b_clasificado").getAsBoolean());
				signosDistintivos.add(signoDistintivo);
				System.out.println("OBJECT "+object.toString());
			}
			return signosDistintivos;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
