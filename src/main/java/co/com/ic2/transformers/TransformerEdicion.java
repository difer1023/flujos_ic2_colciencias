package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.Investigador;
import co.com.ic2.colciencias.gruplac.productosInvestigacion.Edicion;

public class TransformerEdicion {

	public static List<Edicion> getEdiciones(String jsonEdiciones) {
		try {
			ArrayList<Edicion> ediciones=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonEdiciones).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				Edicion edicion=new Edicion();
				edicion.setCodigo(object.get("k_codigo").getAsInt());
				edicion.setNombre(object.get("n_titulo").getAsString());
				edicion.setIssn_Isbn(object.get("n_isbn_issn").getAsString());
				
				Investigador investigador = new Investigador();
				investigador.setNombreCompleto(object.get("i_editor").getAsString());
				edicion.setAutor(investigador);
				edicion.setFechaEdicion(object.get("f_fecha_editor").getAsString());
				edicion.setAno(object.get("i_ano").getAsInt());
				edicion.setUrl(object.get("n_pag_web").getAsString());
				edicion.setCategoria(object.get("c_categoria").getAsString());
				edicion.setClasificado(object.get("b_clasificado").getAsBoolean());
				ediciones.add(edicion);
				System.out.println("OBJECT "+object.toString());
			}
			return ediciones;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
