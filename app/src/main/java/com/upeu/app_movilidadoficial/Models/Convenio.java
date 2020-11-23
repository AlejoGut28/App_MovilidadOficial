package com.upeu.app_movilidadoficial.Models;

public class Convenio extends Universidad {
    private Number idconvenio;
    private Number fecha_fin;
    private Number fecha_inicio;
    private String n_documento;
    private Universidad  iduniversidad;

    public Number getIdconvenio() {
        return idconvenio;
    }

    public void setIdconvenio(Number idconvenio) {
        this.idconvenio = idconvenio;
    }

    public Number getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Number fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Number getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Number fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getN_documento() {
        return n_documento;
    }

    public void setN_documento(String n_documento) {
        this.n_documento = n_documento;
    }

    public Universidad getIduniversidad() {
        return iduniversidad;
    }

    public void setIduniversidad(Universidad iduniversidad) {
        this.iduniversidad = iduniversidad;
    }
}
