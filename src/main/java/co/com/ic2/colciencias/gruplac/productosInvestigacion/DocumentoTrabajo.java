/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ic2.colciencias.gruplac.productosInvestigacion;

import co.com.ic2.colciencias.gruplac.Institucion;
import co.com.ic2.colciencias.gruplac.Investigador;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Clase que representa el producto Working Paper (Documento de trabajo)
 * @author L
 */

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DocumentoTrabajo",namespace = "productosInvestigacion.gruplac.colciencias.ic2.com.co")
public class DocumentoTrabajo extends ProductoInvestigacion{
    
    @XmlElement(name = "ano")
    private int ano;
    @XmlElement(name = "numPaginas")
    private String numPaginas;
    @XmlElement(name = "autores")
    private ArrayList<Investigador> autores;
    @XmlElement(name = "tipo")
    private String tipo;
    @XmlElement(name = "instituciones")
    private ArrayList<Institucion> instituciones;
    @XmlElement(name = "url")
    private String url;
    @XmlElement(name = "doi")
    private String doi;
    
    @XmlElement(name = "numeroAutores")
    private int numeroAutores;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
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

    public ArrayList<Institucion> getInstituciones() {
        return instituciones;
    }

    public void setInstituciones(ArrayList<Institucion> instituciones) {
        this.instituciones = instituciones;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public int getNumeroAutores() {
        return numeroAutores;
    }

    public void setNumeroAutores(int numeroAutores) {
        this.numeroAutores = numeroAutores;
    }
}
