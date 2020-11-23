package com.upeu.app_movilidadoficial.TokenReceive.api.model;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("token")
    private String token;
    @SerializedName("bearer")
    private String bearer;
    @SerializedName("nombreUsuario")
    private String nombreUsuario;
    @SerializedName("authorities")
    private String[] authorities;

    public User() {
    }

    public User(String token, String bearer, String nombreUsuario, String[] authorities) {
        this.token = token;
        this.bearer = bearer;
        this.nombreUsuario = nombreUsuario;
        this.authorities = authorities;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String[] getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String[] authorities) {
        this.authorities = authorities;
    }
}
