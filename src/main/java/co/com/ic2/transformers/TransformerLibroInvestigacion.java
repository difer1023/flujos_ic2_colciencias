package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.LibroInvestigacion;

public class TransformerLibroInvestigacion {

	public static List<LibroInvestigacion> getLibrosInvestigacion(String jsonLibrosInvestigacion) {
		try {
			ArrayList<LibroInvestigacion> librosInvestigacion=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonLibrosInvestigacion).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				LibroInvestigacion libroInvestigacion=new LibroInvestigacion();
				libroInvestigacion.setCodigo(object.get("k_codigo").getAsInt());
				libroInvestigacion.setIsbn(object.get("c_ISBN_libro").getAsString());
				libroInvestigacion.setNombre(object.get("n_titulo").getAsString());
				libroInvestigacion.setAno(object.get("f_fecha_publicacion").getAsInt());
				libroInvestigacion.setRequisitosGuiaVerificacion(object.get("b_validacion_inv_an5").getAsBoolean());
				libroInvestigacion.setCategoria(object.get("c_categoria").getAsString());
				libroInvestigacion.setClasificado(object.get("b_clasificado").getAsBoolean());
				librosInvestigacion.add(libroInvestigacion);
				System.out.println("OBJECT "+object.toString());
			}
			return librosInvestigacion;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
