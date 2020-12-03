package com.upeu.app_movilidadoficial.Models;

public class Vacantes {

    public Number idvacante;
    public String uni_anfi;
    public String fecha_inicio;
    public String fecha_fin;
    public String contacto;

    public Number getIdvacante() {
        return idvacante;
    }

    public void setIdvacante(Number idvacante) {
        this.idvacante = idvacante;
    }

    public String getUni_anfi() {
        return uni_anfi;
    }

    public void setUni_anfi(String uni_anfi) {
        this.uni_anfi = uni_anfi;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
}
