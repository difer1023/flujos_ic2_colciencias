package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.Proyecto;

public class TransformerProyecto {

	public static List<Proyecto> getProyectos(String jsonProyectos) {
		try {
			ArrayList<Proyecto> proyectos=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonProyectos).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				Proyecto proyecto=new Proyecto();
				proyecto.setCodigo(object.get("k_codigo").getAsInt());
				proyecto.setNombre(object.get("n_titulo").getAsString());
				proyecto.setInstitucion(object.get("i_institucion").getAsString());
				proyecto.setFinanciacion(object.get("i_financiacion").getAsString());
				proyecto.setActoAdmin(object.get("b_acto_admin").getAsBoolean());
				proyecto.setAnoInicio(object.get("i_ano").getAsInt());
				proyecto.setNumeroContrato(object.get("n_numero_contrato").getAsString());
				proyecto.setTipoFinanciacion(object.get("i_tipo_proyecto").getAsInt());
				proyecto.setCategoria(object.get("c_categoria").getAsString());
				proyecto.setClasificado(object.get("b_clasificado").getAsBoolean());
				proyectos.add(proyecto);
				System.out.println("OBJECT "+object.toString());
			}
			return proyectos;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
