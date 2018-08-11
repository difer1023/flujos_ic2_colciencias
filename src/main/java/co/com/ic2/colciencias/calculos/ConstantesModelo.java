package co.com.ic2.colciencias.calculos;

public class ConstantesModelo {
	//Peso subtipo de alta calidad
    static final int ART_A1 = 100;
    static final int ART_D = 5;
    static final int LIB_A1 = 300;
    static final int CAP_LIB_A1 = 60;
    static final int PA1 = 500;
    static final int MA1 = 500;
    static final int VV_A1 = 300;
    static final int VA_A = 300;
    static final int AAD_A1 = 100;
    static final int DI_A = 35;
    static final int ECI_A = 35;
    static final int SF_A = 35;
    static final int PP_A = 35;
    static final int SD = 35;
    static final int SE = 100;
    static final int EBT_A = 100;
    static final int ICC_A = 100;
    static final int IG_A1 = 100;
    static final int IPP = 100;
    static final int RNR = 100;
    static final int RNL_A = 100;
    static final int CON_CT = 15;
    static final int CON_AAD = 15;
    static final int INF = 16;
    static final int MR = 14;
    static final int PPC = 100;
    static final int EPA = 100;
    static final int PCC = 100;
    static final int GC = 100;
    static final int EC_A = 100;
    static final int RC_A = 100;
    static final int TC = 100;
    static final int ECA_A = 100;
    static final int WP = 100;
    static final int BOL = 100;
    static final int ERL = 100;
    static final int IFI = 100;
    static final int TD_A = 160;
    static final int TM_A = 70;
    static final int TP_A = 20;
    static final int PID_A = 50;
    static final int PIC_A = 50;
    static final int PF_A = 50;
    static final int PE = 100;
    static final int AP_A = 100;
    static final int AP_C = 100;
    static final int APO = 30;

    //Pesos relativos
    static final int PR_ART_A1 = 10;
    static final int PR_ART_A2 = 6;
    static final double PR_ART_B = 3.5;
    static final int PR_ART_C = 2;
    static final int PR_ART_D = 10;
    static final int PR_LIB_A1 = 10;
    static final int PR_LIB_A = 9;
    static final double PR_LIB_B = 8;
    static final int PR_CAP_LIB_A1 = 10;
    static final int PR_CAP_LIB_A = 9;
    static final int PR_CAP_LIB_B = 8;
    static final int PR_DI_A = 8;
    static final int PR_DI_B = 4;
    static final int PR_ECI_A = 4;
    static final int PR_SF_A = 10;
    static final int PR_SF_B = 6;
    static final int PR_PP_A = 4;
    static final int PR_PI_A = 4;
    static final int PR_SD = 4;
    static final int PR_SE = 5;
    static final int PR_EBT_A = 10;
    static final int PR_EBT_B = 8;
    static final int PR_IPP = 5;
    static final int PR_CON_CT = 10;
    static final int PR_INF = 5;
    static final int PR_PPC = 10;
    static final int PR_EPC = 5;
    static final int PR_EPA = 10;
    static final int PR_PCC = 10;
    static final int PR_GC = 5;
    static final int PR_EC_A = 10;
    static final int PR_EC_B = 6;
    static final int PR_RC_A = 10;
    static final int PR_RC_B = 6;
    static final int PR_WP = 10;
    static final int PR_BOL = 3;
    static final int PR_ELR = 6;
    static final int PR_IFI = 2;
    static final int PR_TD_A = 10;
    static final int PR_TD_B = 5;
    static final int PR_TM_A = 10;
    static final int PR_TM_B = 5;
    static final int PR_TP_A = 10;
    static final int PR_TP_B = 5;
    static final int PR_PID_A = 10;
    static final int PR_PID_B = 6;
    static final int PR_PID_C = 2;
    static final int PR_PIC_A = 10;
    static final int PR_PIC_B = 6;
    static final int PR_PIC_C = 2;
    static final int PR_PF_A = 10;
    static final int PR_PF_B = 8;
    static final int PR_PE = 10;
    static final int PR_AP_A = 10;
    static final int PR_AP_B = 8;
    static final int PR_AP_C = 5;
    static final int PR_AP_D = 3;
    static final int PR_APO = 10;
    static final int PR_PA1=10;
    static final int PR_PA2=7;
    static final int PR_PA3=6;
    static final double PR_PA4=5.5;
    static final int PR_PB1=5;
    static final double PR_PB2=3.5;
    static final int PR_PB3=3;
    static final double PR_PB4=2.6;
    static final double PR_PB5=2.5;
    static final double PR_PC=1.8;
    static final int PR_MA1=6;
    static final double PR_MA2=4.2;
    static final double PR_MA3=3.6;
    static final double PR_MA4=3.33;
    static final int PR_MB1=3;
    static final double PR_MB2=2.1;
    static final double PR_MB3=1.8;
    static final double PR_MB4=1.7;
    static final double PR_MB5=1.5;
    static final double PR_MC=1.1;

    //Pesos globales
    static final int PG_ART_A1 = ART_A1 * PR_ART_A1;
    static final int PG_ART_A2 = ART_A1 * PR_ART_A2;
    static final double PG_ART_B = ART_A1 * PR_ART_B;
    static final int PG_ART_C = ART_A1 * PR_ART_C;
    static final int PG_ART_D = ART_D * PR_ART_D;
    static final int PG_LIB_A1 = LIB_A1 * PR_LIB_A1;
    static final int PG_LIB_A = LIB_A1 * PR_LIB_A;
    static final double PG_LIB_B = LIB_A1 * PR_LIB_B;
    static final int PG_CAP_LIB_A1 = CAP_LIB_A1 * PR_CAP_LIB_A1;
    static final int PG_CAP_LIB_A = CAP_LIB_A1 * PR_CAP_LIB_A;
    static final int PG_CAP_LIB_B = CAP_LIB_A1 * PR_CAP_LIB_B;
    static final int PG_SF_A = SF_A * PR_SF_A;
    static final int PG_SF_B = SF_A * PR_SF_B;
    static final int PG_CON_CT = CON_CT * PR_CON_CT;
    static final int PG_INF = INF * PR_INF;
    static final int PG_PPC = PPC * PR_PPC;
    static final int PG_EPC = PPC * PR_EPC;
    static final int PG_EPA = EPA * PR_EPA;
    static final int PG_PCC = PCC * PR_PCC;
    static final int PG_GC = GC * PR_GC;
    static final int PG_EC_A = EC_A * PR_EC_A;
    static final int PG_EC_B = EC_A * PR_EC_B;
    static final int PG_RC_A = RC_A * PR_RC_A;
    static final int PG_RC_B = RC_A * PR_RC_B;
    static final int PG_WP = WP * PR_WP;
    static final int PR_ERL = ERL * PR_ELR;
    static final int PG_IFI = IFI * PR_IFI;
    static final int PG_TD_A = TD_A * PR_TD_A;
    static final int PG_TD_B = TD_A * PR_TD_B;
    static final int PG_TM_A = TM_A * PR_TM_A;
    static final int PG_TM_B = TM_A * PR_TM_B;
    static final int PG_TP_A = TP_A * PR_TP_A;
    static final int PG_TP_B = TP_A * PR_TP_B;
    static final int PG_PID_A = PID_A * PR_PID_A;
    static final int PG_PID_B = PID_A * PR_PID_B;
    static final int PG_PID_C = PID_A * PR_PID_C;
    static final int PG_PIC_A = PIC_A * PR_PIC_A;
    static final int PG_PIC_B = PIC_A * PR_PIC_B;
    static final int PG_PIC_C = PIC_A * PR_PIC_C;
    static final int PG_PF_A = PF_A * PR_PF_A;
    static final int PG_PF_B = PF_A * PR_PF_B;
    static final int PG_PE = PE * PR_PE;
    static final int PG_AP_A = AP_A * PR_AP_A;
    static final int PG_AP_B = AP_A * PR_AP_B;
    static final int PG_AP_C = AP_C * PR_AP_C;
    static final int PG_AP_D = AP_C * PR_AP_D;
    
    static final int PG_DI_A = DI_A * PR_DI_A;
    static final int PG_DI_B = DI_A * PR_DI_B;
    static final int PG_ECI_A = ECI_A * PR_ECI_A;
    static final int PG_PP_A = PP_A * PR_PP_A;
    //No está en tabla de subtipo de alta calidad
    static final int PG_PI_A= DI_A * PR_PI_A;
    static final int PG_SD = SD * PR_SD;
    static final int PG_SE = SE * PR_SE;
    static final int PG_EBT_A = EBT_A * PR_EBT_A;
    static final int PG_EBT_B = EBT_A * PR_EBT_B;
    static final int PG_IPP = IPP * PR_IPP;
    static final int PG_BOL = BOL * PR_BOL;
    static final int PG_APO = APO * PR_APO;
    
    static final int PG_PA1= PA1 * PR_PA1;
    static final int PG_PA2= PA1 * PR_PA2;
    static final int PG_PA3= PA1 * PR_PA3;
    static final double PG_PA4= PA1 * PR_PA4;
    static final int PG_PB1= PA1 * PR_PB1;
    static final double PG_PB2= PA1 * PR_PB2;
    static final int PG_PB3= PA1 * PR_PB3;
    static final double PG_PB4= PA1 * PR_PB4;
    static final double PG_PB5= PA1 * PR_PB5;
    static final double PG_PC= PA1 * PR_PC;
    
    static final int PG_MA1= MA1 * PR_MA1;
    static final double PG_MA2= MA1 * PR_MA2;
    static final double PG_MA3= MA1 * PR_MA3;
    static final double PG_MA4= MA1 * PR_MA4;
    static final int PG_MB1= MA1 * PR_MB1;
    static final double PG_MB2= MA1 * PR_MB2;
    static final double PG_MB3= MA1 * PR_MB3;
    static final double PG_MB4= MA1 * PR_MB4;
    static final double PG_MB5= MA1 * PR_MB5;
    static final double PG_MC= MA1 * PR_MC;

    //Número de productos
    /*int num_art_a1;
    int num_art_a2;
    int num_art_b;
    int num_art_c;
    int num_art_d;
    int num_lib_a1;
    int num_lib_a;
    int num_lib_b;
    int num_cap_lib_a1;
    int num_cap_lib_a;
    int num_cap_lib_b;
    int num_sf_a;
    int num_sf_b;
    int num_di_a;
    int num_di_b;
    int num_eci_a;
    int num_pp_a;
    int num_pi_a;
    int num_sd;
    int num_se;
    int num_ebt_a;
    int num_ebt_b;
    int num_ipp;
    int num_con_ct;
    int num_inf;
    int num_ppc;
    int num_epc;
    int num_epa;
    int num_pcc;
    //falta averiguar otros GC
    int num_gc;
    int num_ec_a;
    int num_ec_b;
    int num_rc_a;
    int num_rc_b;
    int num_wp;
    int num_bol;
    int num_erl;
    int num_ifi;
    int num_td_a;
    int num_td_b;
    int num_tm_a;
    int num_tm_b;
    int num_tp_a;
    int num_tp_b;
    int num_pid_a;
    int num_pid_b;
    int num_pid_c;
    int num_pic_a;
    int num_pic_b;
    int num_pic_c;
    int num_pf_a;
    int num_pf_b;
    int num_pe;
    int num_ap_a;
    int num_ap_b;
    int num_ap_c;
    int num_ap_d;
    int num_apo;*/
    //total de productos
    /*int num_productos;
    int num_investigadores;
    int num_grupos_colaboracion;*/
    
    
    //Ventana de observación
    static int VO_ART = 7;
    static int VO_ART_D = 5;
    static int VO_LIB = 7;
    static int VO_CAP_LIB = 5;
    static int VO_PA = 10;
    static int VO_DI = 5;
    static int VO_ECI = 5;
    static int VO_SF = 5;
    static int VO_PP = 5;
    static int VO_PI = 5;
    static int VO_SE = 5;
    static int VO_EBT = 5;
    static int VO_IPP = 5;
    static int VO_CON_CT = 5;
    static int VO_INF = 5;
    static int VO_PPC = 5;
    static int VO_EPC = 5;
    static int VO_EPA = 5;
    static int VO_PCC = 5;
    static int VO_GC = 5;
    static int VO_EC = 5;
    static int VO_RC = 5;
    static int VO_WP = 5;
    static int VO_BOL = 5;
    static int VO_ERL = 5;
    static int VO_IFI = 5;
    static int VO_TD = 5;
    static int VO_TM = 5;
    static int VO_TP = 5;
    static int VO_PID = 5;
    static int VO_PF = 5;
    static int VO_PE = 5;
    static int VO_PIC = 5;
    static int VO_AP = 5;
    static int VO_APO = 5;
    //incierta ventana de SD
    static int VO_SD = 5;

    //Cálculo de lambdas
    public static double lambda_art_a2(double num_art_a2) {
        return Math.log((num_art_a2 / VO_ART) + 1);
    }

    public static double lambda_art_a1(double num_art_a1) {
        return Math.log((num_art_a1 / VO_ART) + 1);
    }

    public static double lambda_art_b(double num_art_b) {
        return Math.log((num_art_b / VO_ART) + 1);
    }

    public static double lambda_art_c(double num_art_c) {
        return Math.log((num_art_c / VO_ART) + 1);
    }

    public static double lambda_art_d(double num_art_d) {
        return Math.log((num_art_d / VO_ART_D) + 1);
    }

    public static double lambda_lib_a1(double num_lib_a1) {
        return Math.log((num_lib_a1 / VO_LIB) + 1);
    }

    public static double lambda_lib_a(double num_lib_a) {
        return Math.log((num_lib_a / VO_LIB) + 1);
    }

    public static double lambda_lib_b(double num_lib_b) {
        return Math.log((num_lib_b / VO_LIB) + 1);
    }

    public static double lambda_cap_lib_a1(double num_cap_lib_a1) {
        return Math.log((num_cap_lib_a1 / VO_CAP_LIB) + 1);
    }

    public static double lambda_cap_lib_a(double num_cap_lib_a) {
        return Math.log((num_cap_lib_a / VO_CAP_LIB) + 1);
    }

    public static double lambda_cap_lib_b(double num_cap_lib_b) {
        return Math.log((num_cap_lib_b / VO_CAP_LIB) + 1);
    }

    public static double lambda_di_a(double num_di_a) {
        return Math.log((num_di_a / VO_DI) + 1);
    }

    public static double lambda_di_b(double num_di_b) {
        return Math.log((num_di_b / VO_DI) + 1);
    }

    public static double lambda_eci_a(double num_eci_a) {
        return Math.log((num_eci_a / VO_ECI) + 1);
    }

    public static double lambda_sf_a(double num_sf_a) {
        return Math.log((num_sf_a / VO_SF) + 1);
    }

    public static double lambda_sf_b(double num_sf_b) {
        return Math.log((num_sf_b / VO_SF) + 1);
    }

    public static double lambda_pp_a(double num_pp_a) {
        return Math.log((num_pp_a / VO_PP) + 1);
    }

    public static double lambda_pi_a(double num_pi_a) {
        return Math.log((num_pi_a / VO_PI) + 1);
    }

    public static double lambda_sd(double num_sd) {
        return Math.log((num_sd / VO_SD) + 1);
    }

    public static double lambda_se(double num_se) {
        return Math.log((num_se / VO_SE) + 1);
    }

    public static double lambda_ebt_a(double num_ebt_a) {
        return Math.log((num_ebt_a / VO_EBT) + 1);
    }

    public static double lambda_ebt_b(double num_ebt_b) {
        return Math.log((num_ebt_b / VO_EBT) + 1);
    }

    public static double lambda_ipp(double num_ipp) {
        return Math.log((num_ipp / VO_IPP) + 1);
    }

    public static double lambda_con_ct(double num_con_ct) {
        return Math.log((num_con_ct / VO_CON_CT) + 1);
    }

    public static double lambda_inf(double num_inf) {
        return Math.log((num_inf / VO_INF) + 1);
    }

    public static double lambda_ppc(double num_ppc) {
        return Math.log((num_ppc / VO_PPC) + 1);
    }

    public static double lambda_epc(double num_epc) {
        return Math.log((num_epc / VO_EPC) + 1);
    }

    public static double lambda_epa(double num_epa) {
        return Math.log((num_epa / VO_EPA) + 1);
    }

    public static double lambda_pcc(double num_pcc) {
        return Math.log((num_pcc / VO_PCC) + 1);
    }

    public static double lambda_gc(double num_gc) {
        return Math.log((num_gc / VO_GC) + 1);
    }

    public static double lambda_ec_a(double num_ec_a) {
        return Math.log((num_ec_a / VO_EC) + 1);
    }

    public static double lambda_ec_b(double num_ec_b) {
        return Math.log((num_ec_b / VO_EC) + 1);
    }

    public static double lambda_rc_a(double num_rc_a) {
        return Math.log((num_rc_a / VO_RC) + 1);
    }

    public static double lambda_rc_b(double num_rc_b) {
        return Math.log((num_rc_b / VO_RC) + 1);
    }

    public static double lambda_wp(double num_wp) {
        return Math.log((num_wp / VO_WP) + 1);
    }

    public static double lambda_bol(double num_bol) {
        return Math.log((num_bol / VO_BOL) + 1);
    }

    public static double lambda_erl(double num_erl) {
        return Math.log((num_erl / VO_ERL) + 1);
    }

    public static double lambda_ifi(double num_ifi) {
        return Math.log((num_ifi / VO_IFI) + 1);
    }

    public static double lambda_td_a(double num_td_a) {
        return Math.log((num_td_a / VO_TD) + 1);
    }

    public static double lambda_td_b(double num_td_b) {
        return Math.log((num_td_b / VO_TD) + 1);
    }

    public static double lambda_tm_a(double num_tm_a) {
        return Math.log((num_tm_a / VO_TM) + 1);
    }

    public static double lambda_tm_b(double num_tm_b) {
        return Math.log((num_tm_b / VO_TM) + 1);
    }

    public static double lambda_tp_a(double num_tp_a) {
        return Math.log((num_tp_a / VO_TP) + 1);
    }

    public static double lambda_tp_b(double num_tp_b) {
        return Math.log((num_tp_b / VO_TP) + 1);
    }

    public static double lambda_pid_a(double num_pid_a) {
        return Math.log((num_pid_a / VO_PID) + 1);
    }

    public static double lambda_pid_b(double num_pid_b) {
        return Math.log((num_pid_b / VO_PID) + 1);
    }

    public static double lambda_pid_c(double num_pid_c) {
        return Math.log((num_pid_c / VO_PID) + 1);
    }

    public static double lambda_pic_a(double num_pic_a) {
        return Math.log((num_pic_a / VO_PIC) + 1);
    }

    public static double lambda_pic_b(double num_pic_b) {
        return Math.log((num_pic_b / VO_PIC) + 1);
    }

    public static double lambda_pic_c(double num_pic_c) {
        return Math.log((num_pic_c / VO_PIC) + 1);
    }

    public static double lambda_pf_a(double num_pf_a) {
        return Math.log((num_pf_a / VO_PF) + 1);
    }

    public static double lambda_pf_b(double num_pf_b) {
        return Math.log((num_pf_b / VO_PF) + 1);
    }

    public static double lambda_pe(double num_pe) {
        return Math.log((num_pe / VO_PE) + 1);
    }

    public static double lambda_ap_a(double num_ap_a) {
        return Math.log((num_ap_a / VO_AP) + 1);
    }

    public static double lambda_ap_b(double num_ap_b) {
        return Math.log((num_ap_b / VO_AP) + 1);
    }

    public static double lambda_ap_c(double num_ap_c) {
        return Math.log((num_ap_c / VO_AP) + 1);
    }

    public static double lambda_ap_d(double num_ap_d) {
        return Math.log((num_ap_d / VO_AP) + 1);
    }

    public static double lambda_apo(double num_apo) {
        return Math.log((num_apo / VO_APO) + 1);
    }
    
    public static double lambda_pa1(double num_pa1) {
        return Math.log((num_pa1 / VO_PA) + 1);
    }
    
    public static double lambda_pa2(double num_pa2) {
        return Math.log((num_pa2 / VO_PA) + 1);
    }
    
    public static double lambda_pa3(double num_pa3) {
        return Math.log((num_pa3 / VO_PA) + 1);
    }
    
    public static double lambda_pa4(double num_pa4) {
        return Math.log((num_pa4 / VO_PA) + 1);
    }

    public static double lambda_pb1(double num_pb1) {
        return Math.log((num_pb1 / VO_PA) + 1);
    }
    
    public static double lambda_pb2(double num_pb2) {
        return Math.log((num_pb2 / VO_PA) + 1);
    }
    
    public static double lambda_pb3(double num_pb3) {
        return Math.log((num_pb3 / VO_PA) + 1);
    }
    
    public static double lambda_pb4(double num_pb4) {
        return Math.log((num_pb4 / VO_PA) + 1);
    }
    
    public static double lambda_pb5(double num_pb5) {
        return Math.log((num_pb5 / VO_PA) + 1);
    }
    public static double lambda_pc(double num_pc) {
        return Math.log((num_pc / VO_PA) + 1);
    }
    
    //No hay certeza sobre VO
    public static double lambda_ma1(double num_ma1) {
        return Math.log((num_ma1 / VO_PA) + 1);
    }
    
    public static double lambda_ma2(double num_ma2) {
        return Math.log((num_ma2 / VO_PA) + 1);
    }
    
    public static double lambda_ma3(double num_ma3) {
        return Math.log((num_ma3 / VO_PA) + 1);
    }
    
    public static double lambda_ma4(double num_ma4) {
        return Math.log((num_ma4 / VO_PA) + 1);
    }

    public static double lambda_mb1(double num_mb1) {
        return Math.log((num_mb1 / VO_PA) + 1);
    }
    
    public static double lambda_mb2(double num_mb2) {
        return Math.log((num_mb2 / VO_PA) + 1);
    }
    
    public static double lambda_mb3(double num_mb3) {
        return Math.log((num_mb3 / VO_PA) + 1);
    }
    
    public static double lambda_mb4(double num_mb4) {
        return Math.log((num_mb4 / VO_PA) + 1);
    }
    
    public static double lambda_mb5(double num_mb5) {
        return Math.log((num_mb5 / VO_PA) + 1);
    }
    public static double lambda_mc(double num_mc) {
        return Math.log((num_mc / VO_PA) + 1);
    }
    //Indicadores de producción por tipo de producto
    public static double indicador_top(
            double num_art_a1, double num_art_a2, double num_lib_a1, double num_lib_a,
            double num_cap_lib_a1, double num_cap_lib_a, double num_pa1, double num_pa2,
            double num_ma1, double num_ma2 ) {

        return (PG_ART_A1*lambda_art_a1(num_art_a1))+
                (PG_ART_A2*lambda_art_a2(num_art_a2))+
                (PG_LIB_A1*lambda_lib_a1(num_lib_a1))+
                (PG_LIB_A*lambda_lib_a(num_lib_a))+
                (PG_CAP_LIB_A1*lambda_cap_lib_a1(num_cap_lib_a1))+
                (PG_CAP_LIB_A*lambda_cap_lib_a(num_cap_lib_a))+
                (PG_PA1*lambda_pa1(num_pa1))+
                (PG_PA2*lambda_pa2(num_pa2))+
                (PG_MA1*lambda_ma1(num_ma1))+
                (PG_MA2*lambda_ma2(num_ma2));
    }
    
    public static double indicador_a(
            double num_art_b, double num_art_c, double num_lib_b,double num_cap_lib_b, 
            double num_pa3, double num_pa4, double num_ma3, double num_ma4, double num_di_a,
            double num_eci_a, double num_sf_a, double num_pp_a, double num_pi_a, double num_sd,
            double num_se, double num_ebt_a) {

        return (PG_ART_B*lambda_art_b(num_art_b))+
                (PG_ART_C*lambda_art_c(num_art_c))+
                (PG_LIB_B*lambda_lib_b(num_lib_b))+
                (PG_CAP_LIB_B*lambda_cap_lib_b(num_cap_lib_b))+
                (PG_PA3*lambda_pa3(num_pa3))+
                (PG_PA4*lambda_pa4(num_pa4))+
                (PG_MA3*lambda_ma3(num_ma3))+
                (PG_MA4*lambda_ma4(num_ma4))+
                (PG_DI_A*lambda_ma4(num_di_a))+
                (PG_ECI_A*lambda_eci_a(num_eci_a))+
                (PG_SF_A*lambda_sf_a(num_sf_a))+
                (PG_PP_A*lambda_pp_a(num_pp_a))+
                (PG_PI_A*lambda_pi_a(num_pi_a))+
                (PG_SD*lambda_sd(num_sd))+
                (PG_SE*lambda_se(num_se))+
                (PG_EBT_A*lambda_ebt_a(num_ebt_a));
    }
    
    public static double indicador_b(
            double num_art_d, double num_pb1, double num_pb2, double num_pb3, double num_pb4,
            double num_pb5, double num_pc, double num_mb1, double num_mb2, double num_mb3, 
            double num_mb4, double num_mb5, double num_mc, double num_di_b, double num_sf_b, 
            double num_ebt_b, double num_ipp, double num_con_ct, double num_inf) {

        return (PG_ART_D*lambda_art_d(num_art_d))+
                (PG_PB1*lambda_pb1(num_pb1))+
                (PG_PB2*lambda_pb2(num_pb2))+
                (PG_PB3*lambda_pb3(num_pb3))+
                (PG_PB4*lambda_pb4(num_pb4))+
                (PG_PB5*lambda_pb5(num_pb5))+
                (PG_PC*lambda_pc(num_pc))+
                (PG_MB1*lambda_mb1(num_mb1))+
                (PG_MB2*lambda_mb2(num_mb2))+
                (PG_MB3*lambda_mb3(num_mb3))+
                (PG_MB4*lambda_mb4(num_mb4))+
                (PG_MB5*lambda_mb5(num_mb5))+
                (PG_MC*lambda_mc(num_mc))+
                (PG_DI_B*lambda_di_b(num_di_b))+
                (PG_SF_B*lambda_sf_b(num_sf_b))+
                (PG_EBT_B*lambda_ebt_b(num_ebt_b))+
                (PG_IPP*lambda_ipp(num_ipp))+
                (PG_CON_CT*lambda_con_ct(num_con_ct))+
                (PG_INF*lambda_inf(num_inf));
    }
    
    public static double indicador_apropiacion_conocimiento(
            double num_ppc, double num_epc, double num_epa, double num_pcc, double num_gc, 
            double num_ec_a, double num_ec_b, double num_rc_a, double num_rc_b, double num_wp, 
            double num_bol, double num_erl, double num_ifi) {

        return (PG_PPC*lambda_ppc(num_ppc))+
                (PG_EPC*lambda_epc(num_epc))+
                (PG_EPA*lambda_epa(num_epa))+
                (PG_PCC*lambda_pcc(num_pcc))+
                (PG_GC*lambda_gc(num_gc))+
                (PG_EC_A*lambda_ec_a(num_ec_a))+
                (PG_EC_B*lambda_ec_b(num_ec_b))+
                (PG_RC_A*lambda_rc_a(num_rc_a))+
                (PG_RC_B*lambda_rc_b(num_rc_b))+
                (PG_WP*lambda_wp(num_wp))+
                (PG_BOL*lambda_bol(num_bol))+
                (PR_ERL*lambda_erl(num_erl))+
                (PG_IFI*lambda_ifi(num_ifi));
    }
    
    public static double indicador_formacion_rec_humano_a(
            double num_td_a, double num_td_b, double num_ap_a, double num_ap_c) {
        return (PG_TD_A*lambda_td_a(num_td_a))+
                (PG_TD_B*lambda_td_b(num_td_b))+
                (PG_AP_A*lambda_ap_a(num_ap_a))+
                (PG_AP_C*lambda_ap_c(num_ap_c));
    }
    
    public static double indicador_formacion_rec_humano_b(
            double num_tm_a, double num_tm_b, double num_tp_a, double num_tp_b, 
            double num_pid_a, double num_pid_b, double num_pid_c, double num_pic_a,
            double num_pic_b, double num_pic_c, double num_pf_a, double num_pf_b, 
            double num_pe, double num_ap_b, double num_ap_d, double num_apo) {

        return (PG_TM_A*lambda_tm_a(num_tm_a))+
                (PG_TM_B*lambda_tm_b(num_tm_b))+
                (PG_TP_A*lambda_tp_a(num_tp_a))+
                (PG_TP_B*lambda_tp_b(num_tp_b))+
                (PG_PID_A*lambda_pid_a(num_pid_a))+
                (PG_PID_B*lambda_pid_b(num_pid_b))+
                (PG_PID_C*lambda_pid_c(num_pid_c))+
                (PG_PIC_A*lambda_pic_a(num_pic_a))+
                (PG_PIC_B*lambda_pic_b(num_pic_b))+
                (PG_PIC_C*lambda_pic_c(num_pic_c))+
                (PG_PF_A*lambda_pf_a(num_pf_a))+
                (PG_PF_B*lambda_pf_b(num_pf_b))+
                (PG_PE*lambda_pe(num_pe))+
                (PG_AP_B*lambda_ap_b(num_ap_b))+
                (PG_AP_D*lambda_ap_d(num_ap_d))+
                (PG_APO*lambda_apo(num_apo));
    }
    
    //Cálculo de máximos
    static final double max_indicador_top = 5909.85278958868;
    static final double max_indicador_a = 9108.145353597760;
    static final double max_indicador_b = 2516.73536068591;
    static final double max_indicador_apropiacion_conocimiento = 18365.0019580435;
    static final double max_indicador_formacion_rec_humano_a = 4366.06013943125;
    static final double max_indicador_formacion_rec_humano_b = 4045.45091902964;
    static final double max_indicador_cohesion = 4.93296089385474;
    static final double max_indicador_colaboracion = 9.5;
    
    //Cálculo indicadores de cohesión y colaboración
    public static double indicador_cohesion(double num_investigadores, double num_productos){
            return (num_investigadores/num_productos)-1;
    }
    
    public static double indicador_colaboracion(double num_grupos_colaboracion,
            double num_productos){
            return((num_grupos_colaboracion/num_productos)-1);
    }
    
    //Cálculo de índices de producción de clase
    public static double indice_top(double indicador_top){
    
            return(indicador_top/max_indicador_top);
    }
    
    public static double indice_a(double indicador_a){
    
            return(indicador_a/max_indicador_a);
    }
    
    public static double indice_b(double indicador_b){
    
            return(indicador_b/max_indicador_b);
    }
    
    public static double indice_apropiacion_conocimiento(
            double indicador_apropiacion_conocimiento){
    
            return(indicador_apropiacion_conocimiento/max_indicador_apropiacion_conocimiento);
    }
    
    public static double indice_formacion_rec_humano_a(double indicador_formacion_rec_humano_a){
    
            return(indicador_formacion_rec_humano_a/max_indicador_formacion_rec_humano_a);
    }
    
    public static double indice_formacion_rec_humano_b(double indicador_formacion_rec_humano_b){
    
            return(indicador_formacion_rec_humano_b/max_indicador_formacion_rec_humano_b);
    }
    
    public static double indice_cohesion(double indicador_cohesion){
    
            return(indicador_cohesion/max_indicador_cohesion);
    }
    
    public static double indice_colaboracion(double indicador_colaboracion){
    
            return(indicador_colaboracion/max_indicador_colaboracion);
    }
    
    public static double indicador_grupo(double indice_top, double indice_a, 
            double indice_b, double indice_apropiacion_conocimiento,
            double indice_formacion_rec_humano_a, 
            double indice_formacion_rec_humano_b, double indice_cohesion,
            double indice_colaboracion){
        
            return((indice_top*4)+(indice_a*2.5)+(indice_b*1)+
            (indice_apropiacion_conocimiento*0.2)+
            (indice_formacion_rec_humano_a*1)+(indice_formacion_rec_humano_b*0.5)
                    +(indice_cohesion*0.4)+(indice_colaboracion*0.4));
    }
    
    
    
    
    
}
