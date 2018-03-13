package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.ArticuloInvestigacion;

public class TransformerArticuloInvestigacion {
	
	public static List<ArticuloInvestigacion> getArticulosInvestigacion(String jsonArticulosInvestigacion) {
		try {
			ArrayList<ArticuloInvestigacion> articulosInvestigacion=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonArticulosInvestigacion).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				ArticuloInvestigacion articuloInvestigacion=new ArticuloInvestigacion();
				articuloInvestigacion.setCodigo(object.get("k_codigo").getAsInt());
				articuloInvestigacion.setNombre(object.get("n_titulo").getAsString());
				articuloInvestigacion.setAno(object.get("i_ano").getAsInt());
				articuloInvestigacion.setMes(object.get("i_mes").getAsString());
				articuloInvestigacion.setVolumen(object.get("i_volumen").getAsString());
				articuloInvestigacion.setPagInicial(object.get("i_pagina_inicial").getAsString());
				articuloInvestigacion.setPagFinal(object.get("i_pagina_final").getAsString());
				articuloInvestigacion.setIssn(object.get("i_ISSN_revista").getAsString());
				articuloInvestigacion.setUrl(object.get("c_pag_web").getAsString());
				articuloInvestigacion.setDoi(object.get("c_DOI").getAsString());
				articuloInvestigacion.setPais(object.get("i_pais_publicacion").getAsString());
				articuloInvestigacion.setCategoria(object.get("c_categoria").getAsString());
				articuloInvestigacion.setClasificado(object.get("b_clasificado").getAsBoolean());
				articulosInvestigacion.add(articuloInvestigacion);
				System.out.println("OBJECT "+object.toString());
			}
			return articulosInvestigacion;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

}
