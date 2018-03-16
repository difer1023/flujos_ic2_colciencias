package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.ProyectoExtensionCTI;

public class TransformerProyectoExtensionCTI {

	public static List<ProyectoExtensionCTI> getProyectosExtensionCTI(String jsonProyectosExtensionCTI) {
		try {
			ArrayList<ProyectoExtensionCTI> proyectosExtensionCTI=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonProyectosExtensionCTI).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				ProyectoExtensionCTI proyectoExtensionCTI=new ProyectoExtensionCTI();
				proyectoExtensionCTI.setCodigo(object.get("k_codigo").getAsInt());
				proyectoExtensionCTI.setNombre(object.get("n_nombre").getAsString());
				proyectoExtensionCTI.setAnoInicio(object.get("f_fecha_inicio").getAsInt());
				proyectoExtensionCTI.setAnoFin(object.get("f_fecha_fin").getAsInt());
				proyectoExtensionCTI.setNombreComunidad(object.get("n_nombre_comunidad").getAsString());
				proyectoExtensionCTI.setResumenCtel(object.get("n_resumen_ctel").getAsString());
				proyectoExtensionCTI.setCategoria(object.get("c_categoria").getAsString());
				proyectoExtensionCTI.setClasificado(object.get("b_clasificado").getAsBoolean());
				proyectosExtensionCTI.add(proyectoExtensionCTI);
				System.out.println("OBJECT "+object.toString());
			}
			return proyectosExtensionCTI;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
