/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ic2.colciencias.gruplac.productosInvestigacion;

import co.com.ic2.colciencias.gruplac.Investigador;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Clase que representa el producto Esquema de circuito
 * @author L
 */

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EsquemaCircuito",namespace = "productosInvestigacion.gruplac.colciencias.ic2.com.co")
public class EsquemaCircuito extends ProductoInvestigacion{
    
    @XmlElement(name = "pais")
    private String pais;
    @XmlElement(name = "ano")
    private int ano;
    @XmlElement(name = "disponibilidad")
    private String disponibilidad;
    @XmlElement(name = "institucion")
    private String institucion;
    @XmlElement(name = "autores")
    private ArrayList<Investigador> autores;
    @XmlElement(name = "tipo")
    private String tipo;
    
    @XmlElement(name = "numeroRegistro")
    private String numeroRegistro;
    @XmlElement(name = "contrato")
    private boolean contrato;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public ArrayList<Investigador> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Investigador> autores) {
        this.autores = autores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public boolean isContrato() {
		return contrato;
	}

	public void setContrato(boolean contrato) {
		this.contrato = contrato;
	}   
}

