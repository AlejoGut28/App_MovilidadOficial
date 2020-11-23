package com.upeu.app_movilidadoficial.TokenReceive.api.model;

public class Login {

    private String nombreUsuaro;
    private String password;

    public Login() {
    }

    public Login(String nombreUsuaro, String password) {
        this.nombreUsuaro = nombreUsuaro;
        this.password = password;
    }

    public String getNombreUsuaro() {
        return nombreUsuaro;
    }

    public void setNombreUsuaro(String nombreUsuaro) {
        this.nombreUsuaro = nombreUsuaro;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
