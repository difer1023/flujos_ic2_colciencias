package co.com.ic2.colciencias.gruplac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ClasificacionGrupo",namespace = "gruplac.colciencias.ic2.com.co")
public class ClasificacionGrupo {
	
	@XmlElement(name = "productos")
    private String productos;
	
	@XmlElement(name = "indicador_top")
    private double indicador_top;
	@XmlElement(name = "indicador_a")
    private double indicador_a;
	@XmlElement(name = "indicador_b")
    private double indicador_b;
	@XmlElement(name = "indicador_apropiacion_conocimiento")
    private double indicador_apropiacion_conocimiento;
	@XmlElement(name = "indicador_formacion_recurso_humano_a")
    private double indicador_formacion_recurso_humano_a;
	@XmlElement(name = "indicador_formacion_recurso_humano_b")
    private double indicador_formacion_recurso_humano_b;
	@XmlElement(name = "indicador_cohesion")
    private double indicador_cohesion;
	@XmlElement(name = "indicador_colaboracion")
    private double indicador_colaboracion;
	
	@XmlElement(name = "indicador_grupo")
    private double indicador_grupo;
	
	@XmlElement(name = "indice_top")
    private double indice_top;
	@XmlElement(name = "indice_a")
    private double indice_a;
	@XmlElement(name = "indice_b")
    private double indice_b;
	@XmlElement(name = "indice_apropiacion_conocimiento")
    private double indice_apropiacion_conocimiento;
	@XmlElement(name = "indice_formacion_recurso_humano_a")
    private double indice_formacion_recurso_humano_a;
	@XmlElement(name = "indice_formacion_recurso_humano_b")
    private double indice_formacion_recurso_humano_b;
	@XmlElement(name = "indice_cohesion")
    private double indice_cohesion;
	@XmlElement(name = "indice_colaboracion")
    private double indice_colaboracion;
	
	@XmlElement(name = "clasificacion_grupo")
    private String clasificacion_grupo;
	
	@XmlElement(name = "anos_existencia")
    private int anos_existencia;
	
	@XmlElement(name = "ano_creacion")
    private int ano_creacion;
	
	public String getProductos() {
		return productos;
	}
	public void setProductos(String productos) {
		this.productos = productos;
	}
	public double getIndicador_top() {
		return indicador_top;
	}
	public void setIndicador_top(double indicador_top) {
		this.indicador_top = indicador_top;
	}
	public double getIndicador_a() {
		return indicador_a;
	}
	public void setIndicador_a(double indicador_a) {
		this.indicador_a = indicador_a;
	}
	public double getIndicador_b() {
		return indicador_b;
	}
	public void setIndicador_b(double indicador_b) {
		this.indicador_b = indicador_b;
	}
	public double getIndicador_apropiacion_conocimiento() {
		return indicador_apropiacion_conocimiento;
	}
	public void setIndicador_apropiacion_conocimiento(double indicador_apropiacion_conocimiento) {
		this.indicador_apropiacion_conocimiento = indicador_apropiacion_conocimiento;
	}
	public double getIndicador_formacion_recurso_humano_a() {
		return indicador_formacion_recurso_humano_a;
	}
	public void setIndicador_formacion_recurso_humano_a(double indicador_formacion_recurso_humano_a) {
		this.indicador_formacion_recurso_humano_a = indicador_formacion_recurso_humano_a;
	}
	public double getIndicador_formacion_recurso_humano_b() {
		return indicador_formacion_recurso_humano_b;
	}
	public void setIndicador_formacion_recurso_humano_b(double indicador_formacion_recurso_humano_b) {
		this.indicador_formacion_recurso_humano_b = indicador_formacion_recurso_humano_b;
	}
	public double getIndicador_cohesion() {
		return indicador_cohesion;
	}
	public void setIndicador_cohesion(double indicador_cohesion) {
		this.indicador_cohesion = indicador_cohesion;
	}
	public double getIndicador_colaboracion() {
		return indicador_colaboracion;
	}
	public void setIndicador_colaboracion(double indicador_colaboracion) {
		this.indicador_colaboracion = indicador_colaboracion;
	}
	public double getIndicador_grupo() {
		return indicador_grupo;
	}
	public void setIndicador_grupo(double indicador_grupo) {
		this.indicador_grupo = indicador_grupo;
	}
	public double getIndice_top() {
		return indice_top;
	}
	public void setIndice_top(double indice_top) {
		this.indice_top = indice_top;
	}
	public double getIndice_a() {
		return indice_a;
	}
	public void setIndice_a(double indice_a) {
		this.indice_a = indice_a;
	}
	public double getIndice_b() {
		return indice_b;
	}
	public void setIndice_b(double indice_b) {
		this.indice_b = indice_b;
	}
	public double getIndice_apropiacion_conocimiento() {
		return indice_apropiacion_conocimiento;
	}
	public void setIndice_apropiacion_conocimiento(double indice_apropiacion_conocimiento) {
		this.indice_apropiacion_conocimiento = indice_apropiacion_conocimiento;
	}
	public double getIndice_formacion_recurso_humano_a() {
		return indice_formacion_recurso_humano_a;
	}
	public void setIndice_formacion_recurso_humano_a(double indice_formacion_recurso_humano_a) {
		this.indice_formacion_recurso_humano_a = indice_formacion_recurso_humano_a;
	}
	public double getIndice_formacion_recurso_humano_b() {
		return indice_formacion_recurso_humano_b;
	}
	public void setIndice_formacion_recurso_humano_b(double indice_formacion_recurso_humano_b) {
		this.indice_formacion_recurso_humano_b = indice_formacion_recurso_humano_b;
	}
	public double getIndice_cohesion() {
		return indice_cohesion;
	}
	public void setIndice_cohesion(double indice_cohesion) {
		this.indice_cohesion = indice_cohesion;
	}
	public double getIndice_colaboracion() {
		return indice_colaboracion;
	}
	public void setIndice_colaboracion(double indice_colaboracion) {
		this.indice_colaboracion = indice_colaboracion;
	}
	public String getClasificacion_grupo() {
		return clasificacion_grupo;
	}
	public void setClasificacion_grupo(String clasificacion_grupo) {
		this.clasificacion_grupo = clasificacion_grupo;
	}
	public int getAnos_existencia() {
		return anos_existencia;
	}
	public void setAnos_existencia(int anos_existencia) {
		this.anos_existencia = anos_existencia;
	}
	public int getAno_creacion() {
		return ano_creacion;
	}
	public void setAno_creacion(int ano_creacion) {
		this.ano_creacion = ano_creacion;
	}
	
	
}
