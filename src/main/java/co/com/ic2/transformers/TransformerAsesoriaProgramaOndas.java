package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.AsesoriaProgramaOndas;

public class TransformerAsesoriaProgramaOndas {

	public static List<AsesoriaProgramaOndas> getAsesoriasProgramaOndas(String jsonAsesoriasProgramaOndas) {
		try {
			ArrayList<AsesoriaProgramaOndas> asesoriasProgramaOndas=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonAsesoriasProgramaOndas).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				AsesoriaProgramaOndas asesoriaProgramaOndas=new AsesoriaProgramaOndas();
				asesoriaProgramaOndas.setCodigo(object.get("k_codigo").getAsInt());
				asesoriaProgramaOndas.setNombre(object.get("n_nombre").getAsString());
				asesoriaProgramaOndas.setRegistroBD(object.get("b_registro_BD").getAsBoolean());
				asesoriaProgramaOndas.setInstitucion(object.get("n_institucion").getAsString());
				asesoriaProgramaOndas.setMunicipio(object.get("i_municipio").getAsString());
				asesoriaProgramaOndas.setDepartamento(object.get("i_departamento").getAsString());
				asesoriaProgramaOndas.setResultados(object.get("b_resultados").getAsBoolean());
				asesoriaProgramaOndas.setReconocido(object.get("b_reconocido").getAsBoolean());
				asesoriaProgramaOndas.setParticipacionFerias(object.get("b_participacion_ferias").getAsBoolean());
				asesoriaProgramaOndas.setCategoria(object.get("c_categoria").getAsString());
				asesoriaProgramaOndas.setClasificado(object.get("b_clasificado").getAsBoolean());
				asesoriasProgramaOndas.add(asesoriaProgramaOndas);
				System.out.println("OBJECT "+object.toString());
			}
			return asesoriasProgramaOndas;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
