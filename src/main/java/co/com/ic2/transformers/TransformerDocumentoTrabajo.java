package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.DocumentoTrabajo;

public class TransformerDocumentoTrabajo {

	public static List<DocumentoTrabajo> getDocumentosTrabajo(String jsonDocumentosTrabajo) {
		try {
			ArrayList<DocumentoTrabajo> documentosTrabajo=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonDocumentosTrabajo).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				DocumentoTrabajo documentoTrabajo=new DocumentoTrabajo();
				documentoTrabajo.setCodigo(object.get("k_codigo").getAsInt());
				documentoTrabajo.setNombre(object.get("n_titulo").getAsString());
				documentoTrabajo.setAno(object.get("i_ano").getAsInt());
				documentoTrabajo.setAno(object.get("n_pag_web").getAsInt());
				documentoTrabajo.setUrl(object.get("n_doi").getAsString());
				documentoTrabajo.setCategoria(object.get("c_categoria").getAsString());
				documentoTrabajo.setClasificado(object.get("b_clasificado").getAsBoolean());
				documentosTrabajo.add(documentoTrabajo);
				System.out.println("OBJECT "+object.toString());
			}
			return documentosTrabajo;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
