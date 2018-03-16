package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.InformeTecnicoFinal;

public class TransformerInformeTecnicoFinal {

	public static List<InformeTecnicoFinal> getInformesTecnicosFinales(String jsonInformesTecnicosFinales) {
		try {
			ArrayList<InformeTecnicoFinal> informesFinalesInvestigacion=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonInformesTecnicosFinales).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				InformeTecnicoFinal informeTecnicoFinal=new InformeTecnicoFinal();
				informeTecnicoFinal.setCodigo(object.get("k_codigo").getAsInt());
				informeTecnicoFinal.setNombre(object.get("n_titulo").getAsString());
				informeTecnicoFinal.setTituloInvestigacion(object.get("n_titulo_inv").getAsString());
				informeTecnicoFinal.setAno(object.get("f_fecha").getAsInt());
				informeTecnicoFinal.setClasificado(object.get("b_certificacion_entidad").getAsBoolean());
				informeTecnicoFinal.setCategoria(object.get("c_categoria").getAsString());
				informeTecnicoFinal.setClasificado(object.get("b_clasificado").getAsBoolean());
				informesFinalesInvestigacion.add(informeTecnicoFinal);
				System.out.println("OBJECT "+object.toString());
			}
			return informesFinalesInvestigacion;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
