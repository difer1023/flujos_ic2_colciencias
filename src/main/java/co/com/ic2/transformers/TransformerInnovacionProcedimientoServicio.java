package co.com.ic2.transformers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import co.com.ic2.colciencias.gruplac.productosInvestigacion.InnovacionProcedimientoServicio;

public class TransformerInnovacionProcedimientoServicio {

	public static List<InnovacionProcedimientoServicio> getInnovacionesProcedimientosServicios(String jsonInnovacionesProcedimientosServicios) {
		try {
			ArrayList<InnovacionProcedimientoServicio> innovacionesProcedimientosServicios=new ArrayList<>();
			JsonParser parser=new JsonParser();
			JsonArray objectArray=parser.parse(jsonInnovacionesProcedimientosServicios).getAsJsonArray();
			System.out.println("OBJECT A "+objectArray.toString());
			for (int i=0;i<objectArray.size();i++){
				JsonObject object=parser.parse(objectArray.get(i).toString()).getAsJsonObject();
				InnovacionProcedimientoServicio informeTecnicoFinal=new InnovacionProcedimientoServicio();
				informeTecnicoFinal.setCodigo(object.get("k_codigo").getAsInt());
				informeTecnicoFinal.setNombre(object.get("n_nombre").getAsString());
				informeTecnicoFinal.setAno(object.get("f_fecha").getAsInt());
				informeTecnicoFinal.setInstitucion(object.get("n_nombre_empresa").getAsString());
				informeTecnicoFinal.setNit(object.get("n_nit").getAsString());
				informeTecnicoFinal.setCertificadoImpPeq(object.get("b_certificado_imp_peq").getAsBoolean());
				informeTecnicoFinal.setCertificadoImpMed(object.get("b_certificado_imp_med").getAsBoolean());
				informeTecnicoFinal.setCertificadoImpGran(object.get("b_certificado_imp_gran").getAsBoolean());
				informeTecnicoFinal.setCategoria(object.get("c_categoria").getAsString());
				informeTecnicoFinal.setClasificado(object.get("b_clasificado").getAsBoolean());
				innovacionesProcedimientosServicios.add(informeTecnicoFinal);
				System.out.println("OBJECT "+object.toString());
			}
			return innovacionesProcedimientosServicios;
		} catch (JsonSyntaxException | NullPointerException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
