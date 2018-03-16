package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.GeneracionContenidoImpreso;
import co.com.ic2.colciencias.gruplac.productosInvestigacion.GeneracionContenidoMultimedia;
import co.com.ic2.colciencias.gruplac.productosInvestigacion.GeneracionContenidoVirtual;

public class TransformerGeneracionContenido {

	public static List<GeneracionContenidoImpreso> getGeneracionContenidosImpresos(String jsonGeneracionContenidosImpresos) {
		try {
			ArrayList<GeneracionContenidoImpreso> generacionContenidosImpresos=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonGeneracionContenidosImpresos).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				GeneracionContenidoImpreso generacionContenidoImpreso=new GeneracionContenidoImpreso();
				generacionContenidoImpreso.setCodigo(object.get("k_codigo").getAsInt());
				generacionContenidoImpreso.setNombre(object.get("n_titulo").getAsString());
				generacionContenidoImpreso.setAno(object.get("f_fecha_publicacion").getAsInt());
				generacionContenidoImpreso.setMedioCirculacion(object.get("n_medio_circulacion").getAsString());
				generacionContenidoImpreso.setAmbito(object.get("n_ambito").getAsString());
				generacionContenidoImpreso.setLugarPublicacion(object.get("i_lugar_publicacion").getAsString());
				generacionContenidoImpreso.setCertificacion(object.get("b_certificacion").getAsBoolean());
				generacionContenidoImpreso.setCategoria(object.get("c_categoria").getAsString());
				generacionContenidoImpreso.setClasificado(object.get("b_clasificado").getAsBoolean());
				generacionContenidosImpresos.add(generacionContenidoImpreso);
				System.out.println("OBJECT "+object.toString());
			}
			return generacionContenidosImpresos;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	public static List<GeneracionContenidoMultimedia> getGeneracionContenidosMultimedia(String jsonGeneracionContenidosMultimedia) {
		try {
			ArrayList<GeneracionContenidoMultimedia> generacionContenidosMultimedia=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonGeneracionContenidosMultimedia).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				GeneracionContenidoMultimedia generacionContenidoMultimedia=new GeneracionContenidoMultimedia();
				generacionContenidoMultimedia.setCodigo(object.get("k_codigo").getAsInt());
				generacionContenidoMultimedia.setNombre(object.get("n_titulo").getAsString());
				generacionContenidoMultimedia.setAmbito(object.get("n_ambito").getAsString());
				generacionContenidoMultimedia.setComunidades(object.get("n_comunidades").getAsString());
				generacionContenidoMultimedia.setResumen(object.get("n_resumen").getAsString());
				generacionContenidoMultimedia.setAno(object.get("f_fecha").getAsInt());
				generacionContenidoMultimedia.setMedioCirculacion(object.get("n_medio_circulacion").getAsString());
				generacionContenidoMultimedia.setCertificacion(object.get("b_certificacion").getAsBoolean());
				generacionContenidoMultimedia.setCategoria(object.get("c_categoria").getAsString());
				generacionContenidoMultimedia.setClasificado(object.get("b_clasificado").getAsBoolean());
				generacionContenidosMultimedia.add(generacionContenidoMultimedia);
				System.out.println("OBJECT "+object.toString());
			}
			return generacionContenidosMultimedia;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	public static List<GeneracionContenidoVirtual> getGeneracionContenidosVirtuales(String jsonGeneracionContenidosVirtuales) {
		try {
			ArrayList<GeneracionContenidoVirtual> generacionContenidosVirtuales=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonGeneracionContenidosVirtuales).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				GeneracionContenidoVirtual generacionContenidoVirtual=new GeneracionContenidoVirtual();
				generacionContenidoVirtual.setCodigo(object.get("k_codigo").getAsInt());
				generacionContenidoVirtual.setNombre(object.get("n_titulo").getAsString());
				generacionContenidoVirtual.setComunidad(object.get("n_comunidad").getAsString());
				generacionContenidoVirtual.setResumen(object.get("n_resumen").getAsString());
				generacionContenidoVirtual.setAno(object.get("f_fecha").getAsInt());
				generacionContenidoVirtual.setMedioCirculacion(object.get("n_medio_circulacion").getAsString());
				generacionContenidoVirtual.setUrl(object.get("n_pag_web").getAsString());
				generacionContenidoVirtual.setCertificacion(object.get("b_certificacion").getAsBoolean());
				generacionContenidoVirtual.setCategoria(object.get("c_categoria").getAsString());
				generacionContenidoVirtual.setClasificado(object.get("b_clasificado").getAsBoolean());
				generacionContenidosVirtuales.add(generacionContenidoVirtual);
				System.out.println("OBJECT "+object.toString());
			}
			return generacionContenidosVirtuales;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
