package co.com.ic2.colciencias.calculos;

import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TestCalculos {
	
	public String getClasificacionInformacion(String jsonProductosGrupo,
			String jsonPerfilesColaboracion){
		
		return getClasificacion(jsonProductosGrupo,jsonPerfilesColaboracion);
	}
	
	public static String getClasificacion(String productos,String perfilesColaboracion) {
		
		JsonParser parser=new JsonParser();
		JsonArray jsonProductos=parser.parse(productos).getAsJsonArray();
		JsonArray jsonPerfilesColaboracion=parser.parse(perfilesColaboracion).getAsJsonArray();
		System.out.println(jsonProductos.toString());
		System.out.println(jsonPerfilesColaboracion.toString());
		
		//Productos TOP
        int num_art_a1=buscarProducto(jsonProductos,parser,"ART_A1");
        int num_art_a2=buscarProducto(jsonProductos,parser,"ART_A2");
        int num_lib_a1=buscarProducto(jsonProductos,parser,"LIB_A1");
        int num_lib_a=buscarProducto(jsonProductos,parser,"LIB_A");
        int num_cap_lib_a1=buscarProducto(jsonProductos,parser,"CAP_LIB_A1");
        int num_cap_lib_a=buscarProducto(jsonProductos,parser,"CAP_LIB_A");
        int num_pa1=buscarProducto(jsonProductos,parser,"PA1_MA1");
        int num_pa2=buscarProducto(jsonProductos,parser,"PA2_MA2");
        int num_ma1=buscarProducto(jsonProductos,parser,"PA3_MA3");
        int num_ma2=buscarProducto(jsonProductos,parser,"PA4_MA4");
        //Prductos A}
        int num_art_b=buscarProducto(jsonProductos,parser,"ART_B");
        int num_art_c=buscarProducto(jsonProductos,parser,"ART_C");
        int num_lib_b=buscarProducto(jsonProductos,parser,"LIB_B");
        int num_cap_lib_b=buscarProducto(jsonProductos,parser,"CAP_LIB_B");
        int num_pa3=buscarProducto(jsonProductos,parser,"PA3_MA3");
        int num_pa4=buscarProducto(jsonProductos,parser,"PA4_MA4");
        int num_ma3=buscarProducto(jsonProductos,parser,"PA3_MA3");
        int num_ma4=buscarProducto(jsonProductos,parser,"PA4_MA4");
        int num_di_a=buscarProducto(jsonProductos,parser,"DI_A");
        int num_eci_a=buscarProducto(jsonProductos,parser,"ECI_A");
        int num_sf_a=buscarProducto(jsonProductos,parser,"SF_A");
        int num_pp_a=buscarProducto(jsonProductos,parser,"PP_A");
        int num_pi_a=buscarProducto(jsonProductos,parser,"PI_A");
        int num_sd=buscarProducto(jsonProductos,parser,"SD");
        int num_se=buscarProducto(jsonProductos,parser,"SE");
        int num_ebt_a=buscarProducto(jsonProductos,parser,"EBT_A");
        //Productos B
        int num_art_d=buscarProducto(jsonProductos,parser,"ART_D");
        int num_pb1=buscarProducto(jsonProductos,parser,"PB1_MB1");
        int num_pb2=buscarProducto(jsonProductos,parser,"PB1_MB1");
        int num_pb3=buscarProducto(jsonProductos,parser,"PB1_MB1");
        int num_pb4=buscarProducto(jsonProductos,parser,"PB1_MB1");
        int num_pb5=buscarProducto(jsonProductos,parser,"PB1_MB1");
        int num_pc=buscarProducto(jsonProductos,parser,"PBC_MC");
        int num_mb1=buscarProducto(jsonProductos,parser,"PB1_MB1");
        int num_mb2=buscarProducto(jsonProductos,parser,"PB1_MB1");
        int num_mb3=buscarProducto(jsonProductos,parser,"PB1_MB1");
        int num_mb4=buscarProducto(jsonProductos,parser,"PB1_MB1");
        int num_mb5=buscarProducto(jsonProductos,parser,"PB1_MB1");
        int num_mc=buscarProducto(jsonProductos,parser,"PBC_MC");
        int num_di_b=buscarProducto(jsonProductos,parser,"DI_B");
        int num_sf_b=buscarProducto(jsonProductos,parser,"SF_B");
        int num_ebt_b=buscarProducto(jsonProductos,parser,"EBT_B");
        int num_ipp=buscarProducto(jsonProductos,parser,"IPP");
        int num_con_ct=buscarProducto(jsonProductos,parser,"CON_CT");
        int num_inf=buscarProducto(jsonProductos,parser,"INF");
        //Productos Apropiacion conocimiento
        int num_ppc=buscarProducto(jsonProductos,parser,"PPC");
        int num_epc=buscarProducto(jsonProductos,parser,"EPC");
        int num_epa=buscarProducto(jsonProductos,parser,"EPA");
        int num_pcc=buscarProducto(jsonProductos,parser,"PCC");
        int num_gc=buscarProducto(jsonProductos,parser,"GC");//SUMAR
        int num_ec_a=buscarProducto(jsonProductos,parser,"EC_A");
        int num_ec_b=buscarProducto(jsonProductos,parser,"EC_B");
        int num_rc_a=buscarProducto(jsonProductos,parser,"RC_A");
        int num_rc_b=buscarProducto(jsonProductos,parser,"RC_B");
        int num_wp=buscarProducto(jsonProductos,parser,"WP");
        int num_bol=buscarProducto(jsonProductos,parser,"BOL");
        int num_erl=buscarProducto(jsonProductos,parser,"ERL");
        int num_ifi=buscarProducto(jsonProductos,parser,"IFI");
                    
        //Productos formacion recurso humano a
                    
        int num_td_a=buscarProducto(jsonProductos,parser,"TD_A");
        int num_td_b=buscarProducto(jsonProductos,parser,"TD_B");
        int num_ap_a=buscarProducto(jsonProductos,parser,"AP_A");
        int num_ap_c=buscarProducto(jsonProductos,parser,"AP_C");
                
        //Producto formacion recurso humano b
                
        int num_tm_a=buscarProducto(jsonProductos,parser,"TM_A");
        int num_tm_b=buscarProducto(jsonProductos,parser,"TM_B");
        int num_tp_a=buscarProducto(jsonProductos,parser,"TP_A");
        int num_tp_b=buscarProducto(jsonProductos,parser,"TP_B");
        int num_pid_a=buscarProducto(jsonProductos,parser,"PID_A");
        int num_pid_b=buscarProducto(jsonProductos,parser,"PID_B");
        int num_pid_c=buscarProducto(jsonProductos,parser,"PID_C");
        int num_pic_a=buscarProducto(jsonProductos,parser,"PIC_A");
        int num_pic_b=buscarProducto(jsonProductos,parser,"PIC_B");
        int num_pic_c=buscarProducto(jsonProductos,parser,"PIC_C");
        int num_pf_a=buscarProducto(jsonProductos,parser,"PF_A");
        int num_pf_b=buscarProducto(jsonProductos,parser,"PF_B");
        int num_pe=buscarProducto(jsonProductos,parser,"PE");
        int num_ap_b=buscarProducto(jsonProductos,parser,"AP_B");
        int num_ap_d=buscarProducto(jsonProductos,parser,"AP_D");
        int num_apo=buscarProducto(jsonProductos,parser,"APO");
        
        int num_investigadores=jsonPerfilesColaboracion.get(0).getAsJsonObject().get("integrantes_grupo").getAsInt();
        
        int num_grupos_investigacion=jsonPerfilesColaboracion.get(0).getAsJsonObject().get("grupos_colaboracion").getAsInt();;
        
        int num_productos= num_art_a1+num_art_a2+num_art_b+num_art_c+num_art_d+
                num_lib_a1+num_lib_a+num_lib_b+num_cap_lib_a1+num_cap_lib_a+
                num_cap_lib_b+num_pa1+num_pa2+num_ma1+num_ma2+num_pa3+num_pa4+
                num_ma3+num_ma4+num_pb1+num_pb2+num_pb3+num_pb4+num_pb5+num_pc+
                num_mb1+num_mb2+num_mb3+num_mb4+num_mb5+num_mc+num_di_a+
                num_di_b+num_eci_a+num_sf_a+num_sf_b+num_pp_a+num_pi_a+num_se+
                num_ebt_a+num_ebt_b+num_ipp+num_con_ct+num_inf;
        
        System.out.println("número productos "+num_productos);
                //104;
        
        double indicador_top=ConstantesModelo.indicador_top(num_art_a1, num_art_a2, num_lib_a1, num_lib_a, num_cap_lib_a1, num_cap_lib_a, num_pa1, num_pa2, num_ma1, num_ma2);
        
        double indicador_a=ConstantesModelo.indicador_a(num_art_b, num_art_c, num_lib_b, num_cap_lib_b, num_pa3, num_pa4, num_ma3, num_ma4, num_di_a, num_eci_a, num_sf_a, num_pp_a, num_pi_a, num_sd, num_se, num_ebt_a);
        
        double indicador_b=ConstantesModelo.indicador_b(num_art_d, num_pb1, num_pb2, num_pb3, num_pb4, num_pb5, num_pc, num_mb1, num_mb2, num_mb3, num_mb4, num_mb5, num_mc, num_di_b, num_sf_b, num_ebt_b, num_ipp, num_con_ct, num_inf);
        
        double indicador_apropiacion_conocimiento=ConstantesModelo.indicador_apropiacion_conocimiento(num_ppc, num_epc, num_epa, num_pcc, num_gc, num_ec_a, num_ec_b, num_rc_a, num_rc_b, num_wp, num_bol, num_erl, num_ifi);
        
        double indicador_formacion_recurso_humano_a=ConstantesModelo.indicador_formacion_rec_humano_a(num_td_a, num_td_b, num_ap_a, num_ap_c);
        
        double indicador_formacion_recurso_humano_b=ConstantesModelo.indicador_formacion_rec_humano_b(num_tm_a, num_tm_b, num_tp_a, num_tp_b, num_pid_a, num_pid_b, num_pid_c, num_pic_a, num_pic_b, num_pic_c, num_pf_a, num_pf_b, num_pe, num_ap_b, num_ap_d, num_apo);
        
        double indicador_cohesion=ConstantesModelo.indicador_cohesion(num_investigadores, num_productos);
        
        double indicador_colaboracion=ConstantesModelo.indicador_colaboracion(num_grupos_investigacion, num_productos);
        
        double indice_top=ConstantesModelo.indice_top(indicador_top);
        System.out.println("indice_top "+indice_top);
        double indice_a=ConstantesModelo.indice_a(indicador_a);
        System.out.println("indice_a "+indice_a);
        double indice_b=ConstantesModelo.indice_b(indicador_b);
        System.out.println("indice_b "+indice_b);
        double indice_apropiacion_conocimiento=ConstantesModelo.indice_apropiacion_conocimiento(indicador_apropiacion_conocimiento);
        System.out.println("indice_apropiacion_conocimiento "+indice_apropiacion_conocimiento);
        double indice_formacion_recurso_humano_a=ConstantesModelo.indice_formacion_rec_humano_a(indicador_formacion_recurso_humano_a);
        System.out.println("indice_formacion_recurso_humano_a "+indice_formacion_recurso_humano_a);
        double indice_formacion_recurso_humano_b=ConstantesModelo.indice_formacion_rec_humano_b(indicador_formacion_recurso_humano_b);
        System.out.println("indice_formacion_recurso_humano_b "+indice_formacion_recurso_humano_b);
        double indice_cohesion=ConstantesModelo.indice_cohesion(indicador_cohesion);
        System.out.println("indice_cohesion "+indice_cohesion);
        double indice_colaboracion=ConstantesModelo.indice_colaboracion(indicador_colaboracion);
        System.out.println("indice_colaboracion "+indice_colaboracion);
        double indicador_grupo=ConstantesModelo.indicador_grupo(indice_top, indice_a, indice_b, indice_apropiacion_conocimiento, indice_formacion_recurso_humano_a, indice_formacion_recurso_humano_b, indice_cohesion, indice_colaboracion);
        
        System.out.println("indicador_grupo "+indicador_grupo);
        
		return null;
	}
	private static int buscarProducto(JsonArray array,JsonParser parser, String tipo){
		for (int i=0;i<array.size();i++){
			if(!array.get(i).toString().equals("null")){
				JsonObject object=parser.parse(array.get(i).toString()).getAsJsonObject();
				if(object.get("c_categoria").getAsString().equals(tipo)){
					return object.get("numero").getAsInt();
				}
			}
		}	
		return 0;
	}
}
