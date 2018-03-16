package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.Software;

public class TransformerSoftware {

	public static List<Software> getSoftwares(String jsonSoftwares) {
		try {
			ArrayList<Software> softwares=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonSoftwares).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				Software software=new Software();
				software.setCodigo(object.get("k_codigo").getAsInt());
				software.setNombre(object.get("n_titulo").getAsString());
				software.setAno(object.get("c_num_reg_derechos_autor").getAsInt());
				software.setAno(object.get("i_ano").getAsInt());
				software.setDescripcion(object.get("n_descripcion").getAsString());
				software.setCodigoProyectoColciencias(object.get("c_cod_proy_colciencias").getAsString());
				software.setCertificacion(object.get("b_certificacion").getAsBoolean());
				software.setCategoria(object.get("c_categoria").getAsString());
				software.setClasificado(object.get("b_clasificado").getAsBoolean());
				softwares.add(software);
				System.out.println("OBJECT "+object.toString());
			}
			return softwares;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
