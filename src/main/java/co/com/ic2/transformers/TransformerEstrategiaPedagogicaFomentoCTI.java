package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.Investigador;
import co.com.ic2.colciencias.gruplac.productosInvestigacion.EstrategiaPedagogicaFomentoCTI;

public class TransformerEstrategiaPedagogicaFomentoCTI {

	public static List<EstrategiaPedagogicaFomentoCTI> getEstrategiasPedagogicasFomentoCTI(String jsonEstrategiasPedagogicasFomentoCTI) {
		try {
			ArrayList<EstrategiaPedagogicaFomentoCTI> estrategiasPedagogicasFomentoCTI=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonEstrategiasPedagogicasFomentoCTI).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				EstrategiaPedagogicaFomentoCTI estrategiaPedagogicaFomentoCTI=new EstrategiaPedagogicaFomentoCTI();
				estrategiaPedagogicaFomentoCTI.setCodigo(object.get("k_codigo").getAsInt());
				estrategiaPedagogicaFomentoCTI.setNombre(object.get("n_nombre").getAsString());
				estrategiaPedagogicaFomentoCTI.setFechaInicio(object.get("f_fecha_inicio").getAsString());
				Investigador investigador = new Investigador();
				investigador.setNombreCompleto(object.get("i_investigador_principal").getAsString());
				estrategiaPedagogicaFomentoCTI.setCertificado(object.get("b_certificado").getAsBoolean());
				estrategiaPedagogicaFomentoCTI.setCategoria(object.get("c_categoria").getAsString());
				estrategiaPedagogicaFomentoCTI.setClasificado(object.get("b_clasificado").getAsBoolean());
				estrategiasPedagogicasFomentoCTI.add(estrategiaPedagogicaFomentoCTI);
				System.out.println("OBJECT "+object.toString());
			}
			return estrategiasPedagogicasFomentoCTI;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
