package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.ApoyoProgramaFormacion;

public class TransformerApoyoProgramaFormacion {
	
	public static List<ApoyoProgramaFormacion> getApoyoProgramasFormacion(String jsonApoyoProgramasFormacion) {
		try {
			ArrayList<ApoyoProgramaFormacion> apoyoProgramasFormacion=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonApoyoProgramasFormacion).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				ApoyoProgramaFormacion apoyoProgramaFormacion=new ApoyoProgramaFormacion();
				apoyoProgramaFormacion.setCodigo(object.get("k_codigo").getAsInt());
				apoyoProgramaFormacion.setNombre(object.get("n_nombre").getAsString());
				apoyoProgramaFormacion.setInstitucion(object.get("i_institucion").getAsString());
				apoyoProgramaFormacion.setFacultad(object.get("n_facultad").getAsString());
				apoyoProgramaFormacion.setDepartamento(object.get("n_departamento").getAsString());
				apoyoProgramaFormacion.setNumActoAdmin(object.get("n_num_acto_admin").getAsString());
				apoyoProgramaFormacion.setFechaActoAdministrativo(object.get("f_fecha").getAsString());
				apoyoProgramaFormacion.setTipoApoyo(object.get("i_tipo_apoyo").getAsInt());
				apoyoProgramaFormacion.setCategoria(object.get("c_categoria").getAsString());
				apoyoProgramaFormacion.setClasificado(object.get("b_clasificado").getAsBoolean());
				apoyoProgramasFormacion.add(apoyoProgramaFormacion);
				System.out.println("OBJECT "+object.toString());
			}
			return apoyoProgramasFormacion;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

}
