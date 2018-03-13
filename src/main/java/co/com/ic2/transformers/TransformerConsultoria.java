package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.Consultoria;

public class TransformerConsultoria {

	public static List<Consultoria> getCapitulosLibroPublicados(String jsonConsultorias) {
		try {
			ArrayList<Consultoria> consultorias=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonConsultorias).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				Consultoria consultoria=new Consultoria();
				consultoria.setCodigo(object.get("k_codigo").getAsInt());
				consultoria.setNombre(object.get("n_titulo").getAsString());
				consultoria.setNumContrato(object.get("n_numero_contrato").getAsString());
				consultoria.setAno(object.get("f_fecha").getAsInt());
				consultoria.setCertificacionEmpresa(object.get("b_certificacion_empresa").getAsBoolean());
				consultoria.setCategoria(object.get("c_categoria").getAsString());
				consultoria.setClasificado(object.get("b_clasificado").getAsBoolean());
				consultorias.add(consultoria);
				System.out.println("OBJECT "+object.toString());
			}
			return consultorias;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
