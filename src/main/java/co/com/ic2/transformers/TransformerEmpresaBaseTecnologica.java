package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.EmpresaBaseTecnologica;

public class TransformerEmpresaBaseTecnologica {

	public static List<EmpresaBaseTecnologica> getEmpresasBaseTecnologica(String jsonEmpresasBaseTecnologica) {
		try {
			ArrayList<EmpresaBaseTecnologica> empresasBasesTecnologica=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonEmpresasBaseTecnologica).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				EmpresaBaseTecnologica empresaBaseTecnologica=new EmpresaBaseTecnologica();
				empresaBaseTecnologica.setCodigo(object.get("k_codigo").getAsInt());
				empresaBaseTecnologica.setNombre(object.get("n_nombre").getAsString());
				empresaBaseTecnologica.setCertificadoCamaraComercio(object.get("b_certificado_camara").getAsBoolean());
				empresaBaseTecnologica.setNit(object.get("n_num_tributario").getAsString());
				empresaBaseTecnologica.setCertificacionInstitucional(object.get("b_certificacion_institucional").getAsBoolean());
				empresaBaseTecnologica.setTipoIdentificacion(object.get("i_tipo_identificacion").getAsInt());
				empresaBaseTecnologica.setTipo(object.get("i_tipo_empresa").getAsString());
				empresaBaseTecnologica.setCategoria(object.get("c_categoria").getAsString());
				empresaBaseTecnologica.setClasificado(object.get("b_clasificado").getAsBoolean());
				empresasBasesTecnologica.add(empresaBaseTecnologica);
				System.out.println("OBJECT "+object.toString());
			}
			return empresasBasesTecnologica;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
