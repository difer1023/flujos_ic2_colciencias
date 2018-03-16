package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.CapituloLibroPublicado;

public class TransformerCapituloLibroInvestigacion {

	public static List<CapituloLibroPublicado> getCapitulosLibroPublicados(String jsonCapitulosLibroPublicados) {
		try {
			ArrayList<CapituloLibroPublicado> capitulosLibroPublicados=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonCapitulosLibroPublicados).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				CapituloLibroPublicado capituloLibroPublicado=new CapituloLibroPublicado();
				capituloLibroPublicado.setCodigo(object.get("k_codigo").getAsInt());
				capituloLibroPublicado.setIsbn(object.get("c_ISBN_libro").getAsString());
				capituloLibroPublicado.setTituloLibro(object.get("n_titulo").getAsString());
				capituloLibroPublicado.setTituloCapitulo(object.get("n_titulo_cap").getAsString());
				capituloLibroPublicado.setAno(object.get("f_fecha_publicacion").getAsInt());
				capituloLibroPublicado.setRequisitosGuiaVerificacion(object.get("b_validacion_inv_an5").getAsBoolean());
				capituloLibroPublicado.setCategoria(object.get("c_categoria").getAsString());
				capituloLibroPublicado.setClasificado(object.get("b_clasificado").getAsBoolean());
				capitulosLibroPublicados.add(capituloLibroPublicado);
				System.out.println("OBJECT "+object.toString());
			}
			return capitulosLibroPublicados;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
